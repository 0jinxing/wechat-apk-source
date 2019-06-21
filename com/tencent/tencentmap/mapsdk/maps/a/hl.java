package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class hl
{
  public static int a(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | 0xFF00 & paramArrayOfByte[1] << 8 | 0xFF0000 & paramArrayOfByte[2] << 16 | 0xFF000000 & paramArrayOfByte[3] << 24;
  }

  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(99554);
    try
    {
      String str = new java/lang/String;
      str.<init>(paramArrayOfByte, paramString);
      paramArrayOfByte = str.trim();
      AppMethodBeat.o(99554);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(99554);
      }
    }
  }

  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)paramInt, (byte)(paramInt >> 8), (byte)(paramInt >> 16), (byte)(paramInt >> 24) };
  }

  public static byte[] a(String paramString)
  {
    AppMethodBeat.i(99552);
    if (paramString != null);
    while (true)
    {
      try
      {
        paramString = paramString.getBytes("UTF-16LE");
        AppMethodBeat.o(99552);
        return paramString;
      }
      catch (Exception paramString)
      {
      }
      paramString = new byte[0];
      AppMethodBeat.o(99552);
    }
  }

  public static boolean b(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if (paramArrayOfByte[0] > 0)
      bool = true;
    return bool;
  }

  public static float c(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99551);
    float f = Float.intBitsToFloat(a(paramArrayOfByte));
    AppMethodBeat.o(99551);
    return f;
  }

  public static String d(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99553);
    try
    {
      String str = new java/lang/String;
      str.<init>(paramArrayOfByte, "UTF-16LE");
      paramArrayOfByte = str.trim();
      AppMethodBeat.o(99553);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(99553);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hl
 * JD-Core Version:    0.6.2
 */