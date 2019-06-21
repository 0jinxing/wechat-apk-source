package com.tencent.mm.plugin.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class a
{
  private static List<a.a> nRx;
  private static String nRy;

  public static List<a.a> Qe(String paramString)
  {
    try
    {
      AppMethodBeat.i(70225);
      if ((paramString != null) && (paramString.equals(nRy)))
      {
        paramString = nRx;
        AppMethodBeat.o(70225);
      }
      while (true)
      {
        return paramString;
        paramString = null;
        AppMethodBeat.o(70225);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static void o(String paramString, List<a.a> paramList)
  {
    try
    {
      nRy = paramString;
      nRx = paramList;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.l.a
 * JD-Core Version:    0.6.2
 */