package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseScanUI$4
  implements DialogInterface.OnClickListener
{
  BaseScanUI$4(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80914);
    this.qbV.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    BaseScanUI.o(this.qbV);
    this.qbV.finish();
    AppMethodBeat.o(80914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.4
 * JD-Core Version:    0.6.2
 */