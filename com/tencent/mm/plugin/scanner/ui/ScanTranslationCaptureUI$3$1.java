package com.tencent.mm.plugin.scanner.ui;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;

final class ScanTranslationCaptureUI$3$1
  implements Camera.AutoFocusCallback
{
  ScanTranslationCaptureUI$3$1(ScanTranslationCaptureUI.3 param3)
  {
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(81256);
    ab.i("MicroMsg.ScanTranslationCaptureUI", "camera auto focus call back");
    ScanTranslationCaptureUI.h(this.qgi.qgh).cancelAutoFocus();
    ScanTranslationCaptureUI.h(this.qgi.qgh).cie();
    AppMethodBeat.o(81256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.3.1
 * JD-Core Version:    0.6.2
 */