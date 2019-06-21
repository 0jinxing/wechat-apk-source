package com.tencent.mm.plugin.traceroute.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class NetworkDiagnoseAllInOneUI$2
  implements b.a
{
  NetworkDiagnoseAllInOneUI$2(NetworkDiagnoseAllInOneUI paramNetworkDiagnoseAllInOneUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(25997);
    ab.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get location, isOK:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (NetworkDiagnoseAllInOneUI.f(this.sIZ) != null)
      NetworkDiagnoseAllInOneUI.f(this.sIZ).c(NetworkDiagnoseAllInOneUI.g(this.sIZ));
    al.d(new NetworkDiagnoseAllInOneUI.2.1(this));
    NetworkDiagnoseAllInOneUI.j(this.sIZ);
    if (paramBoolean)
      str = String.valueOf(paramFloat2) + "-" + String.valueOf(paramFloat1);
    for (String str = str + "," + NetworkDiagnoseAllInOneUI.j(this.sIZ); ; str = "," + NetworkDiagnoseAllInOneUI.j(this.sIZ))
    {
      com.tencent.mm.plugin.report.service.h.pYm.X(14533, str);
      AppMethodBeat.o(25997);
      return false;
      if ((!NetworkDiagnoseAllInOneUI.k(this.sIZ)) && (!d.agA()))
      {
        NetworkDiagnoseAllInOneUI.l(this.sIZ);
        com.tencent.mm.ui.base.h.a(this.sIZ, this.sIZ.getString(2131300421), this.sIZ.getString(2131297061), this.sIZ.getString(2131300878), this.sIZ.getString(2131296868), false, new NetworkDiagnoseAllInOneUI.2.2(this), null);
      }
      ab.e("MicroMsg.NetworkDiagnoseAllInOneUI", "get geolocation fail");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.2
 * JD-Core Version:    0.6.2
 */