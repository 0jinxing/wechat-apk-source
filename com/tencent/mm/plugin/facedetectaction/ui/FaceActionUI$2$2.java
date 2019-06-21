package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectlight.ui.b;

final class FaceActionUI$2$2
  implements Runnable
{
  FaceActionUI$2$2(FaceActionUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(711);
    FaceActionUI localFaceActionUI = this.mdh.mde;
    if (localFaceActionUI.mcZ != null)
      localFaceActionUI.mcZ.stopPreview();
    localFaceActionUI.mcN.setVisibility(8);
    localFaceActionUI.lYg.setVisibility(0);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, localFaceActionUI.lYj.getHeight());
    localTranslateAnimation.setDuration(2000L);
    localTranslateAnimation.setRepeatMode(2);
    localTranslateAnimation.setRepeatCount(-1);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(1000L);
    localScaleAnimation.setRepeatMode(2);
    localScaleAnimation.setRepeatCount(-1);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.addAnimation(localTranslateAnimation);
    localAnimationSet.addAnimation(localScaleAnimation);
    localAnimationSet.setAnimationListener(new FaceActionUI.7(localFaceActionUI));
    localAnimationSet.setRepeatCount(-1);
    localFaceActionUI.lYk.startAnimation(localAnimationSet);
    AppMethodBeat.o(711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.2.2
 * JD-Core Version:    0.6.2
 */