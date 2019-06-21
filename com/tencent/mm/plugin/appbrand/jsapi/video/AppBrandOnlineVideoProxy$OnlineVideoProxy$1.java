package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.d.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandOnlineVideoProxy$OnlineVideoProxy$1
  implements d.c
{
  AppBrandOnlineVideoProxy$OnlineVideoProxy$1(AppBrandOnlineVideoProxy.OnlineVideoProxy paramOnlineVideoProxy)
  {
  }

  public final void ad(String paramString, int paramInt)
  {
    AppMethodBeat.i(131504);
    ab.i("MicroMsg.AppBrandOnlineVideoProxy", "on finish [%s %d]", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.hYB.hYx = paramInt;
    this.hYB.hYv = 13;
    f.auY().yD(this.hYB.fUL);
    AppBrandOnlineVideoProxy.OnlineVideoProxy.d(this.hYB);
    AppMethodBeat.o(131504);
  }

  public final void cR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131501);
    this.hYB.hYx = paramInt1;
    this.hYB.hYy = paramInt2;
    this.hYB.hYv = 10;
    AppBrandOnlineVideoProxy.OnlineVideoProxy.a(this.hYB);
    AppMethodBeat.o(131501);
  }

  public final void cS(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131502);
    this.hYB.hYx = paramInt1;
    this.hYB.hYy = paramInt2;
    this.hYB.hYv = 11;
    AppBrandOnlineVideoProxy.OnlineVideoProxy.b(this.hYB);
    AppMethodBeat.o(131502);
  }

  public final void cT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131503);
    this.hYB.hYx = paramInt1;
    this.hYB.hYy = paramInt2;
    this.hYB.hYv = 12;
    AppBrandOnlineVideoProxy.OnlineVideoProxy.c(this.hYB);
    AppMethodBeat.o(131503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandOnlineVideoProxy.OnlineVideoProxy.1
 * JD-Core Version:    0.6.2
 */