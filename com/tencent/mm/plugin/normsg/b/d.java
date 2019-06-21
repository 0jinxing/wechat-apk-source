package com.tencent.mm.plugin.normsg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static final char[] HEX_DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  public static String TQ(String paramString)
  {
    AppMethodBeat.i(10437);
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int i = 1;
    int j = 0;
    int k = j;
    try
    {
      int m = paramString.charAt(i);
      k = j;
      j = paramString.charAt(i - 1) ^ m;
      k = j;
      m = paramString.length();
      if (i + 1 == m)
      {
        c = (char)j;
        try
        {
          localStringBuilder.append(c);
          paramString = localStringBuilder.toString();
          AppMethodBeat.o(10437);
          return paramString;
        }
        finally
        {
          while (true)
            try
            {
              AppMethodBeat.o(10437);
              throw paramString;
            }
            finally
            {
              paramString = localStringBuilder.toString();
              AppMethodBeat.o(10437);
            }
        }
      }
      c = (char)j;
    }
    finally
    {
      try
      {
        localStringBuilder.append(c);
        i++;
      }
      finally
      {
        AppMethodBeat.o(10437);
      }
      char c = (char)k;
      try
      {
        localStringBuilder.append(c);
        AppMethodBeat.o(10437);
        throw paramString;
      }
      finally
      {
      }
    }
    throw paramString;
  }

  public static String v(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(10436);
    char[] arrayOfChar = new char[(paramInt2 - paramInt1) * 2];
    int i = 0;
    while (paramInt1 < paramInt2)
    {
      int j = paramArrayOfByte[paramInt1];
      int k = i + 1;
      arrayOfChar[i] = ((char)HEX_DIGITS[(j >>> 4 & 0xF)]);
      i = k + 1;
      arrayOfChar[k] = ((char)HEX_DIGITS[(j & 0xF)]);
      paramInt1++;
    }
    paramArrayOfByte = new String(arrayOfChar);
    AppMethodBeat.o(10436);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.d
 * JD-Core Version:    0.6.2
 */