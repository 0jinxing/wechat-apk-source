package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition
{
  ArrayList<Transition> Av = new ArrayList();
  private boolean Aw = true;
  private int Ax;
  private boolean mStarted = false;

  public TransitionSet()
  {
  }

  public TransitionSet(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zE);
    ao(c.a(paramContext, (XmlResourceParser)paramAttributeSet, "transitionOrdering", 0, 0));
    paramContext.recycle();
  }

  public final void F(View paramView)
  {
    super.F(paramView);
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      ((Transition)this.Av.get(j)).F(paramView);
  }

  public final void G(View paramView)
  {
    super.G(paramView);
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      ((Transition)this.Av.get(j)).G(paramView);
  }

  public final void a(Transition.b paramb)
  {
    super.a(paramb);
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      ((Transition)this.Av.get(j)).a(paramb);
  }

  public final void a(af paramaf)
  {
    super.a(paramaf);
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      ((Transition)this.Av.get(j)).a(paramaf);
  }

  public final void a(ah paramah)
  {
    if (C(paramah.view))
    {
      Iterator localIterator = this.Av.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.C(paramah.view))
        {
          localTransition.a(paramah);
          paramah.AD.add(localTransition);
        }
      }
    }
  }

  protected final void a(ViewGroup paramViewGroup, ai paramai1, ai paramai2, ArrayList<ah> paramArrayList1, ArrayList<ah> paramArrayList2)
  {
    long l1 = this.zJ;
    int i = this.Av.size();
    int j = 0;
    if (j < i)
    {
      Transition localTransition = (Transition)this.Av.get(j);
      if ((l1 > 0L) && ((this.Aw) || (j == 0)))
      {
        long l2 = localTransition.zJ;
        if (l2 <= 0L)
          break label101;
        localTransition.h(l2 + l1);
      }
      while (true)
      {
        localTransition.a(paramViewGroup, paramai1, paramai2, paramArrayList1, paramArrayList2);
        j++;
        break;
        label101: localTransition.h(l1);
      }
    }
  }

  public final TransitionSet ao(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(paramInt)));
    case 1:
    case 0:
    }
    for (this.Aw = false; ; this.Aw = true)
      return this;
  }

  public final Transition ap(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.Av.size()));
    for (Transition localTransition = null; ; localTransition = (Transition)this.Av.get(paramInt))
      return localTransition;
  }

  public final TransitionSet b(TimeInterpolator paramTimeInterpolator)
  {
    return (TransitionSet)super.a(paramTimeInterpolator);
  }

  public final void b(ah paramah)
  {
    if (C(paramah.view))
    {
      Iterator localIterator = this.Av.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.C(paramah.view))
        {
          localTransition.b(paramah);
          paramah.AD.add(localTransition);
        }
      }
    }
  }

  protected final void cX()
  {
    if (this.Av.isEmpty())
    {
      start();
      end();
    }
    while (true)
    {
      return;
      TransitionSet.a locala = new TransitionSet.a(this);
      Object localObject = this.Av.iterator();
      while (((Iterator)localObject).hasNext())
        ((Transition)((Iterator)localObject).next()).a(locala);
      this.Ax = this.Av.size();
      if (!this.Aw)
      {
        for (int i = 1; i < this.Av.size(); i++)
          ((Transition)this.Av.get(i - 1)).a(new TransitionSet.1(this, (Transition)this.Av.get(i)));
        localObject = (Transition)this.Av.get(0);
        if (localObject != null)
          ((Transition)localObject).cX();
      }
      else
      {
        localObject = this.Av.iterator();
        while (((Iterator)localObject).hasNext())
          ((Transition)((Iterator)localObject).next()).cX();
      }
    }
  }

  public final Transition cY()
  {
    TransitionSet localTransitionSet = (TransitionSet)super.cY();
    localTransitionSet.Av = new ArrayList();
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      localTransitionSet.d(((Transition)this.Av.get(j)).cY());
    return localTransitionSet;
  }

  public final TransitionSet d(Transition paramTransition)
  {
    this.Av.add(paramTransition);
    paramTransition.zY = this;
    if (this.mDuration >= 0L)
      paramTransition.g(this.mDuration);
    return this;
  }

  final void d(ah paramah)
  {
    super.d(paramah);
    int i = this.Av.size();
    for (int j = 0; j < i; j++)
      ((Transition)this.Av.get(j)).d(paramah);
  }

  public final TransitionSet i(long paramLong)
  {
    super.g(paramLong);
    if (this.mDuration >= 0L)
    {
      int i = this.Av.size();
      for (int j = 0; j < i; j++)
        ((Transition)this.Av.get(j)).g(paramLong);
    }
    return this;
  }

  final String toString(String paramString)
  {
    String str = super.toString(paramString);
    for (int i = 0; i < this.Av.size(); i++)
      str = str + "\n" + ((Transition)this.Av.get(i)).toString(new StringBuilder().append(paramString).append("  ").toString());
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.TransitionSet
 * JD-Core Version:    0.6.2
 */