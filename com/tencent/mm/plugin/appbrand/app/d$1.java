package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.AppBrandOnOpReportStartEvent;
import com.tencent.mm.vending.g.f;

final class d$1
  implements com.tencent.mm.vending.c.a<Integer, Void>
{
  d$1(d paramd, String paramString)
  {
  }

  private Integer auI()
  {
    AppMethodBeat.i(129238);
    if (!g.RN().QY())
    {
      f.dMj().cR(new com.tencent.mm.model.b());
      AppMethodBeat.o(129238);
    }
    while (true)
    {
      return null;
      AppBrandOpReportLogic.AppBrandOnOpReportStartEvent.BI(this.val$appId);
      com.tencent.mm.vending.g.b localb = f.dMo();
      g.RO().eJo.a(1345, new d.1.1(this, localb));
      AppMethodBeat.o(129238);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.d.1
 * JD-Core Version:    0.6.2
 */