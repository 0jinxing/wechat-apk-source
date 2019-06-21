package com.tencent.mm.plugin.sns.ui.b.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.a.a;

final class d$1
  implements ValueAnimator.AnimatorUpdateListener
{
  d$1(d paramd)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40053);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f != 1.0F)
    {
      paramValueAnimator = (FrameLayout.LayoutParams)this.rGw.rGu.rIE.getLayoutParams();
      paramValueAnimator.leftMargin = ((int)(this.rGw.rGj.leftMargin * f));
      paramValueAnimator.rightMargin = ((int)(this.rGw.rGj.rightMargin * f));
      paramValueAnimator.topMargin = ((int)(this.rGw.rGj.topMargin * f));
      paramValueAnimator.bottomMargin = ((int)(this.rGw.rGj.bottomMargin * f));
      this.rGw.rGu.rIE.setLayoutParams(paramValueAnimator);
      this.rGw.rGu.rIF.setScaleX(f);
      this.rGw.rGu.rIF.setScaleY(f);
      this.rGw.rGu.rIF.setAlpha(f);
    }
    AppMethodBeat.o(40053);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.d.1
 * JD-Core Version:    0.6.2
 */