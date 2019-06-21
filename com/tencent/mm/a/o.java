package com.tencent.mm.a;

public final class o
{
  public static int A(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[3] & 0xFF) << 24 | (paramArrayOfByte[2] & 0xFF) << 16 | (paramArrayOfByte[1] & 0xFF) << 8 | (paramArrayOfByte[0] & 0xFF) << 0;
  }

  public static byte[] fZ(int paramInt)
  {
    int i = 0;
    byte[] arrayOfByte1 = new byte[4];
    for (int j = 0; j < 4; j++)
      arrayOfByte1[j] = ((byte)(byte)(paramInt >> j * 8 & 0xFF));
    byte[] arrayOfByte2 = new byte[4];
    for (paramInt = i; paramInt < 4; paramInt++)
      arrayOfByte2[paramInt] = ((byte)arrayOfByte1[(3 - paramInt)]);
    return arrayOfByte2;
  }

  public static int t(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.o
 * JD-Core Version:    0.6.2
 */