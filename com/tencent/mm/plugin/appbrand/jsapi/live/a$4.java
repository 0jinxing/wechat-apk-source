package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;

final class a$4
  implements f.c
{
  a$4(a parama, AppBrandLivePlayerView paramAppBrandLivePlayerView, e parame)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(96073);
    this.hLr.onExit();
    this.hCK.b(this);
    AppMethodBeat.o(96073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.4
 * JD-Core Version:    0.6.2
 */