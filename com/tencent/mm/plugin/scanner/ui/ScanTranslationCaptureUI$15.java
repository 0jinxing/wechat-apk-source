package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$15
  implements DialogInterface.OnClickListener
{
  ScanTranslationCaptureUI$15(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(81271);
    ScanTranslationCaptureUI.B(this.qgh);
    this.qgh.finish();
    AppMethodBeat.o(81271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.15
 * JD-Core Version:    0.6.2
 */