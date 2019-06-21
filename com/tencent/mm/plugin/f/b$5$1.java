package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class b$5$1
  implements Runnable
{
  b$5$1(b.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18581);
    g.RP().Ry().set(ac.a.xSQ, Long.valueOf(-1L));
    g.RP().Ry().set(ac.a.xSP, Long.valueOf(0L));
    g.RP().Ry().dsb();
    b.aZc().aZd().delete();
    b.d(this.kae.jZY, false);
    AppMethodBeat.o(18581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.5.1
 * JD-Core Version:    0.6.2
 */