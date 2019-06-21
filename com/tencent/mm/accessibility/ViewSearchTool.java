package com.tencent.mm.accessibility;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ViewSearchTool
{
  private static final String GET_DEFAULT_IMPL = "getDefault";
  private static final String GET_GLOBAL_INSTANCE = "getInstance";
  private static final String TAG = "ViewSearchTool";
  private static final String VIEWS_FIELD = "mViews";
  private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
  private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
  private static final String WINDOW_PARAMS_FIELD = "mParams";

  private List<View> filter(View paramView, ViewSearchTool.Matcher paramMatcher)
  {
    AppMethodBeat.i(118649);
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(0, Collections.singletonList(paramView));
    Object localObject2;
    Object localObject3;
    for (int i = 0; ; i++)
    {
      paramView = new ArrayList();
      localObject2 = ((List)((List)localObject1).get(i)).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (View)((Iterator)localObject2).next();
        if ((localObject3 instanceof ViewGroup))
          for (int j = 0; j < ((ViewGroup)localObject3).getChildCount(); j++)
            paramView.add(((ViewGroup)localObject3).getChildAt(j));
      }
      if (paramView.isEmpty())
        break;
      ((List)localObject1).add(paramView);
    }
    paramView = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = ((List)((Iterator)localObject1).next()).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (View)((Iterator)localObject3).next();
        if (paramMatcher.match((View)localObject2))
          paramView.add(localObject2);
      }
    }
    AppMethodBeat.o(118649);
    return paramView;
  }

  private List<View> findRoots()
  {
    AppMethodBeat.i(118647);
    Object localObject2;
    label27: Object localObject3;
    if (Build.VERSION.SDK_INT > 16)
    {
      localObject1 = "android.view.WindowManagerGlobal";
      if (Build.VERSION.SDK_INT <= 16)
        break label124;
      localObject2 = "getInstance";
      localObject1 = Class.forName((String)localObject1);
      localObject3 = ((Class)localObject1).getMethod((String)localObject2, new Class[0]).invoke(null, new Object[0]);
      localObject2 = ((Class)localObject1).getDeclaredField("mViews");
      ((Field)localObject2).setAccessible(true);
      ((Class)localObject1).getDeclaredField("mParams").setAccessible(true);
      if (Build.VERSION.SDK_INT >= 19)
        break label130;
    }
    label130: for (Object localObject1 = Arrays.asList((View[])((Field)localObject2).get(localObject3)); ; localObject1 = (List)((Field)localObject2).get(localObject3))
    {
      if (((List)localObject1).size() != 0)
        break label142;
      localObject1 = new RuntimeException("something wrong");
      AppMethodBeat.o(118647);
      throw ((Throwable)localObject1);
      localObject1 = "android.view.WindowManagerImpl";
      break;
      label124: localObject2 = "getDefault";
      break label27;
    }
    label142: AppMethodBeat.o(118647);
    return localObject1;
  }

  @Deprecated
  public static String findText(View paramView)
  {
    AppMethodBeat.i(118650);
    if (paramView == null)
    {
      AppMethodBeat.o(118650);
      paramView = null;
    }
    while (true)
    {
      return paramView;
      Object localObject = paramView.getContentDescription();
      if (localObject == null)
      {
        if ((paramView instanceof ViewGroup))
        {
          ViewGroup localViewGroup = (ViewGroup)paramView;
          int i = localViewGroup.getChildCount();
          int j = 0;
          for (paramView = (View)localObject; ; paramView = (View)localObject)
          {
            localObject = paramView;
            if (j >= i)
              break;
            View localView = localViewGroup.getChildAt(j);
            localObject = paramView;
            if (localView != null)
              if (!(localView instanceof ViewGroup))
              {
                localObject = paramView;
                if (!(localView instanceof TextView));
              }
              else
              {
                paramView = findText(localView);
                localObject = paramView;
                if (paramView != null)
                  break;
                localObject = paramView;
              }
            j++;
          }
        }
        if ((paramView instanceof TextView))
          localObject = ((TextView)paramView).getText();
        if (localObject != null)
        {
          paramView = ((CharSequence)localObject).toString();
          AppMethodBeat.o(118650);
        }
      }
      else
      {
        paramView = ((CharSequence)localObject).toString();
        AppMethodBeat.o(118650);
        continue;
        AppMethodBeat.o(118650);
        paramView = null;
      }
    }
  }

  @Deprecated
  public static String findViewDepth(View paramView1, View paramView2, String paramString)
  {
    AppMethodBeat.i(118651);
    if ((paramView1 == null) || (paramView2 == null))
    {
      AppMethodBeat.o(118651);
      paramView1 = null;
    }
    while (true)
    {
      return paramView1;
      String str = paramString;
      if (paramString == null)
        str = "";
      if (paramView1.equals(paramView2))
      {
        paramView1 = str;
        if (str.startsWith("_"))
          paramView1 = str.substring(1);
        AppMethodBeat.o(118651);
      }
      else
      {
        if ((paramView1 instanceof ViewGroup))
        {
          paramView1 = (ViewGroup)paramView1;
          int i = paramView1.getChildCount();
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label171;
            paramString = findViewDepth(paramView1.getChildAt(j), paramView2, str + "_" + j);
            if ((paramString != null) && (!paramString.equals("")))
            {
              paramView1 = paramString;
              if (paramString.startsWith("_"))
                paramView1 = paramString.substring(1);
              AppMethodBeat.o(118651);
              break;
            }
          }
        }
        label171: AppMethodBeat.o(118651);
        paramView1 = null;
      }
    }
  }

  public List<View> findView(ViewSearchTool.Matcher paramMatcher)
  {
    AppMethodBeat.i(118648);
    Iterator localIterator = findRoots().iterator();
    while (localIterator.hasNext())
    {
      List localList = filter((View)localIterator.next(), paramMatcher);
      if ((localList != null) && (localList.size() > 0))
      {
        AppMethodBeat.o(118648);
        paramMatcher = localList;
      }
    }
    while (true)
    {
      return paramMatcher;
      paramMatcher = null;
      AppMethodBeat.o(118648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.ViewSearchTool
 * JD-Core Version:    0.6.2
 */