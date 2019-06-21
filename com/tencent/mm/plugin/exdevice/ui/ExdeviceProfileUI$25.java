package com.tencent.mm.plugin.exdevice.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.a;

final class ExdeviceProfileUI$25
  implements MMPullDownView.a
{
  ExdeviceProfileUI$25(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(20051);
    boolean bool = ExdeviceProfileUI.H(this.lCu).onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(20051);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.25
 * JD-Core Version:    0.6.2
 */