package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;

final class o$2
  implements ValueAnimator.AnimatorUpdateListener
{
  o$2(o paramo, u paramu)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(74765);
    this.hTv.nW(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    AppMethodBeat.o(74765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.k.o.2
 * JD-Core Version:    0.6.2
 */