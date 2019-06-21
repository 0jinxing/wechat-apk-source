package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FreeWifiActivateStateUI$8
  implements Runnable
{
  FreeWifiActivateStateUI$8(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20906);
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now network ssid is not wechat freewifi :%s", new Object[] { this.myd.ssid });
    this.myd.bzy();
    AppMethodBeat.o(20906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.8
 * JD-Core Version:    0.6.2
 */