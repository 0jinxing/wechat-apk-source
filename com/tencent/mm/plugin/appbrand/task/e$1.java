package com.tencent.mm.plugin.appbrand.task;

import android.os.SystemClock;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.h.z;
import com.tencent.mm.plugin.appbrand.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class e$1
  implements Runnable
{
  e$1(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132790);
    try
    {
      e.aLS().startTime = SystemClock.elapsedRealtime();
      ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "preInit start");
      al.Ma(-2);
      try
      {
        WxaCommLibRuntimeReader.sg();
        z.aBv();
        if (this.gQP == g.iFg)
        {
          e.BK();
          e.BL();
          ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "[wagame] misc preload done");
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          ab.e("MicroMsg.AppBrandProcessPreloader[applaunch]", "skip preload runtime, load CommLib get exception %s", new Object[] { Log.getStackTraceString(localThrowable) });
          e.access$100();
          ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "misc preload done");
          al.Ma(10);
          AppMethodBeat.o(132790);
          continue;
          e.BM();
          if (y.auw())
          {
            e.aLT();
            ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "webview already init done");
            ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "misc preload done");
            al.Ma(10);
            AppMethodBeat.o(132790);
          }
          else
          {
            long l = System.currentTimeMillis();
            e.1.1 local1 = new com/tencent/mm/plugin/appbrand/task/e$1$1;
            local1.<init>(this, l);
            y.a(local1);
            ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "misc preload done");
            al.Ma(10);
            AppMethodBeat.o(132790);
          }
        }
      }
    }
    finally
    {
      ab.i("MicroMsg.AppBrandProcessPreloader[applaunch]", "misc preload done");
      al.Ma(10);
      AppMethodBeat.o(132790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.e.1
 * JD-Core Version:    0.6.2
 */