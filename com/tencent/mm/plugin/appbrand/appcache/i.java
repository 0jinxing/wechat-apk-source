package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  private static final o gSt;

  static
  {
    AppMethodBeat.i(101714);
    gSt = new c();
    AppMethodBeat.o(101714);
  }

  public static String xn(String paramString)
  {
    AppMethodBeat.i(101713);
    paramString = gSt.openRead(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(101713);
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.luggage.g.i.convertStreamToString(paramString);
      AppMethodBeat.o(101713);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.i
 * JD-Core Version:    0.6.2
 */