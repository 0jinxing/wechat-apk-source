package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;

final class ScanTranslationCaptureUI$9
  implements DialogInterface.OnClickListener
{
  ScanTranslationCaptureUI$9(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(138494);
    b.bE(this.qgh);
    this.qgh.finish();
    AppMethodBeat.o(138494);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.9
 * JD-Core Version:    0.6.2
 */