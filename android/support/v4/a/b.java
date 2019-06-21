package android.support.v4.a;

import android.graphics.Color;

public final class b
{
  private static final ThreadLocal<double[]> GZ = new ThreadLocal();

  public static void a(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat)
  {
    float f1 = paramInt1 / 255.0F;
    float f2 = paramInt2 / 255.0F;
    float f3 = paramInt3 / 255.0F;
    float f4 = Math.max(f1, Math.max(f2, f3));
    float f5 = Math.min(f1, Math.min(f2, f3));
    float f6 = f4 - f5;
    float f7 = (f4 + f5) / 2.0F;
    if (f4 == f5)
    {
      f4 = 0.0F;
      f6 = 0.0F;
      f1 = f6 * 60.0F % 360.0F;
      f6 = f1;
      if (f1 < 0.0F)
        f6 = f1 + 360.0F;
      paramArrayOfFloat[0] = s(f6, 360.0F);
      paramArrayOfFloat[1] = s(f4, 1.0F);
      paramArrayOfFloat[2] = s(f7, 1.0F);
      return;
    }
    if (f4 == f1)
      f4 = (f2 - f3) / f6 % 6.0F;
    while (true)
    {
      f1 = f6 / (1.0F - Math.abs(2.0F * f7 - 1.0F));
      f6 = f4;
      f4 = f1;
      break;
      if (f4 == f2)
        f4 = (f3 - f1) / f6 + 2.0F;
      else
        f4 = (f1 - f2) / f6 + 4.0F;
    }
  }

  private static double au(int paramInt)
  {
    double[] arrayOfDouble1 = (double[])GZ.get();
    double[] arrayOfDouble2 = arrayOfDouble1;
    if (arrayOfDouble1 == null)
    {
      arrayOfDouble2 = new double[3];
      GZ.set(arrayOfDouble2);
    }
    int i = Color.red(paramInt);
    int j = Color.green(paramInt);
    paramInt = Color.blue(paramInt);
    if (arrayOfDouble2.length != 3)
      throw new IllegalArgumentException("outXyz must have a length of 3.");
    double d1 = i / 255.0D;
    double d2;
    label110: double d3;
    if (d1 < 0.04045D)
    {
      d1 /= 12.92D;
      d2 = j / 255.0D;
      if (d2 >= 0.04045D)
        break label245;
      d2 /= 12.92D;
      d3 = paramInt / 255.0D;
      if (d3 >= 0.04045D)
        break label266;
    }
    label266: for (d3 /= 12.92D; ; d3 = Math.pow((d3 + 0.055D) / 1.055D, 2.4D))
    {
      arrayOfDouble2[0] = (100.0D * (0.4124D * d1 + 0.3576D * d2 + 0.1805D * d3));
      arrayOfDouble2[1] = (100.0D * (0.2126D * d1 + 0.7152D * d2 + 0.0722D * d3));
      arrayOfDouble2[2] = ((d3 * 0.9505D + (d2 * 0.1192D + d1 * 0.0193D)) * 100.0D);
      return arrayOfDouble2[1] / 100.0D;
      d1 = Math.pow((d1 + 0.055D) / 1.055D, 2.4D);
      break;
      label245: d2 = Math.pow((d2 + 0.055D) / 1.055D, 2.4D);
      break label110;
    }
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0);
    for (paramInt1 = 0; ; paramInt1 = (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255))
      return paramInt1;
  }

  public static int d(int paramInt1, int paramInt2, float paramFloat)
  {
    int i = 255;
    if (Color.alpha(paramInt2) != 255)
      throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(paramInt2));
    if (t(u(paramInt1, 255), paramInt2) < paramFloat)
      j = -1;
    int k;
    int m;
    do
    {
      do
      {
        return j;
        k = 0;
        m = 0;
        j = i;
      }
      while (m > 10);
      j = i;
    }
    while (i - k <= 1);
    int j = (k + i) / 2;
    if (t(u(paramInt1, j), paramInt2) < paramFloat)
      k = j;
    while (true)
    {
      m++;
      break;
      i = j;
    }
  }

  public static void d(int paramInt, float[] paramArrayOfFloat)
  {
    a(Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt), paramArrayOfFloat);
  }

  private static float s(float paramFloat1, float paramFloat2)
  {
    float f;
    if (paramFloat1 < 0.0F)
      f = 0.0F;
    while (true)
    {
      return f;
      f = paramFloat2;
      if (paramFloat1 <= paramFloat2)
        f = paramFloat1;
    }
  }

  public static int s(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = 255 - (255 - i) * (255 - j) / 255;
    return Color.argb(k, b(Color.red(paramInt1), j, Color.red(paramInt2), i, k), b(Color.green(paramInt1), j, Color.green(paramInt2), i, k), b(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
  }

  private static double t(int paramInt1, int paramInt2)
  {
    if (Color.alpha(paramInt2) != 255)
      throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(paramInt2));
    int i = paramInt1;
    if (Color.alpha(paramInt1) < 255)
      i = s(paramInt1, paramInt2);
    double d1 = au(i) + 0.05D;
    double d2 = au(paramInt2) + 0.05D;
    return Math.max(d1, d2) / Math.min(d1, d2);
  }

  public static int u(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) || (paramInt2 > 255))
      throw new IllegalArgumentException("alpha must be between 0 and 255.");
    return 0xFFFFFF & paramInt1 | paramInt2 << 24;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.b
 * JD-Core Version:    0.6.2
 */