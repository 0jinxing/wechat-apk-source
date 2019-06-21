package com.tencent.mm.plugin.traceroute.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.traceroute.b.a;
import com.tencent.mm.plugin.traceroute.b.a.j;
import com.tencent.mm.plugin.traceroute.b.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.Map;

final class NetworkDiagnoseUI$6
  implements bk.a
{
  NetworkDiagnoseUI$6(NetworkDiagnoseUI paramNetworkDiagnoseUI)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(26032);
    if (parame == null)
    {
      AppMethodBeat.o(26032);
      return;
    }
    String str = r.Yz();
    NetworkDiagnoseUI.a(this.sJt, new a(str));
    NetworkDiagnoseUI.d(this.sJt).c(parame.getIPsString(true), true);
    NetworkDiagnoseUI.d(this.sJt).c(parame.getIPsString(false), false);
    NetworkDiagnoseUI.d(this.sJt).sIz = new NetworkDiagnoseUI.6.1(this);
    NetworkDiagnoseUI.d(this.sJt).sIy = new NetworkDiagnoseUI.6.2(this);
    NetworkDiagnoseUI.d(this.sJt).sIB = new NetworkDiagnoseUI.6.3(this);
    NetworkDiagnoseUI.d(this.sJt).sIA = new NetworkDiagnoseUI.6.4(this);
    parame = NetworkDiagnoseUI.d(this.sJt);
    if ((parame.sIx == null) || (parame.sIx.size() == 0))
      ab.e("MicroMsg.MMTraceRoute", "no iplist");
    while (true)
    {
      NetworkDiagnoseUI.j(this.sJt).ae(1200L, 1200L);
      AppMethodBeat.o(26032);
      break;
      if (a.sIt == null)
        a.sIt = new c();
      d.post(new a.j(parame, (byte)0), "MMTraceRoute_start");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.6
 * JD-Core Version:    0.6.2
 */