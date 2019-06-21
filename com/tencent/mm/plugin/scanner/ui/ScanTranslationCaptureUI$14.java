package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$14
  implements DialogInterface.OnClickListener
{
  ScanTranslationCaptureUI$14(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(81270);
    this.qgh.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    ScanTranslationCaptureUI.B(this.qgh);
    this.qgh.finish();
    AppMethodBeat.o(81270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.14
 * JD-Core Version:    0.6.2
 */