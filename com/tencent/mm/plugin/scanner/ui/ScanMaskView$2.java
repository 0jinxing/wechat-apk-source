package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScanMaskView$2 extends AnimatorListenerAdapter
{
  ScanMaskView$2(ScanMaskView paramScanMaskView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(81148);
    super.onAnimationEnd(paramAnimator);
    if (ScanMaskView.g(this.qek) != null)
      ScanMaskView.g(this.qek).onAnimationEnd();
    AppMethodBeat.o(81148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanMaskView.2
 * JD-Core Version:    0.6.2
 */