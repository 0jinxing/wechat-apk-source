package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiNoAuthStateUI$2
  implements DialogInterface.OnClickListener
{
  FreeWifiNoAuthStateUI$2(FreeWifiNoAuthStateUI paramFreeWifiNoAuthStateUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(21055);
    this.mzQ.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    this.mzQ.finish();
    AppMethodBeat.o(21055);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNoAuthStateUI.2
 * JD-Core Version:    0.6.2
 */