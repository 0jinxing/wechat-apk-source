package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class d
  implements Interpolator
{
  private final float Os;
  private final float[] yh;

  protected d(float[] paramArrayOfFloat)
  {
    this.yh = paramArrayOfFloat;
    this.Os = (1.0F / (this.yh.length - 1));
  }

  public float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    if (paramFloat >= 1.0F)
      paramFloat = f;
    while (true)
    {
      return paramFloat;
      if (paramFloat <= 0.0F)
      {
        paramFloat = 0.0F;
      }
      else
      {
        int i = Math.min((int)((this.yh.length - 1) * paramFloat), this.yh.length - 2);
        paramFloat = (paramFloat - i * this.Os) / this.Os;
        f = this.yh[i];
        paramFloat = (this.yh[(i + 1)] - this.yh[i]) * paramFloat + f;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.b.d
 * JD-Core Version:    0.6.2
 */