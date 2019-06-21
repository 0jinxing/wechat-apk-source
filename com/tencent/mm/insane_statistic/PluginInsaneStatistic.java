package com.tencent.mm.insane_statistic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;

public class PluginInsaneStatistic extends f
  implements com.tencent.mm.insane_statistic.a.a
{
  public void execute(g paramg)
  {
    AppMethodBeat.i(16183);
    if (paramg.SG())
    {
      com.tencent.mm.at.r.fGF = new b();
      com.tencent.mm.modelstat.r.fUq = new a();
    }
    AppMethodBeat.o(16183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.insane_statistic.PluginInsaneStatistic
 * JD-Core Version:    0.6.2
 */