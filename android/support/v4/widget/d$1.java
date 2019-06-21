package android.support.v4.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class d$1
  implements ValueAnimator.AnimatorUpdateListener
{
  d$1(d paramd, d.a parama)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    d.b(f, this.Pg);
    d.a(this.Ph, f, this.Pg, false);
    this.Ph.invalidateSelf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d.1
 * JD-Core Version:    0.6.2
 */