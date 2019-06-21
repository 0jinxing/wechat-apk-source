package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.c.a;

final class f$3
  implements ValueAnimator.AnimatorUpdateListener
{
  f$3(f paramf)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40069);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGz.rGx.rGQ.setAlpha(f);
    this.rGz.rGx.rGR.setAlpha(f);
    AppMethodBeat.o(40069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.f.3
 * JD-Core Version:    0.6.2
 */