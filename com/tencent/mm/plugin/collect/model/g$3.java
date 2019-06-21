package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class g$3
  implements Runnable
{
  g$3(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40936);
    if ((g.a(this.kBV) != null) && (g.b(this.kBV)) && (g.c(this.kBV) == null))
    {
      ab.i("MicroMsg.F2fRcvVoiceListener", "this play may error");
      h.pYm.a(699L, 1L, 1L, false);
    }
    AppMethodBeat.o(40936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.3
 * JD-Core Version:    0.6.2
 */