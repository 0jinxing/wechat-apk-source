package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class ScanTranslationCaptureUI$5 extends AnimatorListenerAdapter
{
  ScanTranslationCaptureUI$5(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(81259);
    ScanTranslationCaptureUI.a(this.qgh, false);
    ScanTranslationCaptureUI.a(this.qgh).setVisibility(8);
    AppMethodBeat.o(81259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.5
 * JD-Core Version:    0.6.2
 */