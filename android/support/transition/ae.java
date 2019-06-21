package android.support.transition;

import android.support.v4.f.a;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae
{
  private static Transition Aq = new AutoTransition();
  private static ThreadLocal<WeakReference<a<ViewGroup, ArrayList<Transition>>>> Ar = new ThreadLocal();
  private static ArrayList<ViewGroup> As = new ArrayList();

  public static void a(ViewGroup paramViewGroup, Transition paramTransition)
  {
    if ((!As.contains(paramViewGroup)) && (s.as(paramViewGroup)))
    {
      As.add(paramViewGroup);
      Object localObject = paramTransition;
      if (paramTransition == null)
        localObject = Aq;
      paramTransition = ((Transition)localObject).cY();
      localObject = (ArrayList)cZ().get(paramViewGroup);
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
          ((Transition)((Iterator)localObject).next()).F(paramViewGroup);
      }
      if (paramTransition != null)
        paramTransition.b(paramViewGroup, true);
      localObject = aa.B(paramViewGroup);
      if ((localObject != null) && (aa.B(((aa)localObject).zk) == localObject) && (((aa)localObject).zl != null))
        ((aa)localObject).zl.run();
      paramViewGroup.setTag(2131820680, null);
      if ((paramTransition != null) && (paramViewGroup != null))
      {
        paramTransition = new a(paramTransition, paramViewGroup);
        paramViewGroup.addOnAttachStateChangeListener(paramTransition);
        paramViewGroup.getViewTreeObserver().addOnPreDrawListener(paramTransition);
      }
    }
  }

  static a<ViewGroup, ArrayList<Transition>> cZ()
  {
    WeakReference localWeakReference1 = (WeakReference)Ar.get();
    WeakReference localWeakReference2;
    if (localWeakReference1 != null)
    {
      localWeakReference2 = localWeakReference1;
      if (localWeakReference1.get() != null);
    }
    else
    {
      localWeakReference2 = new WeakReference(new a());
      Ar.set(localWeakReference2);
    }
    return (a)localWeakReference2.get();
  }

  static final class a
    implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
  {
    Transition Ap;
    ViewGroup zk;

    a(Transition paramTransition, ViewGroup paramViewGroup)
    {
      this.Ap = paramTransition;
      this.zk = paramViewGroup;
    }

    private void db()
    {
      this.zk.getViewTreeObserver().removeOnPreDrawListener(this);
      this.zk.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw()
    {
      db();
      if (!ae.da().remove(this.zk));
      while (true)
      {
        return true;
        a locala = ae.cZ();
        ArrayList localArrayList1 = (ArrayList)locala.get(this.zk);
        ArrayList localArrayList2 = null;
        Object localObject;
        if (localArrayList1 == null)
        {
          localObject = new ArrayList();
          locala.put(this.zk, localObject);
        }
        while (true)
        {
          ((ArrayList)localObject).add(this.Ap);
          this.Ap.a(new ae.a.1(this, locala));
          this.Ap.b(this.zk, false);
          if (localArrayList2 == null)
            break;
          localObject = localArrayList2.iterator();
          while (((Iterator)localObject).hasNext())
            ((Transition)((Iterator)localObject).next()).G(this.zk);
          localObject = localArrayList1;
          if (localArrayList1.size() > 0)
          {
            localArrayList2 = new ArrayList(localArrayList1);
            localObject = localArrayList1;
          }
        }
        this.Ap.b(this.zk);
      }
    }

    public final void onViewAttachedToWindow(View paramView)
    {
    }

    public final void onViewDetachedFromWindow(View paramView)
    {
      db();
      ae.da().remove(this.zk);
      paramView = (ArrayList)ae.cZ().get(this.zk);
      if ((paramView != null) && (paramView.size() > 0))
      {
        paramView = paramView.iterator();
        while (paramView.hasNext())
          ((Transition)paramView.next()).G(this.zk);
      }
      this.Ap.v(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.ae
 * JD-Core Version:    0.6.2
 */