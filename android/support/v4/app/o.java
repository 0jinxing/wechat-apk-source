package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class o extends p
{
  private static boolean a(Transition paramTransition)
  {
    if ((!h(paramTransition.getTargetIds())) || (!h(paramTransition.getTargetNames())) || (!h(paramTransition.getTargetTypes())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Object a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    if (paramObject1 != null)
      localTransitionSet.addTransition((Transition)paramObject1);
    if (paramObject2 != null)
      localTransitionSet.addTransition((Transition)paramObject2);
    if (paramObject3 != null)
      localTransitionSet.addTransition((Transition)paramObject3);
    return localTransitionSet;
  }

  public final void a(ViewGroup paramViewGroup, Object paramObject)
  {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }

  public final void a(Object paramObject, final Rect paramRect)
  {
    if (paramObject != null)
      ((Transition)paramObject).setEpicenterCallback(new Transition.EpicenterCallback()
      {
        public final Rect onGetEpicenter(Transition paramAnonymousTransition)
        {
          if ((paramRect == null) || (paramRect.isEmpty()));
          for (paramAnonymousTransition = null; ; paramAnonymousTransition = paramRect)
            return paramAnonymousTransition;
        }
      });
  }

  public final void a(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      final Rect localRect = new Rect();
      b(paramView, localRect);
      paramObject.setEpicenterCallback(new Transition.EpicenterCallback()
      {
        public final Rect onGetEpicenter(Transition paramAnonymousTransition)
        {
          return localRect;
        }
      });
    }
  }

  public final void a(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    TransitionSet localTransitionSet = (TransitionSet)paramObject;
    paramObject = localTransitionSet.getTargets();
    paramObject.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      a(paramObject, (View)paramArrayList.get(j));
    paramObject.add(paramView);
    paramArrayList.add(paramView);
    a(localTransitionSet, paramArrayList);
  }

  public final void a(Object paramObject1, final Object paramObject2, final ArrayList<View> paramArrayList1, final Object paramObject3, final ArrayList<View> paramArrayList2, final Object paramObject4, final ArrayList<View> paramArrayList3)
  {
    ((Transition)paramObject1).addListener(new Transition.TransitionListener()
    {
      public final void onTransitionCancel(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionEnd(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionPause(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionResume(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionStart(Transition paramAnonymousTransition)
      {
        if (paramObject2 != null)
          o.this.b(paramObject2, paramArrayList1, null);
        if (paramObject3 != null)
          o.this.b(paramObject3, paramArrayList2, null);
        if (paramObject4 != null)
          o.this.b(paramObject4, paramArrayList3, null);
      }
    });
  }

  public final void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    int i = 0;
    paramObject = (Transition)paramObject;
    if (paramObject == null);
    while (true)
    {
      return;
      int j;
      if ((paramObject instanceof TransitionSet))
      {
        paramObject = (TransitionSet)paramObject;
        j = paramObject.getTransitionCount();
        while (i < j)
        {
          a(paramObject.getTransitionAt(i), paramArrayList);
          i++;
        }
      }
      else if ((!a(paramObject)) && (h(paramObject.getTargets())))
      {
        j = paramArrayList.size();
        for (i = 0; i < j; i++)
          paramObject.addTarget((View)paramArrayList.get(i));
      }
    }
  }

  public final void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      paramObject.getTargets().clear();
      paramObject.getTargets().addAll(paramArrayList2);
      b(paramObject, paramArrayList1, paramArrayList2);
    }
  }

  public final Object b(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Object localObject = null;
    paramObject1 = (Transition)paramObject1;
    paramObject2 = (Transition)paramObject2;
    paramObject3 = (Transition)paramObject3;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      paramObject1 = new TransitionSet().addTransition(paramObject1).addTransition(paramObject2).setOrdering(1);
      if (paramObject3 == null)
        break label97;
      paramObject2 = new TransitionSet();
      if (paramObject1 != null)
        paramObject2.addTransition(paramObject1);
      paramObject2.addTransition(paramObject3);
      paramObject1 = paramObject2;
    }
    label97: 
    while (true)
    {
      return paramObject1;
      if (paramObject1 != null)
        break;
      paramObject1 = localObject;
      if (paramObject2 == null)
        break;
      paramObject1 = paramObject2;
      break;
    }
  }

  public final void b(Object paramObject, View paramView)
  {
    if (paramObject != null)
      ((Transition)paramObject).addTarget(paramView);
  }

  public final void b(Object paramObject, final View paramView, final ArrayList<View> paramArrayList)
  {
    ((Transition)paramObject).addListener(new Transition.TransitionListener()
    {
      public final void onTransitionCancel(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionEnd(Transition paramAnonymousTransition)
      {
        paramAnonymousTransition.removeListener(this);
        paramView.setVisibility(8);
        int i = paramArrayList.size();
        for (int j = 0; j < i; j++)
          ((View)paramArrayList.get(j)).setVisibility(0);
      }

      public final void onTransitionPause(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionResume(Transition paramAnonymousTransition)
      {
      }

      public final void onTransitionStart(Transition paramAnonymousTransition)
      {
      }
    });
  }

  public final void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    int i = 0;
    Transition localTransition = (Transition)paramObject;
    int j;
    if ((localTransition instanceof TransitionSet))
    {
      paramObject = (TransitionSet)localTransition;
      j = paramObject.getTransitionCount();
      while (i < j)
      {
        b(paramObject.getTransitionAt(i), paramArrayList1, paramArrayList2);
        i++;
      }
    }
    if (!a(localTransition))
    {
      paramObject = localTransition.getTargets();
      if ((paramObject != null) && (paramObject.size() == paramArrayList1.size()) && (paramObject.containsAll(paramArrayList1)))
      {
        if (paramArrayList2 == null);
        for (i = 0; ; i = paramArrayList2.size())
          for (j = 0; j < i; j++)
            localTransition.addTarget((View)paramArrayList2.get(j));
        for (i = paramArrayList1.size() - 1; i >= 0; i--)
          localTransition.removeTarget((View)paramArrayList1.get(i));
      }
    }
  }

  public final void c(Object paramObject, View paramView)
  {
    if (paramObject != null)
      ((Transition)paramObject).removeTarget(paramView);
  }

  public final boolean j(Object paramObject)
  {
    return paramObject instanceof Transition;
  }

  public final Object k(Object paramObject)
  {
    Transition localTransition = null;
    if (paramObject != null)
      localTransition = ((Transition)paramObject).clone();
    return localTransition;
  }

  public final Object l(Object paramObject)
  {
    if (paramObject == null);
    TransitionSet localTransitionSet;
    for (paramObject = null; ; paramObject = localTransitionSet)
    {
      return paramObject;
      localTransitionSet = new TransitionSet();
      localTransitionSet.addTransition((Transition)paramObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.o
 * JD-Core Version:    0.6.2
 */