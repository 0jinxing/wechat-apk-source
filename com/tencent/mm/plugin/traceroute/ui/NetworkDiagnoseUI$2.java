package com.tencent.mm.plugin.traceroute.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.traceroute.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MMProgressBar;

final class NetworkDiagnoseUI$2 extends ak
{
  NetworkDiagnoseUI$2(NetworkDiagnoseUI paramNetworkDiagnoseUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(26024);
    switch (paramMessage.what)
    {
    default:
    case 2:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(26024);
      while (true)
      {
        return;
        if (NetworkDiagnoseUI.b(this.sJt) < 95)
          NetworkDiagnoseUI.c(this.sJt).setProgress(95);
        NetworkDiagnoseUI.d(this.sJt).cHv();
        AppMethodBeat.o(26024);
        continue;
        NetworkDiagnoseUI.e(this.sJt);
        if (NetworkDiagnoseUI.b(this.sJt) < 95)
          NetworkDiagnoseUI.c(this.sJt).setProgress(95);
        NetworkDiagnoseUI.d(this.sJt).cHv();
        AppMethodBeat.o(26024);
        continue;
        NetworkDiagnoseUI.c(this.sJt).setProgress(100);
        NetworkDiagnoseUI.a(this.sJt, false);
        AppMethodBeat.o(26024);
      }
      NetworkDiagnoseUI.c(this.sJt).setProgress(100);
      NetworkDiagnoseUI.a(this.sJt, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.2
 * JD-Core Version:    0.6.2
 */