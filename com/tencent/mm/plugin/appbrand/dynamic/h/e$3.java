package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.z.a.a;

final class e$3
  implements a.a
{
  e$3(WxaWidgetContext paramWxaWidgetContext)
  {
  }

  public final void Qp()
  {
    AppMethodBeat.i(10962);
    v.kT(11);
    ad localad = new ad().eZ(u.pr(this.hoK.getId()));
    localad.cYw = u.pq(this.hoK.getId());
    localad.cYs = 6L;
    localad.cYu = 1L;
    localad = localad.eY(this.hoK.getId());
    localad.cYt = System.currentTimeMillis();
    localad.fa(at.gB(ah.getContext())).ajK();
    h.pYm.a(636L, 1L, 1L, false);
    AppMethodBeat.o(10962);
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(10963);
    v.kT(12);
    ad localad = new ad().eZ(u.pr(this.hoK.getId()));
    localad.cYw = u.pq(this.hoK.getId());
    localad.cYs = 6L;
    localad.cYu = 2L;
    localad = localad.eY(this.hoK.getId());
    localad.cYt = System.currentTimeMillis();
    localad.fa(at.gB(ah.getContext())).ajK();
    j.azE().zZ(this.hoK.getId());
    h.pYm.a(636L, 2L, 1L, false);
    ab.e("MicroMsg.PreloadOptimizer", "Inject SDK widget Script Failed: %s", new Object[] { paramString });
    AppMethodBeat.o(10963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.e.3
 * JD-Core Version:    0.6.2
 */