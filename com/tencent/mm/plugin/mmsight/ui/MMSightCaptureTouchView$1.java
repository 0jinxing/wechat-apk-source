package com.tencent.mm.plugin.mmsight.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.support.Log;

final class MMSightCaptureTouchView$1 extends GestureDetector.SimpleOnGestureListener
{
  MMSightCaptureTouchView$1(MMSightCaptureTouchView paramMMSightCaptureTouchView)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55074);
    Log.i("MicroMsg.MMSightCaptureTouchView", "onDoubleTap");
    if (System.currentTimeMillis() - MMSightCaptureTouchView.b(this.oAG) > 1000L)
    {
      if (MMSightCaptureTouchView.a(this.oAG) != null)
        MMSightCaptureTouchView.a(this.oAG).bnY();
      MMSightCaptureTouchView.a(this.oAG, System.currentTimeMillis());
    }
    AppMethodBeat.o(55074);
    return false;
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55075);
    Log.i("MicroMsg.MMSightCaptureTouchView", "onSingleTapConfirmed");
    AppMethodBeat.o(55075);
    return true;
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55073);
    Log.i("MicroMsg.MMSightCaptureTouchView", "onSingleTapUp");
    if (MMSightCaptureTouchView.a(this.oAG) != null)
      MMSightCaptureTouchView.a(this.oAG).P(paramMotionEvent.getX(), paramMotionEvent.getY());
    AppMethodBeat.o(55073);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView.1
 * JD-Core Version:    0.6.2
 */