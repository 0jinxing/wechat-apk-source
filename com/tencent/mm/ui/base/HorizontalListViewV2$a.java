package com.tencent.mm.ui.base;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HorizontalListViewV2$a extends GestureDetector.SimpleOnGestureListener
{
  private HorizontalListViewV2$a(HorizontalListViewV2 paramHorizontalListViewV2)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106332);
    boolean bool = this.ytj.onDown(paramMotionEvent);
    AppMethodBeat.o(106332);
    return bool;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106333);
    boolean bool = this.ytj.bp(paramFloat1);
    AppMethodBeat.o(106333);
    return bool;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106336);
    HorizontalListViewV2.d(this.ytj);
    int i = HorizontalListViewV2.a(this.ytj, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    if ((i >= 0) && (!HorizontalListViewV2.f(this.ytj)))
    {
      paramMotionEvent = this.ytj.getChildAt(i);
      AdapterView.OnItemLongClickListener localOnItemLongClickListener = this.ytj.getOnItemLongClickListener();
      if (localOnItemLongClickListener != null)
      {
        i = HorizontalListViewV2.g(this.ytj) + i;
        if (localOnItemLongClickListener.onItemLongClick(this.ytj, paramMotionEvent, i, this.ytj.Ei.getItemId(i)))
          this.ytj.performHapticFeedback(0);
      }
    }
    AppMethodBeat.o(106336);
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106334);
    HorizontalListViewV2.a(this.ytj, Boolean.TRUE);
    HorizontalListViewV2.a(this.ytj, HorizontalListViewV2.d.a.ytl);
    HorizontalListViewV2.d(this.ytj);
    paramMotionEvent1 = this.ytj;
    paramMotionEvent1.ysE += (int)paramFloat1;
    HorizontalListViewV2.a(this.ytj, Math.round(paramFloat1));
    this.ytj.requestLayout();
    AppMethodBeat.o(106334);
    return true;
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106335);
    HorizontalListViewV2.d(this.ytj);
    AdapterView.OnItemClickListener localOnItemClickListener = this.ytj.getOnItemClickListener();
    int i = HorizontalListViewV2.a(this.ytj, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    boolean bool;
    if ((i >= 0) && (!HorizontalListViewV2.f(this.ytj)))
    {
      paramMotionEvent = this.ytj.getChildAt(i);
      i = HorizontalListViewV2.g(this.ytj) + i;
      if (localOnItemClickListener != null)
      {
        localOnItemClickListener.onItemClick(this.ytj, paramMotionEvent, i, this.ytj.Ei.getItemId(i));
        bool = true;
        AppMethodBeat.o(106335);
      }
    }
    while (true)
    {
      return bool;
      if ((HorizontalListViewV2.h(this.ytj) != null) && (!HorizontalListViewV2.f(this.ytj)))
        HorizontalListViewV2.h(this.ytj).onClick(this.ytj);
      bool = false;
      AppMethodBeat.o(106335);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListViewV2.a
 * JD-Core Version:    0.6.2
 */