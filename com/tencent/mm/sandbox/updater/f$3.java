package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3
  implements Runnable
{
  f$3(f paramf, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28901);
    ab.d("MicroMsg.TrafficStatistic", "onDownstreamTraffic downstream : %s", new Object[] { Long.valueOf(this.xwB) });
    f.b(this.xwz, f.b(this.xwz) + Math.max(0L, this.xwB));
    f.a(this.xwz, false);
    AppMethodBeat.o(28901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.f.3
 * JD-Core Version:    0.6.2
 */