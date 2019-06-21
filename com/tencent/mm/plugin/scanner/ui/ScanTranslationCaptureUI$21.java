package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.r;

final class ScanTranslationCaptureUI$21
  implements View.OnClickListener
{
  ScanTranslationCaptureUI$21(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81278);
    if (ScanTranslationCaptureUI.e(this.qgh) == 3)
    {
      if (ScanTranslationCaptureUI.k(this.qgh) != null)
        ScanTranslationCaptureUI.a(this.qgh, ScanTranslationCaptureUI.k(this.qgh));
      if (ScanTranslationCaptureUI.l(this.qgh).equalsIgnoreCase("zh_CN"))
        ScanTranslationCaptureUI.m(this.qgh).setImageResource(2131232073);
      while (true)
      {
        ScanTranslationCaptureUI.a(this.qgh, 2);
        ScanTranslationCaptureUI.j(this.qgh).cXb += 1L;
        AppMethodBeat.o(81278);
        return;
        ScanTranslationCaptureUI.m(this.qgh).setImageResource(2131232076);
      }
    }
    if (ScanTranslationCaptureUI.e(this.qgh) == 2)
    {
      if (ScanTranslationCaptureUI.n(this.qgh) != null)
        ScanTranslationCaptureUI.a(this.qgh, ScanTranslationCaptureUI.n(this.qgh));
      if (!ScanTranslationCaptureUI.l(this.qgh).equalsIgnoreCase("zh_CN"))
        break label198;
      ScanTranslationCaptureUI.m(this.qgh).setImageResource(2130840493);
    }
    while (true)
    {
      ScanTranslationCaptureUI.a(this.qgh, 3);
      AppMethodBeat.o(81278);
      break;
      label198: ScanTranslationCaptureUI.m(this.qgh).setImageResource(2130840495);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.21
 * JD-Core Version:    0.6.2
 */