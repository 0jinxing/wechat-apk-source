package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseScanUI$6
  implements DialogInterface.OnClickListener
{
  BaseScanUI$6(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80916);
    this.qbV.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    BaseScanUI.c(this.qbV, true);
    this.qbV.finish();
    AppMethodBeat.o(80916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.6
 * JD-Core Version:    0.6.2
 */