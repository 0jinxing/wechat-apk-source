package com.tencent.mm.ui.widget.sortlist;

import android.os.SystemClock;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DragSortListView$d
  implements Runnable
{
  private int dy;
  boolean zOp = false;
  private boolean zVF;
  private long zVG;
  private long zVH;
  private float zVI;
  private long zVJ;
  int zVK;
  private float zVL;

  DragSortListView$d(DragSortListView paramDragSortListView)
  {
  }

  public final void Qv(int paramInt)
  {
    AppMethodBeat.i(113041);
    if (!this.zOp)
    {
      this.zVF = false;
      this.zOp = true;
      this.zVJ = SystemClock.uptimeMillis();
      this.zVG = this.zVJ;
      this.zVK = paramInt;
      this.zVC.post(this);
    }
    AppMethodBeat.o(113041);
  }

  public final void dLJ()
  {
    AppMethodBeat.i(113042);
    this.zVC.removeCallbacks(this);
    this.zOp = false;
    AppMethodBeat.o(113042);
  }

  public final void run()
  {
    AppMethodBeat.i(113043);
    if (this.zVF)
    {
      this.zOp = false;
      AppMethodBeat.o(113043);
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    View localView;
    while (true)
    {
      return;
      i = this.zVC.getFirstVisiblePosition();
      j = this.zVC.getLastVisiblePosition();
      k = this.zVC.getCount();
      m = this.zVC.getPaddingTop();
      n = this.zVC.getHeight() - m - this.zVC.getPaddingBottom();
      i1 = Math.min(DragSortListView.e(this.zVC), DragSortListView.r(this.zVC) + DragSortListView.c(this.zVC));
      i2 = Math.max(DragSortListView.e(this.zVC), DragSortListView.r(this.zVC) - DragSortListView.c(this.zVC));
      if (this.zVK != 0)
        break label409;
      localView = this.zVC.getChildAt(0);
      if (localView == null)
      {
        this.zOp = false;
        AppMethodBeat.o(113043);
      }
      else
      {
        if ((i != 0) || (localView.getTop() != m))
          break;
        this.zOp = false;
        AppMethodBeat.o(113043);
      }
    }
    this.zVL = DragSortListView.u(this.zVC).bs((DragSortListView.s(this.zVC) - i2) / DragSortListView.t(this.zVC));
    label227: this.zVH = SystemClock.uptimeMillis();
    this.zVI = ((float)(this.zVH - this.zVG));
    this.dy = Math.round(this.zVL * this.zVI);
    if (this.dy >= 0)
    {
      this.dy = Math.min(n, this.dy);
      j = i;
    }
    while (true)
    {
      localView = this.zVC.getChildAt(j - i);
      i2 = localView.getTop() + this.dy;
      i = i2;
      if (j == 0)
      {
        i = i2;
        if (i2 > m)
          i = m;
      }
      DragSortListView.a(this.zVC, true);
      this.zVC.setSelectionFromTop(j, i - m);
      this.zVC.layoutChildren();
      this.zVC.invalidate();
      DragSortListView.a(this.zVC, false);
      DragSortListView.c(this.zVC, j, localView);
      this.zVG = this.zVH;
      this.zVC.post(this);
      AppMethodBeat.o(113043);
      break;
      label409: localView = this.zVC.getChildAt(j - i);
      if (localView == null)
      {
        this.zOp = false;
        AppMethodBeat.o(113043);
        break;
      }
      if ((j == k - 1) && (localView.getBottom() <= n + m))
      {
        this.zOp = false;
        AppMethodBeat.o(113043);
        break;
      }
      this.zVL = (-DragSortListView.u(this.zVC).bs((i1 - DragSortListView.v(this.zVC)) / DragSortListView.w(this.zVC)));
      break label227;
      this.dy = Math.max(-n, this.dy);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.d
 * JD-Core Version:    0.6.2
 */