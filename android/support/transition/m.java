package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

final class m
  implements o
{
  public final void a(ImageView paramImageView)
  {
    ImageView.ScaleType localScaleType = paramImageView.getScaleType();
    paramImageView.setTag(2131820664, localScaleType);
    if (localScaleType == ImageView.ScaleType.MATRIX)
      paramImageView.setTag(2131820662, paramImageView.getImageMatrix());
    while (true)
    {
      paramImageView.setImageMatrix(p.vt);
      return;
      paramImageView.setScaleType(ImageView.ScaleType.MATRIX);
    }
  }

  public final void a(ImageView paramImageView, Animator paramAnimator)
  {
    paramAnimator.addListener(new m.1(this, paramImageView));
  }

  public final void a(ImageView paramImageView, Matrix paramMatrix)
  {
    paramImageView.setImageMatrix(paramMatrix);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.m
 * JD-Core Version:    0.6.2
 */