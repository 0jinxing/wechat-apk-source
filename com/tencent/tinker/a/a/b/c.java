package com.tencent.tinker.a.a.b;

public final class c
{
  private static int a(byte paramByte1, byte paramByte2)
  {
    if (paramByte1 == paramByte2)
      paramByte1 = 0;
    while (true)
    {
      return paramByte1;
      if ((paramByte1 & 0xFF) < (paramByte2 & 0xFF))
        paramByte1 = -1;
      else
        paramByte1 = 1;
    }
  }

  public static <T extends Comparable<T>> int a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    int i = paramArrayOfT1.length;
    int j = paramArrayOfT2.length;
    if (i < j)
      j = -1;
    while (true)
    {
      return j;
      if (i > j)
      {
        j = 1;
      }
      else
      {
        for (int k = 0; ; k++)
        {
          if (k >= i)
            break label63;
          int m = paramArrayOfT1[k].compareTo(paramArrayOfT2[k]);
          j = m;
          if (m != 0)
            break;
        }
        label63: j = 0;
      }
    }
  }

  public static int a(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    int i = paramArrayOfShort1.length;
    int j = paramArrayOfShort2.length;
    if (i < j)
      j = -1;
    while (true)
    {
      return j;
      if (i > j)
      {
        j = 1;
      }
      else
      {
        for (int k = 0; ; k++)
        {
          if (k >= i)
            break label61;
          int m = b(paramArrayOfShort1[k], paramArrayOfShort2[k]);
          j = m;
          if (m != 0)
            break;
        }
        label61: j = 0;
      }
    }
  }

  public static int b(short paramShort1, short paramShort2)
  {
    if (paramShort1 == paramShort2)
      paramShort1 = 0;
    while (true)
    {
      return paramShort1;
      if ((paramShort1 & 0xFFFF) < (0xFFFF & paramShort2))
        paramShort1 = -1;
      else
        paramShort1 = 1;
    }
  }

  public static int b(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt1.length;
    int j = paramArrayOfInt2.length;
    if (i < j)
      j = -1;
    while (true)
    {
      return j;
      if (i > j)
      {
        j = 1;
      }
      else
      {
        for (int k = 0; ; k++)
        {
          if (k >= i)
            break label61;
          int m = hY(paramArrayOfInt1[k], paramArrayOfInt2[k]);
          j = m;
          if (m != 0)
            break;
        }
        label61: j = 0;
      }
    }
  }

  public static int hX(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2)
      paramInt1 = 0;
    while (true)
    {
      return paramInt1;
      if ((paramInt1 & 0xFFFFFFFF) < (paramInt2 & 0xFFFFFFFF))
        paramInt1 = -1;
      else
        paramInt1 = 1;
    }
  }

  public static int hY(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2)
      paramInt1 = 0;
    while (true)
    {
      return paramInt1;
      if (paramInt1 < paramInt2)
        paramInt1 = -1;
      else
        paramInt1 = 1;
    }
  }

  public static int o(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    int j = paramArrayOfByte2.length;
    if (i < j)
      j = -1;
    while (true)
    {
      return j;
      if (i > j)
      {
        j = 1;
      }
      else
      {
        for (int k = 0; ; k++)
        {
          if (k >= i)
            break label61;
          int m = a(paramArrayOfByte1[k], paramArrayOfByte2[k]);
          j = m;
          if (m != 0)
            break;
        }
        label61: j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.b.c
 * JD-Core Version:    0.6.2
 */