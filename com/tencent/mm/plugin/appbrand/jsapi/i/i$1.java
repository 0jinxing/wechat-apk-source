package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.g.d;

final class i$1
  implements Runnable
{
  i$1(i parami, c paramc, String paramString, i.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108062);
    d.post(new i.1.1(this), "stopScanServices");
    AppMethodBeat.o(108062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.i.1
 * JD-Core Version:    0.6.2
 */