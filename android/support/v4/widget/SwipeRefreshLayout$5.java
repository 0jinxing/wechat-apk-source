package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class SwipeRefreshLayout$5
  implements Animation.AnimationListener
{
  SwipeRefreshLayout$5(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (!this.Sy.Sd)
      this.Sy.a(null);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.5
 * JD-Core Version:    0.6.2
 */