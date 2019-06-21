package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  public static int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(125685);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(125685);
      while (true)
      {
        return paramInt;
        int i = Integer.parseInt(paramString);
        paramInt = i;
        AppMethodBeat.o(125685);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        AppMethodBeat.o(125685);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.j
 * JD-Core Version:    0.6.2
 */