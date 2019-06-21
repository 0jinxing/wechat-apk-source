package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class SwipeRefreshLayout$8 extends Animation
{
  SwipeRefreshLayout$8(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.Sy.Si;
    float f2 = -this.Sy.Si;
    this.Sy.setAnimationProgress(f1 + f2 * paramFloat);
    this.Sy.L(paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.8
 * JD-Core Version:    0.6.2
 */