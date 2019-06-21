package com.tencent.mm.plugin.sns.ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SnsAdLandingPageFloatView$2
  implements ValueAnimator.AnimatorUpdateListener
{
  public SnsAdLandingPageFloatView$2(SnsAdLandingPageFloatView paramSnsAdLandingPageFloatView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(40439);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    SnsAdLandingPageFloatView.a(this.rMI).setScaleX(f);
    SnsAdLandingPageFloatView.a(this.rMI).setScaleY(f);
    AppMethodBeat.o(40439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView.2
 * JD-Core Version:    0.6.2
 */