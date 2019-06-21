package com.tencent.mm.plugin.sns.ui.b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements ValueAnimator.AnimatorUpdateListener
{
  b$1(b paramb)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40002);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.rFU.view.setAlpha(1.0F - f);
    if (f != 1.0F)
    {
      paramValueAnimator = (FrameLayout.LayoutParams)this.rFU.view.getLayoutParams();
      paramValueAnimator.leftMargin = ((int)(this.rFU.rFP * f));
      paramValueAnimator.topMargin = ((int)(this.rFU.rFQ * f));
      ViewGroup localViewGroup = (ViewGroup)this.rFU.view.getParent();
      paramValueAnimator.rightMargin = ((int)(localViewGroup.getWidth() * f - this.rFU.rFR * f - paramValueAnimator.leftMargin));
      paramValueAnimator.bottomMargin = ((int)(localViewGroup.getHeight() * f - this.rFU.rFS * f - paramValueAnimator.topMargin));
      this.rFU.view.setLayoutParams(paramValueAnimator);
    }
    if (this.rFU.rFT != null)
      this.rFU.rFT.aZ(f);
    AppMethodBeat.o(40002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.b.1
 * JD-Core Version:    0.6.2
 */