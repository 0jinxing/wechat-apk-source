package com.tencent.mm.plugin.traceroute.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;

final class NetworkDiagnoseAllInOneUI$4
  implements bk.a
{
  NetworkDiagnoseAllInOneUI$4(NetworkDiagnoseAllInOneUI paramNetworkDiagnoseAllInOneUI)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(25999);
    if (parame == null)
      AppMethodBeat.o(25999);
    while (true)
    {
      return;
      try
      {
        parame.adj();
        AppMethodBeat.o(25999);
      }
      catch (Exception parame)
      {
        AppMethodBeat.o(25999);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.4
 * JD-Core Version:    0.6.2
 */