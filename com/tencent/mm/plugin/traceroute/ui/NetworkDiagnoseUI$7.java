package com.tencent.mm.plugin.traceroute.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NetworkDiagnoseUI$7
  implements DialogInterface.OnClickListener
{
  NetworkDiagnoseUI$7(NetworkDiagnoseUI paramNetworkDiagnoseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(26033);
    NetworkDiagnoseUI.e(this.sJt);
    this.sJt.finish();
    AppMethodBeat.o(26033);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.7
 * JD-Core Version:    0.6.2
 */