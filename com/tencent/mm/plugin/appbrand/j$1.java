package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.appbrand.task.e.b;
import com.tencent.mm.plugin.appbrand.task.g;
import com.tencent.mm.sdk.platformtools.ab;

final class j$1
  implements Runnable
{
  j$1(j paramj, o paramo, i.b paramb, e.b paramb1)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(128955);
    o localo = this.gOt;
    i.b localb = this.gOu;
    e.b localb1 = this.gOv;
    int j = i;
    if (!localo.mFinished)
    {
      if (!localo.eMP)
        break label61;
      j = i;
    }
    while (true)
    {
      if (j == 0)
        this.gOu.wL();
      AppMethodBeat.o(128955);
      return;
      label61: j = i;
      if (e.aLQ())
      {
        g localg = g.c(localo.atI());
        j = i;
        if (localg == g.iFf)
        {
          ab.i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", "tryPreloadBeforeResourceDone, entered, reason[%s], appId[%s]", new Object[] { localb1.name(), localo.mAppId });
          QualitySessionRuntime localQualitySessionRuntime = a.DG(localo.mAppId);
          if (localQualitySessionRuntime != null)
            localQualitySessionRuntime.iDj = true;
          e.a(localg, new j.a(localb1, localo, localb), true, null);
          j = 1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.1
 * JD-Core Version:    0.6.2
 */