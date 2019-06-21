package com.tencent.mm.cf;

public final class e
{
  public static byte[] ce(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] ^ 0x12));
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.e
 * JD-Core Version:    0.6.2
 */