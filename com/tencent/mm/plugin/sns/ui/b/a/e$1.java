package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.c;

final class e$1
  implements ValueAnimator.AnimatorUpdateListener
{
  e$1(e parame)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40022);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 0.0F)
    {
      this.rGo.rGm.contentView.setScaleX(f);
      this.rGo.rGm.contentView.setScaleY(f);
      this.rGo.rGm.contentView.setAlpha(f);
    }
    AppMethodBeat.o(40022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.e.1
 * JD-Core Version:    0.6.2
 */