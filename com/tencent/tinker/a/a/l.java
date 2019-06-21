package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;
import com.tencent.tinker.a.a.b.b;

public final class l
{
  public static int a(a parama, int paramInt)
  {
    int i = 0;
    for (int j = paramInt; j >= 0; j--)
      i = i >>> 8 | (parama.readByte() & 0xFF) << 24;
    return i >> (3 - paramInt) * 8;
  }

  public static int a(a parama, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = paramInt;
    if (!paramBoolean)
    {
      i = paramInt;
      k = j;
      while (i >= 0)
      {
        k = k >>> 8 | (parama.readByte() & 0xFF) << 24;
        i--;
      }
      paramInt = k >>> (3 - paramInt) * 8;
      return paramInt;
    }
    while (true)
    {
      paramInt = i;
      if (k < 0)
        break;
      i = i >>> 8 | (parama.readByte() & 0xFF) << 24;
      k--;
    }
  }

  public static void a(b paramb, int paramInt, long paramLong)
  {
    int i = 65 - Long.numberOfLeadingZeros(paramLong >> 63 ^ paramLong) + 7 >> 3;
    paramb.writeByte(i - 1 << 5 | paramInt);
    for (paramInt = i; paramInt > 0; paramInt--)
    {
      paramb.writeByte((byte)(int)paramLong);
      paramLong >>= 8;
    }
  }

  public static void b(b paramb, int paramInt, long paramLong)
  {
    int i = 64 - Long.numberOfLeadingZeros(paramLong);
    int j = i;
    if (i == 0)
      j = 1;
    j = j + 7 >> 3;
    paramb.writeByte(j - 1 << 5 | paramInt);
    for (paramInt = j; paramInt > 0; paramInt--)
    {
      paramb.writeByte((byte)(int)paramLong);
      paramLong >>= 8;
    }
  }

  public static void c(b paramb, int paramInt, long paramLong)
  {
    int i = 64 - Long.numberOfTrailingZeros(paramLong);
    int j = i;
    if (i == 0)
      j = 1;
    j = j + 7 >> 3;
    paramLong >>= 64 - j * 8;
    paramb.writeByte(j - 1 << 5 | paramInt);
    for (paramInt = j; paramInt > 0; paramInt--)
    {
      paramb.writeByte((byte)(int)paramLong);
      paramLong >>= 8;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.l
 * JD-Core Version:    0.6.2
 */