package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class b$10
  implements Runnable
{
  b$10(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84527);
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUserRunnable run");
    if (g.RK())
      b.h(this.oEL);
    AppMethodBeat.o(84527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.10
 * JD-Core Version:    0.6.2
 */