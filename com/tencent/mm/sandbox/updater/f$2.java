package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements Runnable
{
  f$2(f paramf, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28900);
    ab.d("MicroMsg.TrafficStatistic", "onUpstreamTraffic upstream : %s", new Object[] { Long.valueOf(this.xwA) });
    f.a(this.xwz, f.a(this.xwz) + Math.max(0L, this.xwA));
    f.a(this.xwz, false);
    AppMethodBeat.o(28900);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.f.2
 * JD-Core Version:    0.6.2
 */