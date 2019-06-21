package com.tencent.mm.plugin.appbrand.app;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.mm.plugin.appbrand.task.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class b
{
  private static volatile boolean gQN = false;
  private static volatile boolean gQO = false;

  public static void a(g paramg, AppBrandPreloadProfiler paramAppBrandPreloadProfiler)
  {
    AppMethodBeat.i(129194);
    gQO = true;
    if ((paramg == null) || (paramg == g.iFh))
    {
      ab.i("MicroMsg.AppBrandProcessProfileInit[applaunch]", "dl: AppBrandProcessPreloader said I can not preload [nil] type.");
      AppMethodBeat.o(129194);
    }
    while (true)
    {
      return;
      AppBrandPreloadProfiler localAppBrandPreloadProfiler = paramAppBrandPreloadProfiler;
      if (paramAppBrandPreloadProfiler == null)
        localAppBrandPreloadProfiler = new AppBrandPreloadProfiler();
      localAppBrandPreloadProfiler.iEi = SystemClock.elapsedRealtime();
      al.d(new b.1(paramg, localAppBrandPreloadProfiler));
      AppMethodBeat.o(129194);
    }
  }

  public static boolean auE()
  {
    return gQO;
  }

  public static void auF()
  {
    AppMethodBeat.i(129195);
    ab.i("MicroMsg.AppBrandProcessProfileInit[applaunch]", "setSkipMiscPreload %b", new Object[] { Boolean.TRUE });
    gQN = true;
    AppMethodBeat.o(129195);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.b
 * JD-Core Version:    0.6.2
 */