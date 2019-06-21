package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseScanUI$14
  implements DialogInterface.OnClickListener
{
  BaseScanUI$14(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(138470);
    BaseScanUI.b(this.qbV, true);
    BaseScanUI.B(this.qbV);
    BaseScanUI.C(this.qbV);
    this.qbV.overridePendingTransition(0, 0);
    AppMethodBeat.o(138470);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.14
 * JD-Core Version:    0.6.2
 */