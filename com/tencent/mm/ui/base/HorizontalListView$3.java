package com.tencent.mm.ui.base;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HorizontalListView$3 extends GestureDetector.SimpleOnGestureListener
{
  HorizontalListView$3(HorizontalListView paramHorizontalListView)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106312);
    boolean bool = this.ysO.dzt();
    AppMethodBeat.o(106312);
    return bool;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106313);
    boolean bool = this.ysO.bp(paramFloat1);
    AppMethodBeat.o(106313);
    return bool;
  }

  public final boolean onScroll(MotionEvent arg1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106314);
    synchronized (this.ysO)
    {
      paramMotionEvent2 = this.ysO;
      paramMotionEvent2.ysE += (int)paramFloat1;
      this.ysO.requestLayout();
      AppMethodBeat.o(106314);
      return true;
    }
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106315);
    Rect localRect = new Rect();
    for (int i = 0; ; i++)
    {
      if (i < this.ysO.getChildCount())
      {
        View localView = this.ysO.getChildAt(i);
        int j = localView.getLeft();
        int k = localView.getRight();
        localRect.set(j, localView.getTop(), k, localView.getBottom());
        if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          continue;
        if (HorizontalListView.c(this.ysO) != null)
          HorizontalListView.c(this.ysO).onItemClick(this.ysO, localView, HorizontalListView.d(this.ysO) + 1 + i, this.ysO.Ei.getItemId(HorizontalListView.d(this.ysO) + 1 + i));
        if (HorizontalListView.e(this.ysO) != null)
          HorizontalListView.e(this.ysO).onItemSelected(this.ysO, localView, HorizontalListView.d(this.ysO) + 1 + i, this.ysO.Ei.getItemId(HorizontalListView.d(this.ysO) + 1 + i));
      }
      AppMethodBeat.o(106315);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListView.3
 * JD-Core Version:    0.6.2
 */