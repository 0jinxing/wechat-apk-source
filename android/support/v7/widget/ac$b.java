package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

final class ac$b
  implements ValueAnimator.AnimatorUpdateListener
{
  private ac$b(ac paramac)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
    ac.d(this.aiJ).setAlpha(i);
    ac.e(this.aiJ).setAlpha(i);
    ac.c(this.aiJ);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ac.b
 * JD-Core Version:    0.6.2
 */