package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class AppBarLayout$Behavior$1
  implements ValueAnimator.AnimatorUpdateListener
{
  AppBarLayout$Behavior$1(AppBarLayout.Behavior paramBehavior, CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.mE.c(this.mC, this.mD, ((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.AppBarLayout.Behavior.1
 * JD-Core Version:    0.6.2
 */