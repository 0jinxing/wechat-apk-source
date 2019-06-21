package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.report.quality.b;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class w$2
  implements n.a
{
  w$2(w paramw, boolean paramBoolean, long paramLong, int paramInt)
  {
  }

  public final void lo(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(132377);
    ab.e("MicroMsg.AppBrandPageViewWC", "Inject SDK Page Script Failed: %s", new Object[] { paramString });
    h.pYm.a(370L, 2L, 1L, false);
    c.br(this.itx.getAppId(), 24);
    int j = -1;
    if (w.e(this.itx) != null)
    {
      i = w.e(this.itx).atH().hhd.gVu;
      j = w.e(this.itx).atH().hhd.gVt;
    }
    c.a(this.itx.getAppId(), i, j, 370, 2);
    AppMethodBeat.o(132377);
  }

  public final void onSuccess(String paramString)
  {
    AppMethodBeat.i(132376);
    if ((this.itx.atU()) || (this.itx.isRunning()))
    {
      a.aLz();
      b.a(this.gMY, this.itx.getAppId(), this.gMV, "WAWebview.js", this.gQf);
    }
    h.pYm.a(370L, 3L, 1L, false);
    AppMethodBeat.o(132376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.2
 * JD-Core Version:    0.6.2
 */