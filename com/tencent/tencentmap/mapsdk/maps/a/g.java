package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class g
{
  public static final byte[] a = new byte[0];
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };

  public static String a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98963);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(98963);
    }
    while (true)
    {
      return paramArrayOfByte;
      char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        int j = paramArrayOfByte[i];
        arrayOfChar[(i * 2 + 1)] = ((char)b[(j & 0xF)]);
        j = (byte)(j >>> 4);
        arrayOfChar[(i * 2 + 0)] = ((char)b[(j & 0xF)]);
      }
      paramArrayOfByte = new String(arrayOfChar);
      AppMethodBeat.o(98963);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.g
 * JD-Core Version:    0.6.2
 */