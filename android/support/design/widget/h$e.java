package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

abstract class h$e extends AnimatorListenerAdapter
  implements ValueAnimator.AnimatorUpdateListener
{
  private boolean qI;
  private float qJ;
  private float qK;

  private h$e(h paramh)
  {
  }

  protected abstract float cm();

  public void onAnimationEnd(Animator paramAnimator)
  {
    this.qH.qu.o(this.qK);
    this.qI = false;
  }

  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    if (!this.qI)
    {
      this.qJ = this.qH.qu.rk;
      this.qK = cm();
      this.qI = true;
    }
    this.qH.qu.o(this.qJ + (this.qK - this.qJ) * paramValueAnimator.getAnimatedFraction());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.h.e
 * JD-Core Version:    0.6.2
 */