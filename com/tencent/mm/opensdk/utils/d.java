package com.tencent.mm.opensdk.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public static boolean a(int paramInt)
  {
    if ((paramInt == 36) || (paramInt == 46));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean b(String paramString)
  {
    AppMethodBeat.i(128074);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(128074);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(128074);
    }
  }

  public static int c(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(128075);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(128075);
      while (true)
      {
        return i;
        int j = Integer.parseInt(paramString);
        i = j;
        AppMethodBeat.o(128075);
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(128075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.utils.d
 * JD-Core Version:    0.6.2
 */