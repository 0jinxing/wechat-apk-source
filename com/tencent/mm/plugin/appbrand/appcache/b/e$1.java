package com.tencent.mm.plugin.appbrand.appcache.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;

final class e$1
  implements a<Void, String>
{
  e$1(e parame)
  {
  }

  private static Void xQ(String paramString)
  {
    AppMethodBeat.i(129447);
    try
    {
      e.xP(paramString);
      AppMethodBeat.o(129447);
      return null;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrand.PredownloadXmlProcessor", paramString, "process pbBase64", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e.1
 * JD-Core Version:    0.6.2
 */