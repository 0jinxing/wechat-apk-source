package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.s;

final class b$9
  implements ValueAnimator.AnimatorUpdateListener
{
  private int mS = this.mU;

  b$9(b paramb, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    if (b.access$100())
      s.q(this.mR.mM, i - this.mS);
    while (true)
    {
      this.mS = i;
      return;
      this.mR.mM.setTranslationY(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.b.9
 * JD-Core Version:    0.6.2
 */