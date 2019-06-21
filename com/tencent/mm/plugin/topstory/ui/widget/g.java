package com.tencent.mm.plugin.topstory.ui.widget;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.r.b;
import android.support.v7.widget.ah;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class g extends RecyclerView.k
{
  public RecyclerView aiB;
  private final RecyclerView.m anZ = new g.1(this);
  protected Scroller arO;

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
      ah localah = f(locali);
      if (localah == null)
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
          localah.ape = paramInt1;
          locali.a(localah);
          paramInt1 = 1;
        }
      }
    }
  }

  @Deprecated
  protected ah f(RecyclerView.i parami)
  {
    if (!(parami instanceof RecyclerView.r.b));
    for (parami = null; ; parami = new g.2(this, this.aiB.getContext()))
      return parami;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.g
 * JD-Core Version:    0.6.2
 */