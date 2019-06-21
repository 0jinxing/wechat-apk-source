package com.tencent.tencentmap.mapsdk.maps.a;

public class fh
{
  public static double a(long paramLong1, float paramFloat1, float paramFloat2, long paramLong2)
  {
    return (float)paramLong1 * paramFloat2 / (float)paramLong2 + paramFloat1;
  }

  public static double b(long paramLong1, float paramFloat1, float paramFloat2, long paramLong2)
  {
    float f = (float)paramLong1 / (float)paramLong2;
    return (f - 2.0F) * (-paramFloat2 * f) + paramFloat1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fh
 * JD-Core Version:    0.6.2
 */