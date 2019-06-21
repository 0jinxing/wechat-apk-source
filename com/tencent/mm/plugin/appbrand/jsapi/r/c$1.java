package com.tencent.mm.plugin.appbrand.jsapi.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;

final class c$1 extends g.c
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(131484);
    AppBrandStickyBannerLogic.a.cQ(this.hxc.getAppId(), "");
    AppMethodBeat.o(131484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.c.1
 * JD-Core Version:    0.6.2
 */