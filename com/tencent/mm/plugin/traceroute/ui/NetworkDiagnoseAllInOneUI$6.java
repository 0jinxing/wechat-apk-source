package com.tencent.mm.plugin.traceroute.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NetworkDiagnoseAllInOneUI$6
  implements DialogInterface.OnClickListener
{
  NetworkDiagnoseAllInOneUI$6(NetworkDiagnoseAllInOneUI paramNetworkDiagnoseAllInOneUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(26001);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(26001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.6
 * JD-Core Version:    0.6.2
 */