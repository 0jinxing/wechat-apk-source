package android.support.transition;

import android.graphics.Rect;
import android.support.v4.app.p;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class g extends p
{
  private static boolean b(Transition paramTransition)
  {
    if ((!h(paramTransition.zL)) || (!h(paramTransition.zN)) || (!h(paramTransition.zO)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Object a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    if (paramObject1 != null)
      localTransitionSet.d((Transition)paramObject1);
    if (paramObject2 != null)
      localTransitionSet.d((Transition)paramObject2);
    if (paramObject3 != null)
      localTransitionSet.d((Transition)paramObject3);
    return localTransitionSet;
  }

  public final void a(ViewGroup paramViewGroup, Object paramObject)
  {
    ae.a(paramViewGroup, (Transition)paramObject);
  }

  public final void a(Object paramObject, Rect paramRect)
  {
    if (paramObject != null)
      ((Transition)paramObject).a(new g.4(this, paramRect));
  }

  public final void a(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      Transition localTransition = (Transition)paramObject;
      paramObject = new Rect();
      b(paramView, paramObject);
      localTransition.a(new g.1(this, paramObject));
    }
  }

  public final void a(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    ArrayList localArrayList = paramObject.zM;
    localArrayList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      a(localArrayList, (View)paramArrayList.get(j));
    localArrayList.add(paramView);
    paramArrayList.add(paramView);
    a(paramObject, paramArrayList);
  }

  public final void a(Object paramObject1, final Object paramObject2, final ArrayList<View> paramArrayList1, final Object paramObject3, final ArrayList<View> paramArrayList2, final Object paramObject4, final ArrayList<View> paramArrayList3)
  {
    ((Transition)paramObject1).a(new Transition.c()
    {
      public final void a(Transition paramAnonymousTransition)
      {
      }

      public final void cO()
      {
      }

      public final void cP()
      {
      }

      public final void cT()
      {
        if (paramObject2 != null)
          g.this.b(paramObject2, paramArrayList1, null);
        if (paramObject3 != null)
          g.this.b(paramObject3, paramArrayList2, null);
        if (paramObject4 != null)
          g.this.b(paramObject4, paramArrayList3, null);
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
        j = paramObject.Av.size();
        while (i < j)
        {
          a(paramObject.ap(i), paramArrayList);
          i++;
        }
      }
      else if ((!b(paramObject)) && (h(paramObject.zM)))
      {
        j = paramArrayList.size();
        for (i = 0; i < j; i++)
          paramObject.D((View)paramArrayList.get(i));
      }
    }
  }

  public final void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      paramObject.zM.clear();
      paramObject.zM.addAll(paramArrayList2);
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
      paramObject1 = new TransitionSet().d(paramObject1).d(paramObject2).ao(1);
      if (paramObject3 == null)
        break label97;
      paramObject2 = new TransitionSet();
      if (paramObject1 != null)
        paramObject2.d(paramObject1);
      paramObject2.d(paramObject3);
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
      ((Transition)paramObject).D(paramView);
  }

  public final void b(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    ((Transition)paramObject).a(new g.2(this, paramView, paramArrayList));
  }

  public final void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    int i = 0;
    Transition localTransition = (Transition)paramObject;
    int j;
    if ((localTransition instanceof TransitionSet))
    {
      paramObject = (TransitionSet)localTransition;
      j = paramObject.Av.size();
      while (i < j)
      {
        b(paramObject.ap(i), paramArrayList1, paramArrayList2);
        i++;
      }
    }
    if (!b(localTransition))
    {
      paramObject = localTransition.zM;
      if ((paramObject.size() == paramArrayList1.size()) && (paramObject.containsAll(paramArrayList1)))
      {
        if (paramArrayList2 == null);
        for (i = 0; ; i = paramArrayList2.size())
          for (j = 0; j < i; j++)
            localTransition.D((View)paramArrayList2.get(j));
        for (i = paramArrayList1.size() - 1; i >= 0; i--)
          localTransition.E((View)paramArrayList1.get(i));
      }
    }
  }

  public final void c(Object paramObject, View paramView)
  {
    if (paramObject != null)
      ((Transition)paramObject).E(paramView);
  }

  public final boolean j(Object paramObject)
  {
    return paramObject instanceof Transition;
  }

  public final Object k(Object paramObject)
  {
    Transition localTransition = null;
    if (paramObject != null)
      localTransition = ((Transition)paramObject).cY();
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
      localTransitionSet.d((Transition)paramObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.g
 * JD-Core Version:    0.6.2
 */