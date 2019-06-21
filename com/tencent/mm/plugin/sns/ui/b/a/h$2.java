package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.d;

final class h$2
  implements ValueAnimator.AnimatorUpdateListener
{
  h$2(h paramh)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40041);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rGt.rGr.rHg.setAlpha(f);
    this.rGt.rGr.rHf.setAlpha(f);
    AppMethodBeat.o(40041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.h.2
 * JD-Core Version:    0.6.2
 */