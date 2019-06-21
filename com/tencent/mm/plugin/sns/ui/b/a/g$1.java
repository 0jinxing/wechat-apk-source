package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.d;

final class g$1
  implements ValueAnimator.AnimatorUpdateListener
{
  g$1(g paramg)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40034);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 0.0F)
    {
      this.rGs.rGr.contentView.setScaleX(f);
      this.rGs.rGr.contentView.setScaleY(f);
      this.rGs.rGr.contentView.setAlpha(f);
    }
    AppMethodBeat.o(40034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.g.1
 * JD-Core Version:    0.6.2
 */