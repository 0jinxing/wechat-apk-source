package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.n.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static void G(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137935);
    ab.i("MicroMsg.HCEReportManager", "alvinluo reportStartHCEResult appId: %s, result: %d, diff: %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ((b)e.C(b.class)).e(14837, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(137935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c
 * JD-Core Version:    0.6.2
 */