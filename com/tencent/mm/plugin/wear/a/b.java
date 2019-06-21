package com.tencent.mm.plugin.wear.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static final int adA(String paramString)
  {
    AppMethodBeat.i(26461);
    try
    {
      i = Integer.valueOf(paramString.split("/")[4]).intValue();
      AppMethodBeat.o(26461);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(26461);
      }
    }
  }

  public static final boolean adz(String paramString)
  {
    AppMethodBeat.i(26460);
    try
    {
      bool = paramString.split("/")[2].equals("wear");
      AppMethodBeat.o(26460);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(26460);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.a.b
 * JD-Core Version:    0.6.2
 */