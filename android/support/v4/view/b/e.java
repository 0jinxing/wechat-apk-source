package android.support.v4.view.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

final class e
  implements Interpolator
{
  private final float[] uH;
  private final float[] uI;

  e(Path paramPath)
  {
    PathMeasure localPathMeasure = new PathMeasure(paramPath, false);
    float f = localPathMeasure.getLength();
    int i = (int)(f / 0.002F) + 1;
    this.uH = new float[i];
    this.uI = new float[i];
    paramPath = new float[2];
    for (int j = 0; j < i; j++)
    {
      localPathMeasure.getPosTan(j * f / (i - 1), paramPath, null);
      this.uH[j] = paramPath[0];
      this.uI[j] = paramPath[1];
    }
  }

  public final float getInterpolation(float paramFloat)
  {
    float f = 0.0F;
    if (paramFloat <= 0.0F)
      paramFloat = f;
    while (true)
    {
      return paramFloat;
      if (paramFloat >= 1.0F)
      {
        paramFloat = 1.0F;
      }
      else
      {
        int i = this.uH.length - 1;
        int j = 0;
        while (i - j > 1)
        {
          int k = (j + i) / 2;
          if (paramFloat < this.uH[k])
            i = k;
          else
            j = k;
        }
        f = this.uH[i] - this.uH[j];
        if (f == 0.0F)
        {
          paramFloat = this.uI[j];
        }
        else
        {
          paramFloat = (paramFloat - this.uH[j]) / f;
          f = this.uI[j];
          paramFloat = paramFloat * (this.uI[i] - f) + f;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.view.b.e
 * JD-Core Version:    0.6.2
 */