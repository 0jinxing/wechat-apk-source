package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class SwipeRefreshLayout$3 extends Animation
{
  SwipeRefreshLayout$3(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this.Sy.setAnimationProgress(1.0F - paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.3
 * JD-Core Version:    0.6.2
 */