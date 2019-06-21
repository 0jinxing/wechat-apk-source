package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class t
{
  private static boolean ifd = false;

  public static String b(i parami)
  {
    if ((parami instanceof w))
      parami = "WebView-Package";
    while (true)
    {
      return parami;
      if ((parami instanceof u))
        parami = "XWEB-Package";
      else if ((parami instanceof c))
        parami = "J2V8-Package";
      else if ((parami instanceof v))
        parami = "NodeJS";
      else
        parami = "unknown";
    }
  }

  private static void c(i parami)
  {
    AppMethodBeat.i(73185);
    if ((parami instanceof c))
    {
      h.pYm.a(434L, 5L, 1L, false);
      ab.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandJ2V8BasedJsEngine");
    }
    while (true)
    {
      h.pYm.a(434L, 0L, 1L, false);
      AppMethodBeat.o(73185);
      return;
      if ((parami instanceof v))
      {
        h.pYm.a(434L, 6L, 1L, false);
        ab.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandNodeJSBasedJsEngine");
      }
    }
  }

  public static i d(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(73184);
    if (y.oV(paramInt));
    for (paramString = new v(paramString, paramArrayOfByte); ; paramString = new c(paramString, paramArrayOfByte))
    {
      c(paramString);
      AppMethodBeat.o(73184);
      return paramString;
    }
  }

  public static i oU(int paramInt)
  {
    AppMethodBeat.i(73183);
    i locali = d(paramInt, null, null);
    AppMethodBeat.o(73183);
    return locali;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.t
 * JD-Core Version:    0.6.2
 */