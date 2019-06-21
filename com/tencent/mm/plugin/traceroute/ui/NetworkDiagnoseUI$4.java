package com.tencent.mm.plugin.traceroute.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NetworkDiagnoseUI$4
  implements MenuItem.OnMenuItemClickListener
{
  NetworkDiagnoseUI$4(NetworkDiagnoseUI paramNetworkDiagnoseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26026);
    NetworkDiagnoseUI.g(this.sJt);
    AppMethodBeat.o(26026);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.4
 * JD-Core Version:    0.6.2
 */