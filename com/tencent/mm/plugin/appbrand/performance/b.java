package com.tencent.mm.plugin.appbrand.performance;

import android.util.SparseArray;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.report.quality.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends AppBrandPerformanceManager
{
  public static void n(o paramo)
  {
    AppMethodBeat.i(132500);
    String str = paramo.mAppId;
    ab.d("MicroMsg.AppBrandPerformanceManagerWC", "startMonitoring, appId: %s", new Object[] { str });
    AppBrandPerformanceManager.a locala = (AppBrandPerformanceManager.a)ivB.get(str.hashCode());
    Object localObject = locala;
    if (!(locala instanceof a))
    {
      if (locala != null)
        locala.stop();
      localObject = new a(paramo);
      ivB.put(str.hashCode(), localObject);
    }
    ((AppBrandPerformanceManager.a)localObject).start();
    AppMethodBeat.o(132500);
  }

  static final class a extends AppBrandPerformanceManager.a
  {
    a(o paramo)
    {
      super();
      AppMethodBeat.i(132492);
      this.ivG = paramo.xy();
      AppMethodBeat.o(132492);
    }

    private a.a aKq()
    {
      AppMethodBeat.i(132496);
      try
      {
        a.a locala = ((com.tencent.mm.plugin.appbrand.game.b)com.tencent.mm.plugin.appbrand.a.wI(this.mAppId).atK()).getMBRuntime().getCurrentFps();
        AppMethodBeat.o(132496);
        return locala;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", localException, "get QualityEvent of WAGame but fail.", new Object[0]);
          Object localObject = null;
        }
      }
    }

    protected final void aKk()
    {
      AppMethodBeat.i(132493);
      super.aKk();
      if (this.ivG)
      {
        Object localObject = com.tencent.mm.plugin.appbrand.report.quality.i.iCT;
        localObject = com.tencent.mm.plugin.appbrand.report.quality.i.aLB();
        c.a(this.mAppId, "Hardware", "NATIVE_MEMORY", ((i.a)localObject).iCW);
        c.a(this.mAppId, "Hardware", "DALVIK_MEMORY", ((i.a)localObject).iCX);
      }
      AppMethodBeat.o(132493);
    }

    protected final void aKl()
    {
      AppMethodBeat.i(132494);
      if (!this.ivG)
        AppMethodBeat.o(132494);
      while (true)
      {
        return;
        if (!this.ivC.mFinished)
          break;
        AppMethodBeat.o(132494);
      }
      QualitySessionRuntime localQualitySessionRuntime = com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.mAppId);
      if (localQualitySessionRuntime != null);
      for (int i = bo.gX(ah.getContext()) - localQualitySessionRuntime.iDf; ; i = 2147483647)
      {
        if (i != 2147483647)
          AppBrandPerformanceManager.a(this.ivC, 103, i + "m");
        AppMethodBeat.o(132494);
        break;
      }
    }

    protected final void aKm()
    {
      AppMethodBeat.i(132495);
      if (!this.ivG)
        AppMethodBeat.o(132495);
      while (true)
      {
        return;
        a.a locala = aKq();
        if (locala == null)
        {
          AppMethodBeat.o(132495);
        }
        else
        {
          c.a(this.mAppId, "Game", "FPS_GAME_RT", locala.bSi);
          c.a(this.mAppId, "Game", "FPS_GAME_EX", locala.bSj);
          AppMethodBeat.o(132495);
        }
      }
    }

    protected final void aKn()
    {
      AppMethodBeat.i(132497);
      if (!this.ivG)
        AppMethodBeat.o(132497);
      while (true)
      {
        return;
        try
        {
          int i = ((com.tencent.mm.plugin.appbrand.game.b)com.tencent.mm.plugin.appbrand.a.wI(this.mAppId).atK()).getMBRuntime().getInspector().yu();
          c.a(this.mAppId, "Game", "DRAW_CALLS", i);
          AppMethodBeat.o(132497);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", localException, "get QualityEvent of WAGame but fail.", new Object[0]);
          AppMethodBeat.o(132497);
        }
      }
    }

    protected final void aKo()
    {
      AppMethodBeat.i(132498);
      if (!this.ivG)
        AppMethodBeat.o(132498);
      while (true)
      {
        return;
        try
        {
          int i = ((com.tencent.mm.plugin.appbrand.game.b)com.tencent.mm.plugin.appbrand.a.wI(this.mAppId).atK()).getMBRuntime().getInspector().yv();
          c.a(this.mAppId, "Game", "VERTEXES", i);
          AppMethodBeat.o(132498);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", localException, "get QualityEvent of WAGame but fail.", new Object[0]);
          AppMethodBeat.o(132498);
        }
      }
    }

    protected final void aKp()
    {
      AppMethodBeat.i(132499);
      if (!this.ivG)
        AppMethodBeat.o(132499);
      while (true)
      {
        return;
        try
        {
          int i = ((com.tencent.mm.plugin.appbrand.game.b)com.tencent.mm.plugin.appbrand.a.wI(this.mAppId).atK()).getMBRuntime().getInspector().yw();
          c.a(this.mAppId, "Game", "TRIANGLES", i);
          AppMethodBeat.o(132499);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", localException, "get QualityEvent of WAGame but fail.", new Object[0]);
          AppMethodBeat.o(132499);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.b
 * JD-Core Version:    0.6.2
 */