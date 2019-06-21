package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$6
  implements Runnable
{
  b$6(b paramb, long paramLong1, ac.a parama, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84522);
    if (!g.RK())
      AppMethodBeat.o(84522);
    while (true)
    {
      return;
      g.RQ();
      g.RP().Ry().set(ac.a.xQr, Long.valueOf(this.oES));
      if (this.oET != null)
      {
        g.RQ();
        g.RP().Ry().set(this.oET, Long.valueOf(this.eBy));
      }
      ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", new Object[] { Long.valueOf(this.oES), Long.valueOf(b.s(this.oEL)), this.oET, Long.valueOf(this.eBy) });
      AppMethodBeat.o(84522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.6
 * JD-Core Version:    0.6.2
 */