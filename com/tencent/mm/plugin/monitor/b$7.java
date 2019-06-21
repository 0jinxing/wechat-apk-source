package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.ab;

final class b$7
  implements Runnable
{
  b$7(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84523);
    ab.i("MicroMsg.SubCoreBaseMonitor", "reportECDHAuth USE_ECDH[%s] USE_ML[%b]", new Object[] { Boolean.valueOf(f.vxx), Boolean.valueOf(f.vxy) });
    h localh = h.pYm;
    if (f.vxx)
    {
      l = 100L;
      localh.a(148L, l, 1L, true);
      localh = h.pYm;
      if (!f.vxy)
        break label95;
    }
    label95: for (long l = 102L; ; l = 103L)
    {
      localh.a(148L, l, 1L, true);
      AppMethodBeat.o(84523);
      return;
      l = 101L;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.7
 * JD-Core Version:    0.6.2
 */