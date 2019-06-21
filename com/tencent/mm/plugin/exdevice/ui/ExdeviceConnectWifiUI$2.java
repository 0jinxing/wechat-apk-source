package com.tencent.mm.plugin.exdevice.ui;

import android.net.wifi.WifiManager.MulticastLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceConnectWifiUI$2
  implements Runnable
{
  ExdeviceConnectWifiUI$2(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19872);
    ExdeviceConnectWifiUI.f(this.lAf).acquire();
    ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Start AirKiss result (%d). input ssid = %s", new Object[] { Integer.valueOf(Java2CExDevice.startAirKissWithInter(this.lAg, this.lAh, ExdeviceConnectWifiUI.l(this.lAf), 60000L, ExdeviceConnectWifiUI.m(this.lAf), ExdeviceConnectWifiUI.n(this.lAf))), this.lAh });
    AppMethodBeat.o(19872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.2
 * JD-Core Version:    0.6.2
 */