package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements c.a
{
  b$2(b paramb, q paramq)
  {
  }

  public final void a(String paramString, com.tencent.mm.plugin.appbrand.b.b paramb)
  {
    AppMethodBeat.i(130645);
    if (paramb == com.tencent.mm.plugin.appbrand.b.b.gWw)
    {
      ab.d("MicroMsg.DownloadAppStateChangeEvent", "destroyed");
      MMToClientEvent.b(this.hsD.getAppId(), b.a(this.hzF));
      b.f(this.hsD);
    }
    AppMethodBeat.o(130645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.b.2
 * JD-Core Version:    0.6.2
 */