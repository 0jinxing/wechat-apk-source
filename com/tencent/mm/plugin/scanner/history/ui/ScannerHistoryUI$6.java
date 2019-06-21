package com.tencent.mm.plugin.scanner.history.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.b.a;

final class ScannerHistoryUI$6
  implements DialogInterface.OnClickListener
{
  ScannerHistoryUI$6(ScannerHistoryUI paramScannerHistoryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80805);
    paramDialogInterface.dismiss();
    com.tencent.mm.plugin.scanner.e.cgy().cgC().bSd.hY("ScanHistoryItem", "delete from ScanHistoryItem");
    ScannerHistoryUI.c(this.pZg);
    ScannerHistoryUI.a(this.pZg).a(null, null);
    AppMethodBeat.o(80805);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.6
 * JD-Core Version:    0.6.2
 */