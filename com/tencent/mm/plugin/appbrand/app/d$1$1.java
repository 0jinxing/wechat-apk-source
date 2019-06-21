package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.c;

final class d$1$1
  implements f
{
  d$1$1(d.1 param1, com.tencent.mm.vending.g.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(129237);
    if (c.b(paramm, this.gRe.val$appId))
      g.RO().eJo.b(1345, this);
    while (true)
    {
      try
      {
        this.bQV.B(new Object[] { Integer.valueOf(c.h(paramm)) });
        AppMethodBeat.o(129237);
        return;
      }
      catch (Exception paramString)
      {
        this.bQV.cR(paramString);
      }
      AppMethodBeat.o(129237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.d.1.1
 * JD-Core Version:    0.6.2
 */