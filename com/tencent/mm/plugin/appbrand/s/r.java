package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r
{
  public static String Ei(String paramString)
  {
    AppMethodBeat.i(91185);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(91185);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace(' ', '\n').replace(' ', '\n');
      AppMethodBeat.o(91185);
    }
  }

  public static boolean t(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(91186);
    if ((paramString1 == null) || (paramString1.length() < 0) || (paramString2.length() < 0))
      AppMethodBeat.o(91186);
    while (true)
    {
      return bool;
      if (paramString2.length() > paramString1.length())
      {
        AppMethodBeat.o(91186);
      }
      else if (paramString2.equalsIgnoreCase(paramString1.substring(0, paramString2.length())))
      {
        bool = true;
        AppMethodBeat.o(91186);
      }
      else
      {
        AppMethodBeat.o(91186);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.r
 * JD-Core Version:    0.6.2
 */