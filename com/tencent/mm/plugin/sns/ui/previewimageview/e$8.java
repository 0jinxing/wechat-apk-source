package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$8
  implements Animator.AnimatorListener
{
  e$8(e parame)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(40330);
    this.rLd.rKW.setVisibility(4);
    this.rLd.rKW.setTranslationY(0.0F);
    AppMethodBeat.o(40330);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40329);
    this.rLd.rKW.setVisibility(4);
    this.rLd.rKW.setTranslationY(0.0F);
    AppMethodBeat.o(40329);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40328);
    e.b(this.rLd);
    AppMethodBeat.o(40328);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e.8
 * JD-Core Version:    0.6.2
 */