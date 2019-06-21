package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements ValueAnimator.AnimatorUpdateListener
{
  g$1(g paramg)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40074);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ab.i("MicroMsg.TurnCardAdBackAnimation", "value %f", new Object[] { Float.valueOf(f) });
    if (f != 0.0F)
    {
      this.rGB.rGA.rJf.setScaleX(f);
      this.rGB.rGA.rJf.setScaleY(f);
      this.rGB.rGA.rJf.setAlpha(f);
    }
    AppMethodBeat.o(40074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.g.1
 * JD-Core Version:    0.6.2
 */