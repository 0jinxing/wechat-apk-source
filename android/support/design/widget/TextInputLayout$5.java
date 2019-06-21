package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class TextInputLayout$5
  implements ValueAnimator.AnimatorUpdateListener
{
  TextInputLayout$5(TextInputLayout paramTextInputLayout)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.tS.oU.i(((Float)paramValueAnimator.getAnimatedValue()).floatValue());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout.5
 * JD-Core Version:    0.6.2
 */