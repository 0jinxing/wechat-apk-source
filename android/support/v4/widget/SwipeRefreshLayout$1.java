package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class SwipeRefreshLayout$1
  implements Animation.AnimationListener
{
  SwipeRefreshLayout$1(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.Sy.RT)
    {
      this.Sy.Sl.setAlpha(255);
      this.Sy.Sl.start();
      this.Sy.Sb = this.Sy.Sg.getTop();
    }
    while (true)
    {
      return;
      this.Sy.reset();
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.1
 * JD-Core Version:    0.6.2
 */