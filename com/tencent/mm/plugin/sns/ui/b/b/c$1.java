package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;

final class c$1
  implements ValueAnimator.AnimatorUpdateListener
{
  c$1(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40046);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 0.0F)
    {
      paramValueAnimator = (FrameLayout.LayoutParams)this.rGv.rGu.rIE.getLayoutParams();
      paramValueAnimator.leftMargin = ((int)(this.rGv.rGf.leftMargin * f));
      paramValueAnimator.rightMargin = ((int)(this.rGv.rGf.rightMargin * f));
      paramValueAnimator.topMargin = ((int)(this.rGv.rGf.topMargin * f));
      paramValueAnimator.bottomMargin = ((int)(this.rGv.rGf.bottomMargin * f));
      this.rGv.rGu.rIE.setLayoutParams(paramValueAnimator);
      this.rGv.rGu.rIF.setScaleX(f);
      this.rGv.rGu.rIF.setScaleY(f);
      this.rGv.rGu.rIF.setAlpha(f);
    }
    AppMethodBeat.o(40046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.c.1
 * JD-Core Version:    0.6.2
 */