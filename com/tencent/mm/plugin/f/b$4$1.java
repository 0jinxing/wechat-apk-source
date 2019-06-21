package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$4$1
  implements Runnable
{
  b$4$1(b.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18579);
    this.kad.jZY.aZe();
    ab.i("MicroMsg.CalcWxService", "start to calc");
    if (this.kad.jZY.aZg())
    {
      b localb = this.kad.jZY;
      if (bo.gb(((Long)g.RP().Ry().get(ac.a.xSR, Long.valueOf(0L))).longValue()) >= 259200000L)
      {
        if (localb.jZN != null)
          localb.jZN.isStop = true;
        localb.jZN = new com.tencent.mm.plugin.f.c.b();
        localb.f(localb.jZN);
        g.RP().Ry().set(ac.a.xSR, Long.valueOf(bo.anU()));
      }
      AppMethodBeat.o(18579);
    }
    while (true)
    {
      return;
      h.pYm.a(664L, 1L, 1L, false);
      b.i(this.kad.jZY);
      AppMethodBeat.o(18579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.4.1
 * JD-Core Version:    0.6.2
 */