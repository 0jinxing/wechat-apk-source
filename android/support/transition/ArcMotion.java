package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion
{
  private static final float xd = (float)Math.tan(Math.toRadians(35.0D));
  private float xe = 0.0F;
  private float xf = 0.0F;
  private float xg = 70.0F;
  private float xh = 0.0F;
  private float xi = 0.0F;
  private float xj = xd;

  public ArcMotion()
  {
  }

  public ArcMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zF);
    paramAttributeSet = (XmlPullParser)paramAttributeSet;
    float f = c.a(paramContext, paramAttributeSet, "minimumVerticalAngle", 1, 0.0F);
    this.xf = f;
    this.xi = r(f);
    f = c.a(paramContext, paramAttributeSet, "minimumHorizontalAngle", 0, 0.0F);
    this.xe = f;
    this.xh = r(f);
    f = c.a(paramContext, paramAttributeSet, "maximumAngle", 2, 70.0F);
    this.xg = f;
    this.xj = r(f);
    paramContext.recycle();
  }

  private static float r(float paramFloat)
  {
    if ((paramFloat < 0.0F) || (paramFloat > 90.0F))
      throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    return (float)Math.tan(Math.toRadians(paramFloat / 2.0F));
  }

  public final Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(paramFloat1, paramFloat2);
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = f2 * f2 + f1 * f1;
    float f4 = (paramFloat1 + paramFloat3) / 2.0F;
    float f5 = (paramFloat2 + paramFloat4) / 2.0F;
    float f6 = f3 * 0.25F;
    int i;
    label113: float f8;
    if (paramFloat2 > paramFloat4)
    {
      i = 1;
      if (Math.abs(f1) >= Math.abs(f2))
        break label275;
      f3 = Math.abs(f3 / (2.0F * f2));
      if (i == 0)
        break label263;
      f2 = paramFloat4 + f3;
      f3 = paramFloat3;
      f1 = this.xi * f6 * this.xi;
      float f7 = f4 - f3;
      f8 = f5 - f2;
      f8 = f8 * f8 + f7 * f7;
      f6 = this.xj * f6 * this.xj;
      if (f8 >= f1)
        break label328;
    }
    while (true)
    {
      label176: if (f1 != 0.0F)
      {
        f1 = (float)Math.sqrt(f1 / f8);
        f2 = (f2 - f5) * f1 + f5;
        f3 = (f3 - f4) * f1 + f4;
      }
      while (true)
      {
        localPath.cubicTo((paramFloat1 + f3) / 2.0F, (paramFloat2 + f2) / 2.0F, (f3 + paramFloat3) / 2.0F, (f2 + paramFloat4) / 2.0F, paramFloat3, paramFloat4);
        return localPath;
        i = 0;
        break;
        label263: f2 = paramFloat2 + f3;
        f3 = paramFloat1;
        break label113;
        label275: f3 /= f1 * 2.0F;
        if (i != 0)
          f3 += paramFloat1;
        for (f2 = paramFloat2; ; f2 = paramFloat4)
        {
          f1 = this.xh * f6 * this.xh;
          break;
          f3 = paramFloat3 - f3;
        }
        label328: if (f8 <= f6)
          break label346;
        f1 = f6;
        break label176;
      }
      label346: f1 = 0.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.ArcMotion
 * JD-Core Version:    0.6.2
 */