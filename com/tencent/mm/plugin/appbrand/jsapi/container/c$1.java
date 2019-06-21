package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements ValueAnimator.AnimatorUpdateListener
{
  c$1(c paramc, View paramView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(126281);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.val$view.setX(f);
    AppMethodBeat.o(126281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.c.1
 * JD-Core Version:    0.6.2
 */