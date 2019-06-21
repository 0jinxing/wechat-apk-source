package com.tencent.mm.plugin.exdevice.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceConnectWifiUI$12
  implements View.OnTouchListener
{
  ExdeviceConnectWifiUI$12(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(19888);
    ExdeviceConnectWifiUI.c(this.lAf).clearFocus();
    this.lAf.aqX();
    AppMethodBeat.o(19888);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.12
 * JD-Core Version:    0.6.2
 */