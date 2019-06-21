package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightCaptureUI$7 extends AnimatorListenerAdapter
{
  SightCaptureUI$7(SightCaptureUI paramSightCaptureUI)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55191);
    SightCaptureUI.I(this.oDf).setVisibility(8);
    AppMethodBeat.o(55191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.7
 * JD-Core Version:    0.6.2
 */