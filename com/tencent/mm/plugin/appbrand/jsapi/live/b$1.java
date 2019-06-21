package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.appbrand.s.t;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements f.d
{
  b$1(b paramb, AppBrandLivePusherView paramAppBrandLivePusherView)
  {
  }

  public final void wU()
  {
    AppMethodBeat.i(96085);
    AppBrandLivePusherView localAppBrandLivePusherView = this.hLx;
    i locali = localAppBrandLivePusherView.hLk.aDK();
    ab.i("MicroMsg.AppBrandLivePusherView", "onForeground code:%d info:%s", new Object[] { Integer.valueOf(locali.errorCode), locali.hLF });
    localAppBrandLivePusherView.hLh.enable();
    AppMethodBeat.o(96085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.1
 * JD-Core Version:    0.6.2
 */