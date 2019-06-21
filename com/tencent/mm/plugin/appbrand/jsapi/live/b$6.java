package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;

final class b$6
  implements f.c
{
  b$6(b paramb, AppBrandLivePusherView paramAppBrandLivePusherView, e parame, g.c paramc)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(96094);
    this.hLx.onExit();
    this.hCK.b(this);
    g.b(this.hCK.getAppId(), this.hLA);
    AppMethodBeat.o(96094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.6
 * JD-Core Version:    0.6.2
 */