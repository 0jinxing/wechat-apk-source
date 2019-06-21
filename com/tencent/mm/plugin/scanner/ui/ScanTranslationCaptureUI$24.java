package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanTranslationCaptureUI$24 extends AnimatorListenerAdapter
{
  ScanTranslationCaptureUI$24(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(81282);
    ScanTranslationCaptureUI.r(this.qgh).setAlpha(0.0F);
    AppMethodBeat.o(81282);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(81281);
    ScanTranslationCaptureUI.r(this.qgh).setAlpha(0.0F);
    AppMethodBeat.o(81281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.24
 * JD-Core Version:    0.6.2
 */