package com.google.android.gms.common.util;

public class MurmurHash3
{
  public static int murmurhash3_x86_32(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + (paramInt2 & 0xFFFFFFFC);
    int j = paramInt3;
    paramInt3 = paramInt1;
    paramInt1 = j;
    while (paramInt3 < i)
    {
      j = (paramArrayOfByte[paramInt3] & 0xFF | (paramArrayOfByte[(paramInt3 + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt3 + 2)] & 0xFF) << 16 | paramArrayOfByte[(paramInt3 + 3)] << 24) * -862048943;
      paramInt1 = (j >>> 17 | j << 15) * 461845907 ^ paramInt1;
      paramInt1 = -430675100 + (paramInt1 >>> 19 | paramInt1 << 13) * 5;
      paramInt3 += 4;
    }
    j = 0;
    paramInt3 = 0;
    switch (paramInt2 & 0x3)
    {
    default:
    case 3:
    case 2:
    case 1:
    }
    while (true)
    {
      paramInt1 ^= paramInt2;
      paramInt1 = (paramInt1 ^ paramInt1 >>> 16) * -2048144789;
      paramInt1 = (paramInt1 ^ paramInt1 >>> 13) * -1028477387;
      return paramInt1 ^ paramInt1 >>> 16;
      paramInt3 = (paramArrayOfByte[(i + 2)] & 0xFF) << 16;
      j = paramInt3 | (paramArrayOfByte[(i + 1)] & 0xFF) << 8;
      paramInt3 = (j | paramArrayOfByte[i] & 0xFF) * -862048943;
      paramInt1 = (paramInt3 >>> 17 | paramInt3 << 15) * 461845907 ^ paramInt1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.MurmurHash3
 * JD-Core Version:    0.6.2
 */