package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.h;

final class ScanTranslationCaptureUI$19
  implements View.OnClickListener
{
  ScanTranslationCaptureUI$19(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81276);
    ScanTranslationCaptureUI.h(this.qgh).a(this.qgh);
    ScanTranslationCaptureUI.j(this.qgh).cWW = ((int)(System.currentTimeMillis() - ScanTranslationCaptureUI.i(this.qgh)[0]));
    ScanTranslationCaptureUI.j(this.qgh).cWV = 1L;
    AppMethodBeat.o(81276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.19
 * JD-Core Version:    0.6.2
 */