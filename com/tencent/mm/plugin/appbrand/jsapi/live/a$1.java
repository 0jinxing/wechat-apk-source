package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.an;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements an
{
  a$1(a parama, AppBrandLivePlayerView paramAppBrandLivePlayerView)
  {
  }

  public final void aDI()
  {
    AppMethodBeat.i(96070);
    AppBrandLivePlayerView localAppBrandLivePlayerView = this.hLr;
    ab.i("MicroMsg.AppBrandLivePlayerView", "onExitFullScreen");
    localAppBrandLivePlayerView.dZ(false);
    AppMethodBeat.o(96070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.1
 * JD-Core Version:    0.6.2
 */