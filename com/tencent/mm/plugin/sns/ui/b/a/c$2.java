package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.b;

final class c$2
  implements ValueAnimator.AnimatorUpdateListener
{
  c$2(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40011);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGh.rFX.rGO.setAlpha(f);
    AppMethodBeat.o(40011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.c.2
 * JD-Core Version:    0.6.2
 */