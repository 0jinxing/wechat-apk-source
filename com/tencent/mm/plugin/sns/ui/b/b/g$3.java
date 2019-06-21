package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.i.b;

final class g$3
  implements ValueAnimator.AnimatorUpdateListener
{
  g$3(g paramg)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40076);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGB.rGA.rGQ.setAlpha(f);
    this.rGB.rGA.rGR.setAlpha(f);
    AppMethodBeat.o(40076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.g.3
 * JD-Core Version:    0.6.2
 */