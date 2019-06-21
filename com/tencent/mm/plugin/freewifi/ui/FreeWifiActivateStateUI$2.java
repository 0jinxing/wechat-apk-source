package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class FreeWifiActivateStateUI$2
  implements ap.a
{
  FreeWifiActivateStateUI$2(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(20900);
    boolean bool;
    if (d.MD(this.myd.ssid))
    {
      this.myd.a(NetworkInfo.State.CONNECTED);
      FreeWifiActivateStateUI.b(this.myd).stopTimer();
      bool = false;
      AppMethodBeat.o(20900);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(20900);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.2
 * JD-Core Version:    0.6.2
 */