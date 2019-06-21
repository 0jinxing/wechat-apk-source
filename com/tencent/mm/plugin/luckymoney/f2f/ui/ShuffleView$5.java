package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ShuffleView$5
  implements Animator.AnimatorListener
{
  ShuffleView$5(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(42230);
    ShuffleView.e(this.nWl).remove(ShuffleView.w(this.nWl));
    if (ShuffleView.x(this.nWl) != null)
      ShuffleView.x(this.nWl).start();
    ShuffleView.f(this.nWl, ShuffleView.f(this.nWl));
    if (ShuffleView.d(this.nWl) > 0)
    {
      ShuffleView.e(this.nWl, ShuffleView.y(this.nWl));
      ShuffleView.b(this.nWl, (View)ShuffleView.e(this.nWl).get(ShuffleView.f(this.nWl)));
      AppMethodBeat.o(42230);
    }
    while (true)
    {
      return;
      ShuffleView.b(this.nWl, null);
      ShuffleView.e(this.nWl, 0);
      AppMethodBeat.o(42230);
    }
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.5
 * JD-Core Version:    0.6.2
 */