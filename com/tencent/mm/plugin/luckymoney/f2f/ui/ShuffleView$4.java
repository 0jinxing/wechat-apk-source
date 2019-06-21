package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShuffleView$4
  implements Animator.AnimatorListener
{
  ShuffleView$4(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(42229);
    ShuffleView.a(this.nWl, false);
    ShuffleView.u(this.nWl).setVisibility(0);
    if (ShuffleView.v(this.nWl) != null)
      ShuffleView.v(this.nWl).start();
    AppMethodBeat.o(42229);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(42228);
    ShuffleView.a(this.nWl, true);
    AppMethodBeat.o(42228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.4
 * JD-Core Version:    0.6.2
 */