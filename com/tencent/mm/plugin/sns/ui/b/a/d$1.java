package com.tencent.mm.plugin.sns.ui.b.a;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.c.a.b;

final class d$1
  implements ValueAnimator.AnimatorUpdateListener
{
  d$1(d paramd)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40016);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 1.0D)
    {
      paramValueAnimator = (FrameLayout.LayoutParams)this.rGk.rFX.contentView.getLayoutParams();
      paramValueAnimator.leftMargin = ((int)(this.rGk.rGj.leftMargin * f));
      paramValueAnimator.rightMargin = ((int)(this.rGk.rGj.rightMargin * f));
      paramValueAnimator.topMargin = ((int)(this.rGk.rGj.topMargin * f));
      paramValueAnimator.bottomMargin = ((int)(this.rGk.rGj.bottomMargin * f));
      this.rGk.rFX.contentView.setLayoutParams(paramValueAnimator);
      this.rGk.rFX.rGN.setScaleX(f);
      this.rGk.rFX.rGN.setScaleY(f);
      this.rGk.rFX.rGN.setAlpha(f);
    }
    AppMethodBeat.o(40016);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.d.1
 * JD-Core Version:    0.6.2
 */