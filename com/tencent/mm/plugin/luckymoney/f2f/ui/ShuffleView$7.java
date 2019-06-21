package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShuffleView$7
  implements ValueAnimator.AnimatorUpdateListener
{
  ShuffleView$7(ShuffleView paramShuffleView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42232);
    if (ShuffleView.A(this.nWl) != null)
      ShuffleView.A(this.nWl).a(paramValueAnimator, ShuffleView.u(this.nWl));
    AppMethodBeat.o(42232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.7
 * JD-Core Version:    0.6.2
 */