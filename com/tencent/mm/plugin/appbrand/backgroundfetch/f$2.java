package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements c.a
{
  f$2(MMToClientEvent.c paramc)
  {
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(129807);
    if (paramb == b.gWw)
    {
      MMToClientEvent.b(paramString, this.hce);
      ab.i("MicroMsg.AppBrand.AppBrandOnBackgroundFetchDataEvent.javayhu", "app stop listening, appId:%s", new Object[] { paramString });
    }
    AppMethodBeat.o(129807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.f.2
 * JD-Core Version:    0.6.2
 */