package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion
{
  private final Matrix ya = new Matrix();
  private Path zg;
  private final Path zi = new Path();

  public PatternPathMotion()
  {
    this.zi.lineTo(1.0F, 0.0F);
    this.zg = this.zi;
  }

  public PatternPathMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zG);
    try
    {
      paramAttributeSet = android.support.v4.content.a.c.b(paramContext, (XmlPullParser)paramAttributeSet, "patternPathData", 0);
      if (paramAttributeSet == null)
      {
        paramAttributeSet = new java/lang/RuntimeException;
        paramAttributeSet.<init>("pathData must be supplied for patternPathMotion");
        throw paramAttributeSet;
      }
    }
    finally
    {
      paramContext.recycle();
    }
    Path localPath = android.support.v4.a.c.K(paramAttributeSet);
    paramAttributeSet = new android/graphics/PathMeasure;
    paramAttributeSet.<init>(localPath, false);
    float f1 = paramAttributeSet.getLength();
    float[] arrayOfFloat = new float[2];
    paramAttributeSet.getPosTan(f1, arrayOfFloat, null);
    f1 = arrayOfFloat[0];
    float f2 = arrayOfFloat[1];
    paramAttributeSet.getPosTan(0.0F, arrayOfFloat, null);
    float f3 = arrayOfFloat[0];
    float f4 = arrayOfFloat[1];
    if ((f3 == f1) && (f4 == f2))
    {
      paramAttributeSet = new java/lang/IllegalArgumentException;
      paramAttributeSet.<init>("pattern must not end at the starting point");
      throw paramAttributeSet;
    }
    this.ya.setTranslate(-f3, -f4);
    f1 -= f3;
    f4 = f2 - f4;
    f2 = 1.0F / r(f1, f4);
    this.ya.postScale(f2, f2);
    double d = Math.atan2(f4, f1);
    this.ya.postRotate((float)Math.toDegrees(-d));
    localPath.transform(this.ya, this.zi);
    this.zg = localPath;
    paramContext.recycle();
  }

  private static float r(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }

  public final Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 -= paramFloat1;
    paramFloat4 -= paramFloat2;
    float f = r(paramFloat3, paramFloat4);
    double d = Math.atan2(paramFloat4, paramFloat3);
    this.ya.setScale(f, f);
    this.ya.postRotate((float)Math.toDegrees(d));
    this.ya.postTranslate(paramFloat1, paramFloat2);
    Path localPath = new Path();
    this.zi.transform(this.ya, localPath);
    return localPath;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.PatternPathMotion
 * JD-Core Version:    0.6.2
 */