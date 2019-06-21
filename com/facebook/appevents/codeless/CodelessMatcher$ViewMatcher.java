package com.facebook.appevents.codeless;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CodelessMatcher$ViewMatcher
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable
{
  private final String activityName;
  private HashMap<String, String> delegateMap;
  private List<EventBinding> eventBindings;
  private final Handler handler;
  private WeakReference<View> rootView;

  public CodelessMatcher$ViewMatcher(View paramView, Handler paramHandler, HashMap<String, String> paramHashMap, String paramString)
  {
    AppMethodBeat.i(72050);
    this.rootView = new WeakReference(paramView);
    this.handler = paramHandler;
    this.delegateMap = paramHashMap;
    this.activityName = paramString;
    this.handler.postDelayed(this, 200L);
    AppMethodBeat.o(72050);
  }

  private void attachListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    AppMethodBeat.i(72059);
    if (paramEventBinding == null)
      AppMethodBeat.o(72059);
    while (true)
    {
      return;
      try
      {
        View localView = paramMatchedView.getView();
        if (localView == null)
        {
          AppMethodBeat.o(72059);
        }
        else if (ViewHierarchy.isRCTButton(localView))
        {
          attachRCTListener(paramMatchedView, paramView, paramEventBinding);
          AppMethodBeat.o(72059);
        }
        else
        {
          paramMatchedView = paramMatchedView.getViewMapKey();
          View.AccessibilityDelegate localAccessibilityDelegate = ViewHierarchy.getExistingDelegate(localView);
          int i;
          label77: int j;
          if (localAccessibilityDelegate != null)
          {
            i = 1;
            if ((i == 0) || (!(localAccessibilityDelegate instanceof CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate)))
              break label177;
            j = 1;
            label93: if ((j == 0) || (!((CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate)localAccessibilityDelegate).getSupportCodelessLogging()))
              break label183;
          }
          label177: label183: for (int k = 1; ; k = 0)
          {
            if ((!this.delegateMap.containsKey(paramMatchedView)) && ((i == 0) || (j == 0) || (k == 0)))
            {
              localView.setAccessibilityDelegate(CodelessLoggingEventListener.getAccessibilityDelegate(paramEventBinding, paramView, localView));
              this.delegateMap.put(paramMatchedView, paramEventBinding.getEventName());
            }
            AppMethodBeat.o(72059);
            break;
            i = 0;
            break label77;
            j = 0;
            break label93;
          }
        }
      }
      catch (FacebookException paramMatchedView)
      {
        CodelessMatcher.access$100();
        AppMethodBeat.o(72059);
      }
    }
  }

  private void attachRCTListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    AppMethodBeat.i(72060);
    if (paramEventBinding == null)
      AppMethodBeat.o(72060);
    View localView;
    while (true)
    {
      return;
      localView = paramMatchedView.getView();
      if ((localView != null) && (ViewHierarchy.isRCTButton(localView)))
        break;
      AppMethodBeat.o(72060);
    }
    String str = paramMatchedView.getViewMapKey();
    paramMatchedView = ViewHierarchy.getExistingOnTouchListener(localView);
    int i;
    label61: int j;
    if (paramMatchedView != null)
    {
      i = 1;
      if ((i == 0) || (!(paramMatchedView instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener)))
        break label161;
      j = 1;
      label76: if ((j == 0) || (!((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener)paramMatchedView).getSupportCodelessLogging()))
        break label167;
    }
    label161: label167: for (int k = 1; ; k = 0)
    {
      if ((!this.delegateMap.containsKey(str)) && ((i == 0) || (j == 0) || (k == 0)))
      {
        localView.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(paramEventBinding, paramView, localView));
        this.delegateMap.put(str, paramEventBinding.getEventName());
      }
      AppMethodBeat.o(72060);
      break;
      i = 0;
      break label61;
      j = 0;
      break label76;
    }
  }

  public static List<CodelessMatcher.MatchedView> findViewByPath(EventBinding paramEventBinding, View paramView, List<PathComponent> paramList, int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(72056);
    String str = paramString + "." + String.valueOf(paramInt2);
    paramString = new ArrayList();
    if (paramView == null)
      AppMethodBeat.o(72056);
    while (true)
    {
      return paramString;
      if (paramInt1 >= paramList.size())
        paramString.add(new CodelessMatcher.MatchedView(paramView, str));
      while (true)
      {
        if (!(paramView instanceof ViewGroup))
          break label361;
        paramView = findVisibleChildren((ViewGroup)paramView);
        i = paramView.size();
        for (paramInt2 = j; paramInt2 < i; paramInt2++)
          paramString.addAll(findViewByPath(paramEventBinding, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, str));
        PathComponent localPathComponent = (PathComponent)paramList.get(paramInt1);
        if (localPathComponent.className.equals(".."))
        {
          paramView = paramView.getParent();
          if ((paramView instanceof ViewGroup))
          {
            paramView = findVisibleChildren((ViewGroup)paramView);
            j = paramView.size();
            for (paramInt2 = i; paramInt2 < j; paramInt2++)
              paramString.addAll(findViewByPath(paramEventBinding, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, str));
          }
          AppMethodBeat.o(72056);
          break;
        }
        if (localPathComponent.className.equals("."))
        {
          paramString.add(new CodelessMatcher.MatchedView(paramView, str));
          AppMethodBeat.o(72056);
          break;
        }
        if (!isTheSameView(paramView, localPathComponent, paramInt2))
        {
          AppMethodBeat.o(72056);
          break;
        }
        if (paramInt1 == paramList.size() - 1)
          paramString.add(new CodelessMatcher.MatchedView(paramView, str));
      }
      label361: AppMethodBeat.o(72056);
    }
  }

  private static List<View> findVisibleChildren(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(72058);
    ArrayList localArrayList = new ArrayList();
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (localView.getVisibility() == 0)
        localArrayList.add(localView);
    }
    AppMethodBeat.o(72058);
    return localArrayList;
  }

  private static boolean isTheSameView(View paramView, PathComponent paramPathComponent, int paramInt)
  {
    AppMethodBeat.i(72057);
    boolean bool;
    if ((paramPathComponent.index != -1) && (paramInt != paramPathComponent.index))
    {
      AppMethodBeat.o(72057);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject;
      if (!paramView.getClass().getCanonicalName().equals(paramPathComponent.className))
      {
        if (paramPathComponent.className.matches(".*android\\..*"))
        {
          localObject = paramPathComponent.className.split("\\.");
          if (localObject.length > 0)
          {
            localObject = localObject[(localObject.length - 1)];
            if (!paramView.getClass().getSimpleName().equals(localObject))
            {
              AppMethodBeat.o(72057);
              bool = false;
            }
          }
          else
          {
            AppMethodBeat.o(72057);
            bool = false;
          }
        }
        else
        {
          AppMethodBeat.o(72057);
          bool = false;
        }
      }
      else if (((paramPathComponent.matchBitmask & PathComponent.MatchBitmaskType.ID.getValue()) > 0) && (paramPathComponent.id != paramView.getId()))
      {
        AppMethodBeat.o(72057);
        bool = false;
      }
      else if (((paramPathComponent.matchBitmask & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) && (!paramPathComponent.text.equals(ViewHierarchy.getTextOfView(paramView))))
      {
        AppMethodBeat.o(72057);
        bool = false;
      }
      else
      {
        if ((paramPathComponent.matchBitmask & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0)
        {
          String str = paramPathComponent.description;
          if (paramView.getContentDescription() == null);
          for (localObject = ""; ; localObject = String.valueOf(paramView.getContentDescription()))
          {
            if (str.equals(localObject))
              break label268;
            AppMethodBeat.o(72057);
            bool = false;
            break;
          }
        }
        label268: if (((paramPathComponent.matchBitmask & PathComponent.MatchBitmaskType.HINT.getValue()) > 0) && (!paramPathComponent.hint.equals(ViewHierarchy.getHintOfView(paramView))))
        {
          AppMethodBeat.o(72057);
          bool = false;
        }
        else
        {
          if ((paramPathComponent.matchBitmask & PathComponent.MatchBitmaskType.TAG.getValue()) > 0)
          {
            paramPathComponent = paramPathComponent.tag;
            if (paramView.getTag() == null);
            for (paramView = ""; ; paramView = String.valueOf(paramView.getTag()))
            {
              if (paramPathComponent.equals(paramView))
                break label365;
              AppMethodBeat.o(72057);
              bool = false;
              break;
            }
          }
          label365: bool = true;
          AppMethodBeat.o(72057);
        }
      }
    }
  }

  private void startMatch()
  {
    AppMethodBeat.i(72054);
    if ((this.eventBindings != null) && (this.rootView.get() != null))
      for (int i = 0; i < this.eventBindings.size(); i++)
        findView((EventBinding)this.eventBindings.get(i), (View)this.rootView.get());
    AppMethodBeat.o(72054);
  }

  public void findView(EventBinding paramEventBinding, View paramView)
  {
    AppMethodBeat.i(72055);
    if ((paramEventBinding == null) || (paramView == null))
      AppMethodBeat.o(72055);
    while (true)
    {
      return;
      if ((!TextUtils.isEmpty(paramEventBinding.getActivityName())) && (!paramEventBinding.getActivityName().equals(this.activityName)))
      {
        AppMethodBeat.o(72055);
      }
      else
      {
        Object localObject = paramEventBinding.getViewPath();
        if (((List)localObject).size() > 25)
        {
          AppMethodBeat.o(72055);
        }
        else
        {
          localObject = findViewByPath(paramEventBinding, paramView, (List)localObject, 0, -1, this.activityName).iterator();
          while (((Iterator)localObject).hasNext())
            attachListener((CodelessMatcher.MatchedView)((Iterator)localObject).next(), paramView, paramEventBinding);
          AppMethodBeat.o(72055);
        }
      }
    }
  }

  public void onGlobalLayout()
  {
    AppMethodBeat.i(72052);
    startMatch();
    AppMethodBeat.o(72052);
  }

  public void onScrollChanged()
  {
    AppMethodBeat.i(72053);
    startMatch();
    AppMethodBeat.o(72053);
  }

  public void run()
  {
    AppMethodBeat.i(72051);
    Object localObject = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    if ((localObject == null) || (!((FetchedAppSettings)localObject).getCodelessEventsEnabled()))
      AppMethodBeat.o(72051);
    while (true)
    {
      return;
      this.eventBindings = EventBinding.parseArray(((FetchedAppSettings)localObject).getEventBindings());
      if (this.eventBindings != null)
      {
        localObject = (View)this.rootView.get();
        if (localObject == null)
        {
          AppMethodBeat.o(72051);
        }
        else
        {
          localObject = ((View)localObject).getViewTreeObserver();
          if (((ViewTreeObserver)localObject).isAlive())
          {
            ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
            ((ViewTreeObserver)localObject).addOnScrollChangedListener(this);
          }
          startMatch();
        }
      }
      else
      {
        AppMethodBeat.o(72051);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher
 * JD-Core Version:    0.6.2
 */