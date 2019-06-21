package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.c;

final class f$2
  implements ValueAnimator.AnimatorUpdateListener
{
  f$2(f paramf)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40029);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGq.rGp.rGQ.setAlpha(f);
    this.rGq.rGp.rGR.setAlpha(f);
    AppMethodBeat.o(40029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.f.2
 * JD-Core Version:    0.6.2
 */