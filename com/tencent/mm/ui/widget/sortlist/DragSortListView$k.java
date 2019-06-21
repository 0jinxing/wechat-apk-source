package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DragSortListView$k extends DragSortListView.m
{
  private int elV;
  private float zVV;
  private float zVW;
  private float zVX;
  private int zVY = -1;
  private int zVZ = -1;
  private int zWa;

  private DragSortListView$k(DragSortListView paramDragSortListView, int paramInt)
  {
    super(paramDragSortListView, paramInt, (byte)0);
  }

  public final void bt(float paramFloat)
  {
    AppMethodBeat.i(113056);
    paramFloat = 1.0F - paramFloat;
    int i = this.zVC.getFirstVisiblePosition();
    Object localObject1 = this.zVC.getChildAt(this.elV - i);
    float f1;
    if (DragSortListView.n(this.zVC))
    {
      f1 = (float)(SystemClock.uptimeMillis() - this.mStartTime) / 1000.0F;
      if (f1 == 0.0F)
        AppMethodBeat.o(113056);
    }
    while (true)
    {
      return;
      float f2 = DragSortListView.o(this.zVC);
      int j = this.zVC.getWidth();
      Object localObject2 = this.zVC;
      float f3 = DragSortListView.o(this.zVC);
      if (DragSortListView.o(this.zVC) > 0.0F);
      for (int k = 1; ; k = -1)
      {
        DragSortListView.a((DragSortListView)localObject2, k * f1 * j + f3);
        this.zVV += f2 * f1;
        DragSortListView.d(this.zVC).x = ((int)this.zVV);
        if ((this.zVV >= j) || (this.zVV <= -j))
          break label215;
        this.mStartTime = SystemClock.uptimeMillis();
        DragSortListView.f(this.zVC);
        AppMethodBeat.o(113056);
        break;
      }
      label215: if (localObject1 != null)
      {
        if (this.zVY == -1)
        {
          this.zVY = DragSortListView.b(this.zVC, this.elV, (View)localObject1);
          this.zVW = (((View)localObject1).getHeight() - this.zVY);
        }
        k = Math.max((int)(this.zVW * paramFloat), 1);
        localObject2 = ((View)localObject1).getLayoutParams();
        ((ViewGroup.LayoutParams)localObject2).height = (k + this.zVY);
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      if (this.zWa != this.elV)
      {
        localObject2 = this.zVC.getChildAt(this.zWa - i);
        if (localObject2 != null)
        {
          if (this.zVZ == -1)
          {
            this.zVZ = DragSortListView.b(this.zVC, this.zWa, (View)localObject2);
            this.zVX = (((View)localObject2).getHeight() - this.zVZ);
          }
          k = Math.max((int)(this.zVX * paramFloat), 1);
          localObject1 = ((View)localObject2).getLayoutParams();
          ((ViewGroup.LayoutParams)localObject1).height = (k + this.zVZ);
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
      AppMethodBeat.o(113056);
    }
  }

  public final void onStart()
  {
    int i = -1;
    AppMethodBeat.i(113055);
    this.zVY = -1;
    this.zVZ = -1;
    this.elV = DragSortListView.l(this.zVC);
    this.zWa = DragSortListView.m(this.zVC);
    DragSortListView.a(this.zVC, 1);
    this.zVV = DragSortListView.d(this.zVC).x;
    float f;
    if (DragSortListView.n(this.zVC))
    {
      f = this.zVC.getWidth() * 2.0F;
      if (DragSortListView.o(this.zVC) == 0.0F)
      {
        DragSortListView localDragSortListView = this.zVC;
        if (this.zVV < 0.0F)
        {
          DragSortListView.a(localDragSortListView, i * f);
          AppMethodBeat.o(113055);
        }
      }
    }
    while (true)
    {
      return;
      i = 1;
      break;
      f *= 2.0F;
      if ((DragSortListView.o(this.zVC) < 0.0F) && (DragSortListView.o(this.zVC) > -f))
      {
        DragSortListView.a(this.zVC, -f);
        AppMethodBeat.o(113055);
      }
      else
      {
        if ((DragSortListView.o(this.zVC) > 0.0F) && (DragSortListView.o(this.zVC) < f))
          DragSortListView.a(this.zVC, f);
        AppMethodBeat.o(113055);
        continue;
        DragSortListView.p(this.zVC);
        AppMethodBeat.o(113055);
      }
    }
  }

  public final void onStop()
  {
    AppMethodBeat.i(113057);
    DragSortListView.q(this.zVC);
    AppMethodBeat.o(113057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.k
 * JD-Core Version:    0.6.2
 */