package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.d;

final class h$1
  implements ValueAnimator.AnimatorUpdateListener
{
  h$1(h paramh)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40040);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 1.0D)
    {
      this.rGt.rGr.contentView.setScaleX(f);
      this.rGt.rGr.contentView.setScaleY(f);
      this.rGt.rGr.contentView.setAlpha(f);
    }
    AppMethodBeat.o(40040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.h.1
 * JD-Core Version:    0.6.2
 */