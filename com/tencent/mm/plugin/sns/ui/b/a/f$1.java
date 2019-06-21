package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.c;

final class f$1
  implements ValueAnimator.AnimatorUpdateListener
{
  f$1(f paramf)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40028);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 0.0F)
    {
      this.rGq.rGp.contentView.setScaleX(f);
      this.rGq.rGp.contentView.setScaleY(f);
      this.rGq.rGp.contentView.setAlpha(f);
    }
    AppMethodBeat.o(40028);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.f.1
 * JD-Core Version:    0.6.2
 */