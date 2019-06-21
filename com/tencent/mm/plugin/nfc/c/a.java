package com.tencent.mm.plugin.nfc.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static final char[] oTt = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };

  public static byte[] b(short paramShort)
  {
    return new byte[] { (byte)(paramShort >>> 8 & 0xFF), (byte)(paramShort & 0xFF) };
  }

  public static String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23050);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(23050);
    }
    while (true)
    {
      return paramArrayOfByte;
      char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        int j = paramArrayOfByte[i] & 0xFF;
        arrayOfChar[(i * 2)] = ((char)oTt[(j >>> 4)]);
        arrayOfChar[(i * 2 + 1)] = ((char)oTt[(j & 0xF)]);
      }
      paramArrayOfByte = new String(arrayOfChar);
      AppMethodBeat.o(23050);
    }
  }

  public static byte[] hexStringToByteArray(String paramString)
  {
    AppMethodBeat.i(23051);
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2)
      arrayOfByte[(j / 2)] = ((byte)(byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16)));
    AppMethodBeat.o(23051);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.c.a
 * JD-Core Version:    0.6.2
 */