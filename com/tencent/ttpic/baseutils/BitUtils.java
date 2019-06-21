package com.tencent.ttpic.baseutils;

public class BitUtils
{
  public static final int BIT_TURN_ZERO_1 = 65534;
  public static final int BIT_TURN_ZERO_2 = 65533;
  public static final int BIT_TURN_ZERO_3 = 65531;
  public static final int BIT_TURN_ZERO_4 = 65527;

  public static boolean checkBit(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int turnBitTo0(int paramInt1, int paramInt2)
  {
    return paramInt1 & paramInt2;
  }

  public static int turnBitTo1(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.BitUtils
 * JD-Core Version:    0.6.2
 */