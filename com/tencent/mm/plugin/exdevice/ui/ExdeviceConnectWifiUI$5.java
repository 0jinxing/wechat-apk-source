package com.tencent.mm.plugin.exdevice.ui;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ExdeviceConnectWifiUI$5
  implements Runnable
{
  ExdeviceConnectWifiUI$5(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19877);
    ExdeviceConnectWifiUI localExdeviceConnectWifiUI = this.lAf;
    AppCompatActivity localAppCompatActivity = this.lAf.mController.ylL;
    this.lAf.getString(2131297061);
    ExdeviceConnectWifiUI.a(localExdeviceConnectWifiUI, h.b(localAppCompatActivity, this.lAf.getString(2131299384), true, new ExdeviceConnectWifiUI.5.1(this)));
    AppMethodBeat.o(19877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.5
 * JD-Core Version:    0.6.2
 */