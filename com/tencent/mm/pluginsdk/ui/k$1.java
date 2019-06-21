package com.tencent.mm.pluginsdk.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$1
  implements ValueAnimator.AnimatorUpdateListener
{
  k$1(k paramk)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(27542);
    k.a(this.viX, ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    this.viX.invalidateSelf();
    AppMethodBeat.o(27542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.k.1
 * JD-Core Version:    0.6.2
 */