package com.tencent.mm.plugin.monitor;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$13$1
  implements a
{
  b$13$1(b.13 param13)
  {
  }

  public final void a(int paramInt, a.a parama)
  {
    AppMethodBeat.i(84531);
    b.a(this.oEV.oEL, SystemClock.uptimeMillis());
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv callback errType[%d] lastScanTime[%d], result[%s][%s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(b.l(this.oEV.oEL)), b.p(this.oEV.oEL), parama });
    b.a(this.oEV.oEL, null);
    if ((paramInt == 0) && (!parama.fIa))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xPt, Long.valueOf(b.l(this.oEV.oEL)));
      g.RQ();
      g.RP().Ry().dsb();
    }
    while (true)
    {
      try
      {
        b.b(this.oEV.oEL, parama);
        AppMethodBeat.o(84531);
        return;
      }
      catch (Exception parama)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", parama, "doReportSDInfo err!", new Object[0]);
        h.pYm.a(418L, 6L, 1L, true);
      }
      AppMethodBeat.o(84531);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.13.1
 * JD-Core Version:    0.6.2
 */