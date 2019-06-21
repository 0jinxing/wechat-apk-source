package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.d;

final class g$2
  implements ValueAnimator.AnimatorUpdateListener
{
  g$2(g paramg)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40035);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGs.rGr.rHg.setAlpha(f);
    this.rGs.rGr.rHf.setAlpha(f);
    AppMethodBeat.o(40035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.g.2
 * JD-Core Version:    0.6.2
 */