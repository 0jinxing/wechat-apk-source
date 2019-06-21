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

final class e$4
  implements a.a
{
  e$4(WxaWidgetContext paramWxaWidgetContext)
  {
  }

  public final void Qp()
  {
    AppMethodBeat.i(10964);
    v.kT(14);
    ad localad = new ad().eZ(u.pr(this.hoK.getId()));
    localad.cYw = u.pq(this.hoK.getId());
    localad.cYs = 7L;
    localad.cYu = 1L;
    localad = localad.eY(this.hoK.getId());
    localad.cYt = System.currentTimeMillis();
    localad.fa(at.gB(ah.getContext())).ajK();
    h.pYm.a(636L, 4L, 1L, false);
    j.azE().zZ(this.hoK.getId());
    AppMethodBeat.o(10964);
  }

  public final void lo(String paramString)
  {
    AppMethodBeat.i(10965);
    v.kT(15);
    ad localad = new ad().eZ(u.pr(this.hoK.getId()));
    localad.cYw = u.pq(this.hoK.getId());
    localad.cYs = 7L;
    localad.cYu = 2L;
    localad = localad.eY(this.hoK.getId());
    localad.cYt = System.currentTimeMillis();
    localad.ajK();
    h.pYm.a(636L, 5L, 1L, false);
    ab.e("MicroMsg.PreloadOptimizer", "Inject External widget Script Failed: %s", new Object[] { paramString });
    AppMethodBeat.o(10965);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.e.4
 * JD-Core Version:    0.6.2
 */