package com.tencent.mm.ui.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTextView$1 extends GestureDetector.SimpleOnGestureListener
{
  MMTextView$1(MMTextView paramMMTextView)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107921);
    boolean bool;
    if (MMTextView.a(this.zNo) == null)
    {
      bool = false;
      AppMethodBeat.o(107921);
    }
    while (true)
    {
      return bool;
      bool = MMTextView.a(this.zNo).eL(this.zNo);
      AppMethodBeat.o(107921);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMTextView.1
 * JD-Core Version:    0.6.2
 */