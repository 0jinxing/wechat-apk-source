package com.tencent.mm.plugin.appbrand.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class b$5
  implements n.a
{
  b$5(b paramb, boolean paramBoolean, long paramLong, int paramInt)
  {
  }

  public final void lo(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(130007);
    ab.e("MicroMsg.WAGameAppService", "Inject SDK WAGame Script Failed: %s", new Object[] { paramString });
    h.pYm.a(778L, 14L, 1L, false);
    c.br(this.hqr.getAppId(), 24);
    int j = -1;
    paramString = this.hqr.getRuntime();
    if (paramString != null)
    {
      i = paramString.atH().hhd.gVu;
      j = paramString.atH().hhd.gVt;
    }
    c.a(this.hqr.getAppId(), i, j, 778, 14);
    AppMethodBeat.o(130007);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(130006);
    ab.i("MicroMsg.WAGameAppService", "Inject SDK WAGame Script suc: %s", new Object[] { paramString });
    if ((this.hqr.atU()) || (this.hqr.isRunning()))
    {
      a.aLz();
      com.tencent.mm.plugin.appbrand.report.quality.b.a(this.hqs, this.hqr.getAppId(), this.gMV, "WAGame.js", this.gQf);
    }
    h.pYm.a(778L, 15L, 1L, false);
    AppMethodBeat.o(130006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.5
 * JD-Core Version:    0.6.2
 */