package com.tencent.mm.a;

public final class i
{
  public static int bL(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = j;
    if (paramInt2 >= 0)
      if (paramInt2 < 2147483647)
        break label23;
    label23: byte[] arrayOfByte;
    for (k = j; ; k = (int)((s(arrayOfByte, 4) & 0xFFFFFFFF) % paramInt2))
    {
      return k;
      arrayOfByte = new byte[4];
      for (k = i; k < 4; k++)
        arrayOfByte[k] = ((byte)(byte)(paramInt1 >> k * 8 & 0xFF));
    }
  }

  public static int s(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt ^ 0x0;
    int j = paramInt >> 2;
    for (int k = 0; k < j; k++)
    {
      int m = (k << 2) + 0;
      int n = paramArrayOfByte[(m + 3)];
      int i1 = paramArrayOfByte[(m + 2)];
      int i2 = paramArrayOfByte[(m + 1)];
      m = (paramArrayOfByte[(m + 0)] & 0xFF | ((n << 8 | i1 & 0xFF) << 8 | i2 & 0xFF) << 8) * 1540483477;
      i = i * 1540483477 ^ (m ^ m >>> 24) * 1540483477;
    }
    j = paramInt - (j << 2);
    k = i;
    if (j != 0)
    {
      k = i;
      if (j >= 3)
        k = i ^ paramArrayOfByte[(paramInt + 0 - 3)] << 16;
      i = k;
      if (j >= 2)
        i = k ^ paramArrayOfByte[(paramInt + 0 - 2)] << 8;
      k = i;
      if (j > 0)
        k = i ^ paramArrayOfByte[(paramInt + 0 - 1)];
      k *= 1540483477;
    }
    paramInt = (k ^ k >>> 13) * 1540483477;
    return paramInt ^ paramInt >>> 15;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.i
 * JD-Core Version:    0.6.2
 */