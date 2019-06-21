package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$13
  implements DialogInterface.OnClickListener
{
  ScanTranslationCaptureUI$13(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(138496);
    ScanTranslationCaptureUI.z(this.qgh);
    this.qgh.finish();
    this.qgh.overridePendingTransition(0, 0);
    AppMethodBeat.o(138496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.13
 * JD-Core Version:    0.6.2
 */