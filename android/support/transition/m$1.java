package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

final class m$1 extends AnimatorListenerAdapter
{
  m$1(m paramm, ImageView paramImageView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    ImageView.ScaleType localScaleType = (ImageView.ScaleType)this.yW.getTag(2131820664);
    this.yW.setScaleType(localScaleType);
    this.yW.setTag(2131820664, null);
    if (localScaleType == ImageView.ScaleType.MATRIX)
    {
      this.yW.setImageMatrix((Matrix)this.yW.getTag(2131820662));
      this.yW.setTag(2131820662, null);
    }
    paramAnimator.removeListener(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.transition.m.1
 * JD-Core Version:    0.6.2
 */