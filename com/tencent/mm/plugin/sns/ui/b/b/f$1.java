package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.c.a;

final class f$1
  implements ValueAnimator.AnimatorUpdateListener
{
  f$1(f paramf)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40067);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 1.0F)
    {
      this.rGz.rGx.roq.setScaleX(f);
      this.rGz.rGx.roq.setScaleY(f);
      this.rGz.rGx.roq.setAlpha(f);
    }
    AppMethodBeat.o(40067);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.f.1
 * JD-Core Version:    0.6.2
 */