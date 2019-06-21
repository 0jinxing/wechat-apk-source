package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements f.b
{
  a$3(a parama, e parame, AppBrandLivePlayerView paramAppBrandLivePlayerView)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(96072);
    g.d locald = g.wV(this.hCK.getAppId());
    ab.i("MicroMsg.JsApiInsertLivePlayer", "LivePlayer enter background, pause type:%s", new Object[] { locald.name() });
    if (locald == g.d.gNs)
    {
      this.hLr.om(2);
      AppMethodBeat.o(96072);
    }
    while (true)
    {
      return;
      if (locald == g.d.gNo)
      {
        this.hLr.om(1);
        AppMethodBeat.o(96072);
      }
      else
      {
        this.hLr.om(3);
        AppMethodBeat.o(96072);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.3
 * JD-Core Version:    0.6.2
 */