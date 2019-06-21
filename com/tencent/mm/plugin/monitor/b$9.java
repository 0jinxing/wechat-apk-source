package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.g.a.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class b$9
  implements Runnable
{
  b$9(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84526);
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportAllRunnable run");
    if (!g.RK())
    {
      ab.w("MicroMsg.SubCoreBaseMonitor", "account has not initalized!");
      AppMethodBeat.o(84526);
    }
    while (true)
    {
      return;
      b.b(this.oEL);
      b.c(this.oEL);
      b.d(this.oEL);
      b.e(this.oEL);
      b.f(this.oEL);
      d.xDH.al(b.g(this.oEL));
      d.xDH.o(b.g(this.oEL), 10000L);
      AppMethodBeat.o(84526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.9
 * JD-Core Version:    0.6.2
 */