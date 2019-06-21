package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.ConcurrentHashMap;

public final class s
  implements z.b
{
  private static final ConcurrentHashMap<String, Boolean> gST;

  static
  {
    AppMethodBeat.i(129390);
    gST = new ConcurrentHashMap();
    AppMethodBeat.o(129390);
  }

  public static void xp(String paramString)
  {
    AppMethodBeat.i(129388);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129388);
    while (true)
    {
      return;
      gST.put(paramString, Boolean.TRUE);
      AppMethodBeat.o(129388);
    }
  }

  public final z.a a(a parama)
  {
    AppMethodBeat.i(129387);
    if ((aq.class == parama.getClass()) || (ak.class == parama.getClass()) || (al.class == parama.getClass()) || (bc.class == parama.getClass()))
    {
      parama = new s.a(parama, (byte)0);
      AppMethodBeat.o(129387);
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(129387);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.s
 * JD-Core Version:    0.6.2
 */