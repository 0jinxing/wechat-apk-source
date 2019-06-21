package com.tencent.mm.plugin.secinforeport;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements w.a
{
  c$1(c paramc, int paramInt)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(57489);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.SecInfoReporterImpl", "cgireport succ, ctx: %d", new Object[] { Integer.valueOf(this.qjj) });
      e.pXa.a(416L, 1L, 1L, false);
    }
    while (true)
    {
      AppMethodBeat.o(57489);
      return 0;
      ab.w("MicroMsg.SecInfoReporterImpl", "cgireport failed, ctx: %d, err: %d:%d %s", new Object[] { Integer.valueOf(this.qjj), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      e.pXa.a(416L, 2L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.c.1
 * JD-Core Version:    0.6.2
 */