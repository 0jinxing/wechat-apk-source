package com.tencent.mm.plugin.facedetect.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceDetectUI$10
  implements Animation.AnimationListener
{
  FaceDetectUI$10(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(470);
    FaceDetectUI.l(this.lXO);
    AppMethodBeat.o(470);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.10
 * JD-Core Version:    0.6.2
 */