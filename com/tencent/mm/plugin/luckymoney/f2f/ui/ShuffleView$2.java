package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShuffleView$2
  implements Animator.AnimatorListener
{
  ShuffleView$2(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(42226);
    ShuffleView.a(this.nWl, false);
    ShuffleView.a(this.nWl, null);
    ShuffleView.d(this.nWl, -1);
    AppMethodBeat.o(42226);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(42225);
    ShuffleView.a(this.nWl, true);
    AppMethodBeat.o(42225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.2
 * JD-Core Version:    0.6.2
 */