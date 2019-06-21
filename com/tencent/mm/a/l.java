package com.tencent.mm.a;

public final class l
{
  public static byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null));
    for (paramArrayOfByte1 = null; ; paramArrayOfByte1 = e(paramArrayOfByte1, paramArrayOfByte2))
      return paramArrayOfByte1;
  }

  public static byte[] d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null));
    for (paramArrayOfByte1 = null; ; paramArrayOfByte1 = e(paramArrayOfByte1, paramArrayOfByte2))
      return paramArrayOfByte1;
  }

  private static byte[] e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = z(paramArrayOfByte2);
    paramArrayOfByte2 = new byte[paramArrayOfByte1.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < paramArrayOfByte1.length)
    {
      k = k + 1 & 0xFF;
      j = (arrayOfByte[k] & 0xFF) + j & 0xFF;
      int m = arrayOfByte[k];
      arrayOfByte[k] = ((byte)arrayOfByte[j]);
      arrayOfByte[j] = ((byte)m);
      int n = arrayOfByte[k];
      int i1 = arrayOfByte[j];
      m = paramArrayOfByte1[i];
      paramArrayOfByte2[i] = ((byte)(byte)(arrayOfByte[((n & 0xFF) + (i1 & 0xFF) & 0xFF)] ^ m));
      i++;
    }
    return paramArrayOfByte2;
  }

  private static byte[] z(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[256];
    for (int i = 0; i < 256; i++)
      arrayOfByte1[i] = ((byte)(byte)i);
    byte[] arrayOfByte2;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      arrayOfByte2 = null;
      return arrayOfByte2;
    }
    i = 0;
    int j = 0;
    int k = 0;
    while (true)
    {
      arrayOfByte2 = arrayOfByte1;
      if (i >= 256)
        break;
      j = (paramArrayOfByte[k] & 0xFF) + (arrayOfByte1[i] & 0xFF) + j & 0xFF;
      int m = arrayOfByte1[i];
      arrayOfByte1[i] = ((byte)arrayOfByte1[j]);
      arrayOfByte1[j] = ((byte)m);
      k = (k + 1) % paramArrayOfByte.length;
      i++;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.l
 * JD-Core Version:    0.6.2
 */