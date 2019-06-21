package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class FreeWifiStateUI$2
  implements ap.a
{
  FreeWifiStateUI$2(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21072);
    boolean bool;
    if (d.MD(this.mAc.ssid))
    {
      this.mAc.a(NetworkInfo.State.CONNECTED);
      FreeWifiStateUI.b(this.mAc).stopTimer();
      bool = false;
      AppMethodBeat.o(21072);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(21072);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.2
 * JD-Core Version:    0.6.2
 */