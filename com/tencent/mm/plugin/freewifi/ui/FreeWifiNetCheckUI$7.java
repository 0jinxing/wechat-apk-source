package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiNetCheckUI$7
  implements DialogInterface.OnClickListener
{
  FreeWifiNetCheckUI$7(FreeWifiNetCheckUI paramFreeWifiNetCheckUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(21041);
    this.mzM.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    this.mzM.finish();
    AppMethodBeat.o(21041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.7
 * JD-Core Version:    0.6.2
 */