package com.tencent.mm.plugin.scanner.history.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScannerHistoryUI$7
  implements DialogInterface.OnClickListener
{
  ScannerHistoryUI$7(ScannerHistoryUI paramScannerHistoryUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80806);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(80806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI.7
 * JD-Core Version:    0.6.2
 */