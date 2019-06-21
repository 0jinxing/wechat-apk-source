package com.tencent.mm.plugin.emoji.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScaleRelativeLayout$1
  implements ValueAnimator.AnimatorUpdateListener
{
  ScaleRelativeLayout$1(ScaleRelativeLayout paramScaleRelativeLayout)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(53859);
    ScaleRelativeLayout.a(this.lgI, ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    this.lgI.postInvalidate();
    AppMethodBeat.o(53859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout.1
 * JD-Core Version:    0.6.2
 */