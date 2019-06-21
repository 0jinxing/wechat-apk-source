package com.tencent.mm.plugin.traceroute.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class NetworkDiagnoseAllInOneUI$3
  implements ap.a
{
  NetworkDiagnoseAllInOneUI$3(NetworkDiagnoseAllInOneUI paramNetworkDiagnoseAllInOneUI)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(25998);
    NetworkDiagnoseAllInOneUI.a(this.sIZ, NetworkDiagnoseAllInOneUI.m(this.sIZ) + 1);
    ab.v("MicroMsg.NetworkDiagnoseAllInOneUI", "timer fired, percent:%d", new Object[] { Integer.valueOf(NetworkDiagnoseAllInOneUI.m(this.sIZ)) });
    if (NetworkDiagnoseAllInOneUI.m(this.sIZ) > 99)
      AppMethodBeat.o(25998);
    while (true)
    {
      return bool;
      if (NetworkDiagnoseAllInOneUI.a(this.sIZ) == 1)
        NetworkDiagnoseAllInOneUI.n(this.sIZ).setText(this.sIZ.getString(2131298885, new Object[] { Integer.valueOf(NetworkDiagnoseAllInOneUI.m(this.sIZ)) }));
      AppMethodBeat.o(25998);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.3
 * JD-Core Version:    0.6.2
 */