package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiActivateStateUI$1
  implements ap.a
{
  FreeWifiActivateStateUI$1(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(20899);
    if (!bo.isNullOrNil(this.myd.ssid))
    {
      FreeWifiActivateStateUI.a(this.myd, this.myd.bzz());
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { this.myd.ssid, Integer.valueOf(FreeWifiActivateStateUI.a(this.myd)) });
      FreeWifiActivateStateUI.b(this.myd).stopTimer();
      if (FreeWifiActivateStateUI.a(this.myd) != 2)
      {
        this.myd.bzD();
        this.myd.bzB();
        d.a(this.myd.ssid, 3, this.myd.getIntent());
      }
    }
    AppMethodBeat.o(20899);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.1
 * JD-Core Version:    0.6.2
 */