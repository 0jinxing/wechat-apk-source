package com.tencent.mm.plugin.exdevice.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$a extends GestureDetector.SimpleOnGestureListener
{
  private ExdeviceProfileUI$a(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(20060);
    boolean bool;
    if (Math.abs(paramFloat2) < Math.abs(paramFloat1))
    {
      bool = true;
      AppMethodBeat.o(20060);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20060);
    }
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.a
 * JD-Core Version:    0.6.2
 */