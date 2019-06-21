package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.a;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.t;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class CoreService$4
  implements ap.a
{
  CoreService$4(CoreService paramCoreService)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(57729);
    s locals = CoreService.a(this.ebM);
    int i;
    if (bo.az(locals.ghi) < locals.ghg)
    {
      ab.i("MicroMsg.FrequncyLimiter", "frequency limited, last=" + locals.ghi + ", cur=" + bo.yz() + ", retries=" + locals.ghj);
      if (locals.ghj <= 0)
      {
        i = 0;
        if (i != 0)
          break label238;
        ab.e("MicroMsg.CoreService", "setNetworkAvailable checker frequency limited");
      }
    }
    while (true)
    {
      ab.i("MicroMsg.CoreService", "setNetworkAvailable finish lockCount:%d delayCount:%d delayDur:%d", new Object[] { Long.valueOf(CoreService.c(this.ebM)), Long.valueOf(CoreService.d(this.ebM)), Long.valueOf(bo.anU() - CoreService.e(this.ebM)) });
      CoreService.f(this.ebM);
      CoreService.g(this.ebM);
      CoreService.h(this.ebM);
      new ap(new CoreService.4.1(this), false).ae(500L, 500L);
      AppMethodBeat.o(57729);
      while (true)
      {
        return true;
        for (locals.ghj -= 1; ; locals.ghj = locals.ghh)
        {
          locals.ghi = bo.yz();
          i = 1;
          break;
        }
        label238: boolean bool1 = CoreService.b(this.ebM).gcU.adb();
        boolean bool2 = aa.ano().amV();
        ab.i("MicroMsg.CoreService", "setNetworkAvailable  deal with Sync Check isSessionKeyNull:%b, isLogin:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((!bool1) || (bool2) || (!g.a(1, 0, null, CoreService.b(this.ebM).gcU.jQ(1), bo.anU())))
          break label336;
        ab.i("MicroMsg.CoreService", "setNetworkAvailable deal with notify sync in push");
        AppMethodBeat.o(57729);
      }
      label336: CoreService.Ie();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService.4
 * JD-Core Version:    0.6.2
 */