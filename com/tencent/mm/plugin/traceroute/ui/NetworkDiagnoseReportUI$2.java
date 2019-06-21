package com.tencent.mm.plugin.traceroute.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NetworkDiagnoseReportUI$2
  implements MenuItem.OnMenuItemClickListener
{
  NetworkDiagnoseReportUI$2(NetworkDiagnoseReportUI paramNetworkDiagnoseReportUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(26017);
    this.sJn.finish();
    AppMethodBeat.o(26017);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.2
 * JD-Core Version:    0.6.2
 */