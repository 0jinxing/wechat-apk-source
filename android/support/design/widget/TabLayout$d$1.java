package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class TabLayout$d$1
  implements ValueAnimator.AnimatorUpdateListener
{
  TabLayout$d$1(TabLayout.d paramd, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = paramValueAnimator.getAnimatedFraction();
    this.sM.n(a.b(this.sI, this.sJ, f), a.b(this.sK, this.sL, f));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.d.1
 * JD-Core Version:    0.6.2
 */