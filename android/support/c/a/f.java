package android.support.c.a;

import android.animation.TypeEvaluator;

public final class f
  implements TypeEvaluator
{
  private static final f uG = new f();

  public static f cF()
  {
    return uG;
  }

  public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
  {
    int i = ((Integer)paramObject1).intValue();
    float f1 = (i >> 24 & 0xFF) / 255.0F;
    float f2 = (i >> 16 & 0xFF) / 255.0F;
    float f3 = (i >> 8 & 0xFF) / 255.0F;
    float f4 = (i & 0xFF) / 255.0F;
    i = ((Integer)paramObject2).intValue();
    float f5 = (i >> 24 & 0xFF) / 255.0F;
    float f6 = (i >> 16 & 0xFF) / 255.0F;
    float f7 = (i >> 8 & 0xFF) / 255.0F;
    float f8 = (i & 0xFF) / 255.0F;
    f2 = (float)Math.pow(f2, 2.2D);
    f3 = (float)Math.pow(f3, 2.2D);
    f4 = (float)Math.pow(f4, 2.2D);
    f6 = (float)Math.pow(f6, 2.2D);
    f7 = (float)Math.pow(f7, 2.2D);
    f8 = (float)Math.pow(f8, 2.2D);
    f2 = (float)Math.pow(f2 + (f6 - f2) * paramFloat, 0.4545454545454545D);
    f3 = (float)Math.pow(f3 + (f7 - f3) * paramFloat, 0.4545454545454545D);
    f4 = (float)Math.pow(f4 + (f8 - f4) * paramFloat, 0.4545454545454545D);
    i = Math.round((f1 + (f5 - f1) * paramFloat) * 255.0F);
    int j = Math.round(f2 * 255.0F);
    int k = Math.round(f3 * 255.0F);
    return Integer.valueOf(Math.round(f4 * 255.0F) | (i << 24 | j << 16 | k << 8));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.c.a.f
 * JD-Core Version:    0.6.2
 */