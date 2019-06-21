package com.tencent.mm.plugin.sns.ui.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements ValueAnimator.AnimatorUpdateListener
{
  c$1(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40006);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rFV.view.setAlpha(1.0F - f);
    if (f != 0.0F)
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.rFV.view.getLayoutParams();
      localLayoutParams.leftMargin = ((int)(this.rFV.rFP * f));
      localLayoutParams.topMargin = ((int)(this.rFV.rFQ * f));
      paramValueAnimator = (ViewGroup)this.rFV.view.getParent();
      localLayoutParams.rightMargin = ((int)(paramValueAnimator.getWidth() * f - this.rFV.rFR * f - localLayoutParams.leftMargin));
      localLayoutParams.bottomMargin = ((int)(paramValueAnimator.getHeight() * f - this.rFV.rFS * f - localLayoutParams.topMargin));
      this.rFV.view.setLayoutParams(localLayoutParams);
    }
    if (this.rFV.rFT != null)
      this.rFV.rFT.aZ(f);
    AppMethodBeat.o(40006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.c.1
 * JD-Core Version:    0.6.2
 */