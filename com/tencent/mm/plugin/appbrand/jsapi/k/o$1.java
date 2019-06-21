package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;

final class o$1
  implements ValueAnimator.AnimatorUpdateListener
{
  o$1(o paramo, u paramu)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(74764);
    this.hTv.nV(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    AppMethodBeat.o(74764);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.k.o.1
 * JD-Core Version:    0.6.2
 */