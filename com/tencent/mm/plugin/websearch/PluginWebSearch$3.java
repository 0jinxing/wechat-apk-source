package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class PluginWebSearch$3
  implements Runnable
{
  PluginWebSearch$3(PluginWebSearch paramPluginWebSearch)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91307);
    aa.lL(5000L);
    long l = aa.Id(1);
    if (((Long)g.RP().Ry().get(ac.a.xVX, Long.valueOf(0L))).longValue() != l)
    {
      h.pYm.e(17040, new Object[] { Integer.valueOf(2), Long.valueOf(l) });
      g.RP().Ry().set(ac.a.xVX, Long.valueOf(l));
      g.RP().Ry().dsb();
    }
    AppMethodBeat.o(91307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch.3
 * JD-Core Version:    0.6.2
 */