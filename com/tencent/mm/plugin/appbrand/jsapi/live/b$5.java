package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;

final class b$5 extends g.c
{
  b$5(b paramb, AppBrandLivePusherView paramAppBrandLivePusherView, e parame)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(96091);
    AppBrandLivePusherView localAppBrandLivePusherView = this.hLx;
    ab.i("MicroMsg.AppBrandLivePusherView", "onAppBrandPause pauseType:%s", new Object[] { paramd });
    if ((paramd == g.d.gNn) || (paramd == g.d.gNm) || (paramd == g.d.gNt))
      localAppBrandLivePusherView.hLk.eb(true);
    AppMethodBeat.o(96091);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(96093);
    g.b(this.hCK.getAppId(), this);
    AppMethodBeat.o(96093);
  }

  public final void onResume()
  {
    AppMethodBeat.i(96092);
    this.hLx.hLk.aDK();
    AppMethodBeat.o(96092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.5
 * JD-Core Version:    0.6.2
 */