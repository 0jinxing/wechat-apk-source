package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.sdk.b.a;

final class ScanTranslationCaptureUI$8 extends AnimatorListenerAdapter
{
  ScanTranslationCaptureUI$8(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(138493);
    paramAnimator = new mk();
    paramAnimator.cIp.action = 3;
    a.xxA.m(paramAnimator);
    ScanTranslationCaptureUI.a(this.qgh, false);
    ScanTranslationCaptureUI.z(this.qgh);
    this.qgh.finish();
    AppMethodBeat.o(138493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.8
 * JD-Core Version:    0.6.2
 */