package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Point;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DragSortListView$g extends DragSortListView.m
{
  private int zVP;
  private int zVQ;
  private float zVR;
  private float zVS;

  private DragSortListView$g(DragSortListView paramDragSortListView, int paramInt)
  {
    super(paramDragSortListView, paramInt, (byte)0);
  }

  private int dLK()
  {
    AppMethodBeat.i(113048);
    int i = this.zVC.getFirstVisiblePosition();
    int j = (DragSortListView.i(this.zVC) + this.zVC.getDividerHeight()) / 2;
    View localView = this.zVC.getChildAt(this.zVP - i);
    i = -1;
    if (localView != null)
      if (this.zVP == this.zVQ)
        i = localView.getTop();
    while (true)
    {
      AppMethodBeat.o(113048);
      return i;
      if (this.zVP < this.zVQ)
      {
        i = localView.getTop() - j;
      }
      else
      {
        i = localView.getBottom() + j - DragSortListView.j(this.zVC);
        continue;
        this.xH = true;
      }
    }
  }

  public final void bt(float paramFloat)
  {
    AppMethodBeat.i(113049);
    int i = dLK();
    int j = this.zVC.getPaddingLeft();
    float f1 = DragSortListView.d(this.zVC).y - i;
    float f2 = DragSortListView.d(this.zVC).x - j;
    paramFloat = 1.0F - paramFloat;
    if ((paramFloat < Math.abs(f1 / this.zVR)) || (paramFloat < Math.abs(f2 / this.zVS)))
    {
      DragSortListView.d(this.zVC).y = (i + (int)(this.zVR * paramFloat));
      DragSortListView.d(this.zVC).x = (this.zVC.getPaddingLeft() + (int)(this.zVS * paramFloat));
      DragSortListView.f(this.zVC);
    }
    AppMethodBeat.o(113049);
  }

  public final void onStart()
  {
    AppMethodBeat.i(113047);
    this.zVP = DragSortListView.g(this.zVC);
    this.zVQ = DragSortListView.h(this.zVC);
    DragSortListView.a(this.zVC, 2);
    this.zVR = (DragSortListView.d(this.zVC).y - dLK());
    this.zVS = (DragSortListView.d(this.zVC).x - this.zVC.getPaddingLeft());
    AppMethodBeat.o(113047);
  }

  public final void onStop()
  {
    AppMethodBeat.i(113050);
    DragSortListView.k(this.zVC);
    AppMethodBeat.o(113050);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.g
 * JD-Core Version:    0.6.2
 */