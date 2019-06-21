package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;

final class FreeWifiStateUI$9
  implements DialogInterface.OnCancelListener
{
  FreeWifiStateUI$9(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(21079);
    d.a(this.mAc.ssid, 4, this.mAc.getIntent());
    AppMethodBeat.o(21079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.9
 * JD-Core Version:    0.6.2
 */