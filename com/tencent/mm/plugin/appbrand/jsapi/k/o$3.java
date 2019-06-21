package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;

final class o$3
  implements ValueAnimator.AnimatorUpdateListener
{
  o$3(o paramo, u paramu)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(74766);
    double d = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.hTv.u(d);
    AppMethodBeat.o(74766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.k.o.3
 * JD-Core Version:    0.6.2
 */