package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceConnectWifiUI$5$1
  implements DialogInterface.OnCancelListener
{
  ExdeviceConnectWifiUI$5$1(ExdeviceConnectWifiUI.5 param5)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(19876);
    ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "On progress cancel, stop airkiss");
    if (ExdeviceConnectWifiUI.d(this.lAj.lAf) != ExdeviceConnectWifiUI.b.lAr)
      ExdeviceConnectWifiUI.r(this.lAj.lAf);
    AppMethodBeat.o(19876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.5.1
 * JD-Core Version:    0.6.2
 */