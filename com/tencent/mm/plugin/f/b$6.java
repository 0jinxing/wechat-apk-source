package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.f.c.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$6
  implements Runnable
{
  b$6(b paramb, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18585);
    if (this.kaf)
      b.a(this.jZY, true);
    if (!b.a(this.jZY))
      AppMethodBeat.o(18585);
    while (true)
    {
      return;
      if (b.b(this.jZY) == null)
      {
        ju localju = new ju();
        if (this.jZY.aZg())
        {
          b.a(this.jZY, false);
          localju.cES.cco = true;
          a.xxA.m(localju);
          h.pYm.a(664L, 9L, 1L, false);
          AppMethodBeat.o(18585);
        }
        else
        {
          if (this.kaf)
            h.pYm.a(664L, 7L, 1L, false);
          localju.cES.progress = b.aZi();
          localju.cES.cET = b.aZf();
          localju.cES.cco = false;
          a.xxA.m(localju);
          b.a(this.jZY, new c("message", b.aZi(), b.aZj(), b.c(this.jZY)));
          b.d(this.jZY).aa(b.b(this.jZY));
          if (((Long)g.RP().Ry().get(ac.a.xSS, Long.valueOf(0L))).longValue() <= 0L)
            g.RP().Ry().set(ac.a.xSS, Long.valueOf(bo.anT()));
        }
      }
      else
      {
        AppMethodBeat.o(18585);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.6
 * JD-Core Version:    0.6.2
 */