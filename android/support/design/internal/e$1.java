package android.support.design.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

final class e$1
  implements ValueAnimator.AnimatorUpdateListener
{
  e$1(e parame, TextView paramTextView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.md.setScaleX(f);
    this.md.setScaleY(f);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.design.internal.e.1
 * JD-Core Version:    0.6.2
 */