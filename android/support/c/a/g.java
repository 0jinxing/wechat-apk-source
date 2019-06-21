package android.support.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

public final class g
  implements Interpolator
{
  private float[] uH;
  private float[] uI;

  public g(Context paramContext, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    this(paramContext.getResources(), paramContext.getTheme(), paramAttributeSet, paramXmlPullParser);
  }

  private g(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    paramResources = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.ut);
    if (android.support.v4.content.a.c.a(paramXmlPullParser, "pathData"))
    {
      paramAttributeSet = android.support.v4.content.a.c.b(paramResources, paramXmlPullParser, "pathData", 4);
      paramTheme = android.support.v4.a.c.K(paramAttributeSet);
      if (paramTheme == null)
        throw new InflateException("The path is null, which is created from ".concat(String.valueOf(paramAttributeSet)));
      a(paramTheme);
    }
    while (true)
    {
      paramResources.recycle();
      return;
      if (!android.support.v4.content.a.c.a(paramXmlPullParser, "controlX1"))
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
      if (!android.support.v4.content.a.c.a(paramXmlPullParser, "controlY1"))
        throw new InflateException("pathInterpolator requires the controlY1 attribute");
      float f1 = android.support.v4.content.a.c.a(paramResources, paramXmlPullParser, "controlX1", 0, 0.0F);
      float f2 = android.support.v4.content.a.c.a(paramResources, paramXmlPullParser, "controlY1", 1, 0.0F);
      boolean bool = android.support.v4.content.a.c.a(paramXmlPullParser, "controlX2");
      if (bool != android.support.v4.content.a.c.a(paramXmlPullParser, "controlY2"))
        throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
      if (!bool)
      {
        paramTheme = new Path();
        paramTheme.moveTo(0.0F, 0.0F);
        paramTheme.quadTo(f1, f2, 1.0F, 1.0F);
        a(paramTheme);
      }
      else
      {
        float f3 = android.support.v4.content.a.c.a(paramResources, paramXmlPullParser, "controlX2", 2, 0.0F);
        float f4 = android.support.v4.content.a.c.a(paramResources, paramXmlPullParser, "controlY2", 3, 0.0F);
        paramTheme = new Path();
        paramTheme.moveTo(0.0F, 0.0F);
        paramTheme.cubicTo(f1, f2, f3, f4, 1.0F, 1.0F);
        a(paramTheme);
      }
    }
  }

  private void a(Path paramPath)
  {
    PathMeasure localPathMeasure = new PathMeasure(paramPath, false);
    float f1 = localPathMeasure.getLength();
    int i = Math.min(3000, (int)(f1 / 0.002F) + 1);
    if (i <= 0)
      throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(f1)));
    this.uH = new float[i];
    this.uI = new float[i];
    paramPath = new float[2];
    for (int j = 0; j < i; j++)
    {
      localPathMeasure.getPosTan(j * f1 / (i - 1), paramPath, null);
      this.uH[j] = paramPath[0];
      this.uI[j] = paramPath[1];
    }
    if ((Math.abs(this.uH[0]) > 1.E-005D) || (Math.abs(this.uI[0]) > 1.E-005D) || (Math.abs(this.uH[(i - 1)] - 1.0F) > 1.E-005D) || (Math.abs(this.uI[(i - 1)] - 1.0F) > 1.E-005D))
      throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.uH[0] + "," + this.uI[0] + " end:" + this.uH[(i - 1)] + "," + this.uI[(i - 1)]);
    f1 = 0.0F;
    int k = 0;
    j = 0;
    while (j < i)
    {
      float f2 = this.uH[k];
      if (f2 < f1)
        throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
      this.uH[j] = f2;
      j++;
      k++;
      f1 = f2;
    }
    if (localPathMeasure.nextContour())
      throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
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
          f = (paramFloat - this.uH[j]) / f;
          paramFloat = this.uI[j];
          paramFloat = f * (this.uI[i] - paramFloat) + paramFloat;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.g
 * JD-Core Version:    0.6.2
 */