package com.google.android.gms.common.util;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Base64Utils
{
  public static byte[] decode(String paramString)
  {
    AppMethodBeat.i(90035);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(90035);
    }
    while (true)
    {
      return paramString;
      paramString = Base64.decode(paramString, 0);
      AppMethodBeat.o(90035);
    }
  }

  public static byte[] decodeUrlSafe(String paramString)
  {
    AppMethodBeat.i(90036);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(90036);
    }
    while (true)
    {
      return paramString;
      paramString = Base64.decode(paramString, 10);
      AppMethodBeat.o(90036);
    }
  }

  public static byte[] decodeUrlSafeNoPadding(String paramString)
  {
    AppMethodBeat.i(90037);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(90037);
    }
    while (true)
    {
      return paramString;
      paramString = Base64.decode(paramString, 11);
      AppMethodBeat.o(90037);
    }
  }

  public static byte[] decodeUrlSafeNoPadding(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90038);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90038);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = Base64.decode(paramArrayOfByte, 11);
      AppMethodBeat.o(90038);
    }
  }

  public static String encode(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90039);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90039);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = Base64.encodeToString(paramArrayOfByte, 0);
      AppMethodBeat.o(90039);
    }
  }

  public static String encodeUrlSafe(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90040);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90040);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = Base64.encodeToString(paramArrayOfByte, 10);
      AppMethodBeat.o(90040);
    }
  }

  public static String encodeUrlSafeNoPadding(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(90041);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90041);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = Base64.encodeToString(paramArrayOfByte, 11);
      AppMethodBeat.o(90041);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.Base64Utils
 * JD-Core Version:    0.6.2
 */