package com.tencent.mm.ui.base;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMHorList$3 extends GestureDetector.SimpleOnGestureListener
{
  MMHorList$3(MMHorList paramMMHorList)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106656);
    boolean bool = this.yvH.dzt();
    AppMethodBeat.o(106656);
    return bool;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106657);
    boolean bool = this.yvH.bp(paramFloat1);
    AppMethodBeat.o(106657);
    return bool;
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106658);
    MMHorList.a(this.yvH, MMHorList.c(this.yvH) + (int)paramFloat1);
    this.yvH.requestLayout();
    AppMethodBeat.o(106658);
    return true;
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106659);
    Rect localRect = new Rect();
    for (int i = 0; ; i++)
    {
      if (i < this.yvH.getChildCount())
      {
        View localView = this.yvH.getChildAt(i);
        int j = localView.getLeft();
        int k = localView.getRight();
        localRect.set(j, localView.getTop(), k, localView.getBottom());
        if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          continue;
        if (MMHorList.d(this.yvH) != null)
          MMHorList.d(this.yvH).onItemClick(this.yvH, localView, MMHorList.e(this.yvH) + 1 + i, MMHorList.f(this.yvH).getItemId(MMHorList.e(this.yvH) + 1 + i));
        if (MMHorList.g(this.yvH) != null)
          MMHorList.g(this.yvH).onItemSelected(this.yvH, localView, MMHorList.e(this.yvH) + 1 + i, MMHorList.f(this.yvH).getItemId(MMHorList.e(this.yvH) + 1 + i));
      }
      AppMethodBeat.o(106659);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMHorList.3
 * JD-Core Version:    0.6.2
 */