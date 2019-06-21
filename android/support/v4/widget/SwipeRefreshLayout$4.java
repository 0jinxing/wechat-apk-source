package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class SwipeRefreshLayout$4 extends Animation
{
  SwipeRefreshLayout$4(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this.Sy.Sl.setAlpha((int)(this.Sz + (this.SA - this.Sz) * paramFloat));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.4
 * JD-Core Version:    0.6.2
 */