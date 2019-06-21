package com.tencent.mm.e;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.y.a;

final class c$3
  implements ValueAnimator.AnimatorUpdateListener
{
  c$3(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(116153);
    int i = ((Integer)paramValueAnimator.getAnimatedValue("bg_alpha")).intValue();
    int j = ((Integer)paramValueAnimator.getAnimatedValue("alpha")).intValue();
    c.a(this.cjQ);
    a.jz(j);
    c.a(this.cjQ);
    a.jA(i);
    this.cjQ.CP();
    AppMethodBeat.o(116153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.3
 * JD-Core Version:    0.6.2
 */