package com.tencent.mm.plugin.webview.luggage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements ValueAnimator.AnimatorUpdateListener
{
  i$1(i parami)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(6157);
    ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    AppMethodBeat.o(6157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.i.1
 * JD-Core Version:    0.6.2
 */