package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.i.b;

final class h$3
  implements ValueAnimator.AnimatorUpdateListener
{
  h$3(h paramh)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40083);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGC.rGA.rGQ.setAlpha(f);
    this.rGC.rGA.rGR.setAlpha(f);
    AppMethodBeat.o(40083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.h.3
 * JD-Core Version:    0.6.2
 */