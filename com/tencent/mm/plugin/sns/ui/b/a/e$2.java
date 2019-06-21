package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.c;

final class e$2
  implements ValueAnimator.AnimatorUpdateListener
{
  e$2(e parame)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40023);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGo.rGm.rGQ.setAlpha(f);
    this.rGo.rGm.rGR.setAlpha(f);
    AppMethodBeat.o(40023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.e.2
 * JD-Core Version:    0.6.2
 */