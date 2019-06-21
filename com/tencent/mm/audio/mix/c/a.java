package com.tencent.mm.audio.mix.c;

public final class a
{
  public static short a(byte paramByte1, byte paramByte2, boolean paramBoolean)
  {
    if (paramBoolean)
      paramByte1 = (short)((short)((short)(paramByte1 & 0xFF | 0x0) << 8) | paramByte2 & 0xFF);
    for (short s = paramByte1; ; s = paramByte1)
    {
      return s;
      paramByte1 = (short)((short)((short)(paramByte2 & 0xFF | 0x0) << 8) | paramByte1 & 0xFF);
    }
  }

  public static byte[] a(byte[] paramArrayOfByte, double paramDouble)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)(byte)(int)(paramArrayOfByte[i] * paramDouble));
    return paramArrayOfByte;
  }

  public static byte[] getBytes(short paramShort, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[2];
    if (paramBoolean)
    {
      arrayOfByte[1] = ((byte)(byte)(paramShort & 0xFF));
      arrayOfByte[0] = ((byte)(byte)((short)(paramShort >> 8) & 0xFF));
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte[0] = ((byte)(byte)(paramShort & 0xFF));
      arrayOfByte[1] = ((byte)(byte)((short)(paramShort >> 8) & 0xFF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.a
 * JD-Core Version:    0.6.2
 */