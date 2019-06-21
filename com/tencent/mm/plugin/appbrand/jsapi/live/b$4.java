package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.s.t;
import com.tencent.mm.sdk.platformtools.ab;

final class b$4
  implements f.b
{
  b$4(b paramb, AppBrandLivePusherView paramAppBrandLivePusherView)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(96090);
    AppBrandLivePusherView localAppBrandLivePusherView = this.hLx;
    i locali = localAppBrandLivePusherView.hLk.eb(false);
    ab.i("MicroMsg.AppBrandLivePusherView", "onBackground code:%d info:%s", new Object[] { Integer.valueOf(locali.errorCode), locali.hLF });
    localAppBrandLivePusherView.hLh.disable();
    AppMethodBeat.o(96090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.4
 * JD-Core Version:    0.6.2
 */