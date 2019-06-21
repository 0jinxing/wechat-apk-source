package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class SwipeRefreshLayout$6 extends Animation
{
  SwipeRefreshLayout$6(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (!this.Sy.St);
    for (int i = this.Sy.Sk - Math.abs(this.Sy.Sj); ; i = this.Sy.Sk)
    {
      int j = this.Sy.mFrom;
      i = (int)((i - this.Sy.mFrom) * paramFloat);
      int k = this.Sy.Sg.getTop();
      this.Sy.setTargetOffsetTopAndBottom(i + j - k);
      this.Sy.Sl.B(1.0F - paramFloat);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout.6
 * JD-Core Version:    0.6.2
 */