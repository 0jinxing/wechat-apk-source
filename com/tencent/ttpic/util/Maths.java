package com.tencent.ttpic.util;

public class Maths
{
  public static final double NINETY_DEGREES = 1.570796326794897D;
  public static final double ONE_EIGHTY_DEGREES = 3.141592653589793D;
  public static final double ONE_TWENTY_DEGREES = 2.094395102393195D;
  private static final long POWER_CLAMP = 4294967295L;
  public static final double THREE_SIXTY_DEGREES = 6.283185307179586D;

  public static int power(int paramInt1, int paramInt2)
  {
    long l1 = 0xFFFFFFFF & paramInt2;
    long l2 = paramInt1;
    for (paramInt2 = 1; l1 != 0L; paramInt2 = paramInt1)
    {
      paramInt1 = paramInt2;
      if ((1L & l1) != 0L)
        paramInt1 = (int)(paramInt2 * l2);
      l1 >>>= 1;
      l2 *= l2;
    }
    return paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.Maths
 * JD-Core Version:    0.6.2
 */