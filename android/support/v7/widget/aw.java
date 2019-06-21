package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class aw extends RecyclerView.k
{
  RecyclerView aiB;
  private final RecyclerView.m anZ = new aw.1(this);
  private Scroller arO;

  public abstract int a(RecyclerView.i parami, int paramInt1, int paramInt2);

  public abstract View a(RecyclerView.i parami);

  public abstract int[] a(RecyclerView.i parami, View paramView);

  public final boolean aE(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    RecyclerView.i locali = this.aiB.getLayoutManager();
    boolean bool2;
    if (locali == null)
      bool2 = bool1;
    int i;
    do
    {
      do
      {
        return bool2;
        bool2 = bool1;
      }
      while (this.aiB.getAdapter() == null);
      i = this.aiB.getMinFlingVelocity();
      if (Math.abs(paramInt2) > i)
        break;
      bool2 = bool1;
    }
    while (Math.abs(paramInt1) <= i);
    if (!(locali instanceof RecyclerView.r.b))
      paramInt1 = 0;
    while (true)
    {
      bool2 = bool1;
      if (paramInt1 == 0)
        break;
      bool2 = true;
      break;
      RecyclerView.r localr = g(locali);
      if (localr == null)
      {
        paramInt1 = 0;
      }
      else
      {
        paramInt1 = a(locali, paramInt1, paramInt2);
        if (paramInt1 == -1)
        {
          paramInt1 = 0;
        }
        else
        {
          localr.ape = paramInt1;
          locali.a(localr);
          paramInt1 = 1;
        }
      }
    }
  }

  public final int[] aJ(int paramInt1, int paramInt2)
  {
    this.arO.fling(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
    return new int[] { this.arO.getFinalX(), this.arO.getFinalY() };
  }

  @Deprecated
  protected ah f(RecyclerView.i parami)
  {
    if (!(parami instanceof RecyclerView.r.b));
    for (parami = null; ; parami = new ah(this.aiB.getContext())
    {
      protected final void a(View paramAnonymousView, RecyclerView.r.a paramAnonymousa)
      {
        if (aw.this.aiB == null);
        while (true)
        {
          return;
          paramAnonymousView = aw.this.a(aw.this.aiB.getLayoutManager(), paramAnonymousView);
          int i = paramAnonymousView[0];
          int j = paramAnonymousView[1];
          int k = ca(Math.max(Math.abs(i), Math.abs(j)));
          if (k > 0)
            paramAnonymousa.a(i, j, k, this.Sf);
        }
      }

      protected final float c(DisplayMetrics paramAnonymousDisplayMetrics)
      {
        return 100.0F / paramAnonymousDisplayMetrics.densityDpi;
      }
    })
      return parami;
  }

  protected RecyclerView.r g(RecyclerView.i parami)
  {
    return f(parami);
  }

  public final void i(RecyclerView paramRecyclerView)
  {
    if (this.aiB == paramRecyclerView);
    while (true)
    {
      return;
      if (this.aiB != null)
      {
        this.aiB.b(this.anZ);
        this.aiB.setOnFlingListener(null);
      }
      this.aiB = paramRecyclerView;
      if (this.aiB != null)
      {
        if (this.aiB.getOnFlingListener() != null)
          throw new IllegalStateException("An instance of OnFlingListener already set.");
        this.aiB.a(this.anZ);
        this.aiB.setOnFlingListener(this);
        this.arO = new Scroller(this.aiB.getContext(), new DecelerateInterpolator());
        kR();
      }
    }
  }

  final void kR()
  {
    if (this.aiB == null);
    while (true)
    {
      return;
      Object localObject = this.aiB.getLayoutManager();
      if (localObject != null)
      {
        View localView = a((RecyclerView.i)localObject);
        if (localView != null)
        {
          localObject = a((RecyclerView.i)localObject, localView);
          if ((localObject[0] != 0) || (localObject[1] != 0))
            this.aiB.a(localObject[0], localObject[1], null);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.aw
 * JD-Core Version:    0.6.2
 */