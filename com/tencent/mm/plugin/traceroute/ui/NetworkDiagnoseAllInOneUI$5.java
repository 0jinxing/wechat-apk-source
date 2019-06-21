package com.tencent.mm.plugin.traceroute.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NetworkDiagnoseAllInOneUI$5
  implements DialogInterface.OnClickListener
{
  NetworkDiagnoseAllInOneUI$5(NetworkDiagnoseAllInOneUI paramNetworkDiagnoseAllInOneUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(26000);
    this.sIZ.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    AppMethodBeat.o(26000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.5
 * JD-Core Version:    0.6.2
 */