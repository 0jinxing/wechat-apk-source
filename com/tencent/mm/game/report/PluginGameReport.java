package com.tencent.mm.game.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.e;
import com.tencent.mm.kernel.b.f;

public class PluginGameReport extends f
  implements e
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(59584);
    if ((paramg.SG()) || (paramg.lQ(":tools")))
    {
      com.tencent.mm.game.report.api.c.eBG = new b();
      com.tencent.mm.game.report.api.b.eBF = new a();
      com.tencent.mm.kernel.g.a(com.tencent.mm.game.report.a.b.class, new com.tencent.mm.game.report.a.a());
    }
    AppMethodBeat.o(59584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.PluginGameReport
 * JD-Core Version:    0.6.2
 */