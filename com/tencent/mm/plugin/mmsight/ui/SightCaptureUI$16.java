package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$16 extends AnimatorListenerAdapter
{
  SightCaptureUI$16(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55207);
    SightCaptureUI.H(this.oDf).setEnabled(true);
    AppMethodBeat.o(55207);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(55208);
    SightCaptureUI.H(this.oDf).setEnabled(false);
    AppMethodBeat.o(55208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.16
 * JD-Core Version:    0.6.2
 */