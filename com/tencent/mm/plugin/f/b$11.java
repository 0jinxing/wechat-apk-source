package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.f.c.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$11
  implements Runnable
{
  b$11(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18591);
    if (!b.e(this.jZY))
    {
      if (b.f(this.jZY) != null)
      {
        b.f(this.jZY).isStop = true;
        b.b(this.jZY, null);
      }
      AppMethodBeat.o(18591);
    }
    while (true)
    {
      return;
      if (this.jZY.aZg())
      {
        h.pYm.a(664L, 3L, 1L, false);
        AppMethodBeat.o(18591);
      }
      else if (b.f(this.jZY) != null)
      {
        AppMethodBeat.o(18591);
      }
      else
      {
        b.b(this.jZY, new c("message", b.aZi(), b.aZj(), b.g(this.jZY)));
        b.d(this.jZY).m(b.f(this.jZY), 2000L);
        if (((Long)g.RP().Ry().get(ac.a.xSS, Long.valueOf(0L))).longValue() <= 0L)
          g.RP().Ry().set(ac.a.xSS, Long.valueOf(bo.anT()));
        AppMethodBeat.o(18591);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.11
 * JD-Core Version:    0.6.2
 */