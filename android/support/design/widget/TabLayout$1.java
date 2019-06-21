package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class TabLayout$1
  implements ValueAnimator.AnimatorUpdateListener
{
  TabLayout$1(TabLayout paramTabLayout)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.sy.scrollTo(((Integer)paramValueAnimator.getAnimatedValue()).intValue(), 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.1
 * JD-Core Version:    0.6.2
 */