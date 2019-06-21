package com.tencent.mm.plugin.appbrand.page;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x$1
  implements ValueAnimator.AnimatorUpdateListener
{
  x$1(x paramx)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(87277);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.itU.pt((int)f);
    AppMethodBeat.o(87277);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.x.1
 * JD-Core Version:    0.6.2
 */