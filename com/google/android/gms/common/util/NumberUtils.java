package com.google.android.gms.common.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

@VisibleForTesting
public class NumberUtils
{
  public static int compare(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      if (paramInt1 == paramInt2)
        paramInt1 = 0;
      else
        paramInt1 = 1;
    }
  }

  public static int compare(long paramLong1, long paramLong2)
  {
    int i;
    if (paramLong1 < paramLong2)
      i = -1;
    while (true)
    {
      return i;
      if (paramLong1 == paramLong2)
        i = 0;
      else
        i = 1;
    }
  }

  public static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(90252);
    try
    {
      Long.parseLong(paramString);
      bool = true;
      AppMethodBeat.o(90252);
      return bool;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(90252);
      }
    }
  }

  public static long parseHexLong(String paramString)
  {
    AppMethodBeat.i(90251);
    if (paramString.length() > 16)
    {
      paramString = new NumberFormatException(String.valueOf(paramString).length() + 37 + "Invalid input: " + paramString + " exceeds 16 characters");
      AppMethodBeat.o(90251);
      throw paramString;
    }
    long l;
    if (paramString.length() == 16)
    {
      l = Long.parseLong(paramString.substring(8), 16) | Long.parseLong(paramString.substring(0, 8), 16) << 32;
      AppMethodBeat.o(90251);
    }
    while (true)
    {
      return l;
      l = Long.parseLong(paramString, 16);
      AppMethodBeat.o(90251);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.NumberUtils
 * JD-Core Version:    0.6.2
 */