package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;
import com.tencent.tinker.a.a.b.b;

public final class o
{
  public static int a(a parama)
  {
    int i = -1;
    int j = 0;
    int k = 0;
    while (true)
    {
      int m = parama.readByte() & 0xFF;
      k = (m & 0x7F) << j * 7 | k;
      i <<= 7;
      j++;
      if (((m & 0x80) != 128) || (j >= 5))
      {
        if ((m & 0x80) == 128)
          throw new j("invalid LEB128 sequence");
        j = k;
        if ((i >> 1 & k) != 0)
          j = k | i;
        return j;
      }
    }
  }

  public static int a(b paramb, int paramInt)
  {
    int i = paramInt >>> 7;
    int j = 0;
    int k = paramInt;
    paramInt = i;
    while (paramInt != 0)
    {
      paramb.writeByte((byte)(k & 0x7F | 0x80));
      j++;
      k = paramInt;
      paramInt >>>= 7;
    }
    paramb.writeByte((byte)(k & 0x7F));
    return j + 1;
  }

  public static int b(a parama)
  {
    int i = 0;
    int j = 0;
    while (true)
    {
      int k = parama.readByte() & 0xFF;
      j = (k & 0x7F) << i * 7 | j;
      i++;
      if (((k & 0x80) != 128) || (i >= 5))
      {
        if ((k & 0x80) == 128)
          throw new j("invalid LEB128 sequence");
        return j;
      }
    }
  }

  public static int b(b paramb, int paramInt)
  {
    return a(paramb, paramInt + 1);
  }

  public static int c(a parama)
  {
    return b(parama) - 1;
  }

  public static int c(b paramb, int paramInt)
  {
    int i;
    int j;
    int k;
    int n;
    if ((0x80000000 & paramInt) == 0)
    {
      i = 0;
      j = 0;
      k = 1;
      m = paramInt >> 7;
      n = paramInt;
      paramInt = m;
      label26: if (k == 0)
        break label108;
      if ((paramInt == i) && ((paramInt & 0x1) == (n >> 6 & 0x1)))
        break label96;
      k = 1;
      label52: if (k == 0)
        break label102;
    }
    label96: label102: for (int m = 128; ; m = 0)
    {
      paramb.writeByte((byte)(m | n & 0x7F));
      j++;
      n = paramInt;
      paramInt >>= 7;
      break label26;
      i = -1;
      break;
      k = 0;
      break label52;
    }
    label108: return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.o
 * JD-Core Version:    0.6.2
 */