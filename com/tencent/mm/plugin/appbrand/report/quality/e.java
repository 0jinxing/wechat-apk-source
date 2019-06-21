package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Handler;
import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.MBParams;
import com.tencent.magicbrush.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cd;
import com.tencent.mm.g.b.a.cd.a;
import com.tencent.mm.plugin.appbrand.game.b;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.performance.f;

public final class e
{
  Handler handler;
  final e.a iCJ;
  QualitySessionRuntime iCK;
  f iCL;

  public e()
  {
    AppMethodBeat.i(132691);
    this.iCJ = new e.a(this, (byte)0);
    AppMethodBeat.o(132691);
  }

  private static int C(com.tencent.mm.plugin.appbrand.i parami)
  {
    AppMethodBeat.i(132694);
    try
    {
      i = parami.gNz.atw();
      AppMethodBeat.o(132694);
      return i;
    }
    catch (Exception parami)
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(132694);
      }
    }
  }

  final void IF()
  {
    while (true)
    {
      QualitySessionRuntime localQualitySessionRuntime;
      try
      {
        AppMethodBeat.i(132693);
        if (this.iCK == null)
        {
          AppMethodBeat.o(132693);
          return;
        }
        localQualitySessionRuntime = this.iCK;
        if (localQualitySessionRuntime == null)
        {
          Object localObject1 = null;
          if (localObject1 != null)
            break label365;
          AppMethodBeat.o(132693);
          continue;
        }
      }
      finally
      {
      }
      Object localObject3 = localQualitySessionRuntime.htn;
      Object localObject5 = new com/tencent/mm/plugin/appbrand/report/quality/k$a;
      ((k.a)localObject5).<init>();
      Object localObject6 = i.iCT;
      localObject6 = i.aLB();
      ((k.a)localObject5).iCV = ((i.a)localObject6).iCV;
      ((k.a)localObject5).iDu = (((i.a)localObject6).iCV - localQualitySessionRuntime.iDf);
      ((k.a)localObject5).iCW = ((i.a)localObject6).iCW;
      ((k.a)localObject5).iCX = ((i.a)localObject6).iCX;
      ((k.a)localObject5).hrU = C((com.tencent.mm.plugin.appbrand.i)localObject3);
      ((k.a)localObject5).iDv = ((int)(System.currentTimeMillis() - localQualitySessionRuntime.iDc));
      ((k.a)localObject5).iDw = ((int)Math.round(h.iCR.ivH.aKs()));
      Object localObject4;
      int i;
      if (localQualitySessionRuntime.hrs)
      {
        localObject6 = localQualitySessionRuntime.htn;
        try
        {
          localObject3 = ((b)((o)localObject6).atK()).getMBRuntime();
          if (localObject3 == null)
          {
            d.e("MicroMsg.AppBrandRuntimeEventReporter", "buildWAGameQualityEvent find renderer.fps == null");
            localObject3 = new k((k.a)localObject5, (byte)0);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            d.printErrStackTrace("MicroMsg.AppBrandRuntimeEventReporter", localException, "get QualityEvent of WAGame but fail. [%s]", new Object[] { localObject6 });
            localObject4 = null;
          }
          ((k.a)localObject5).fps = Math.round(((MBRuntime)localObject4).getInspector().getCurrentFps().bSi);
          ((k.a)localObject5).iDq = ((MBRuntime)localObject4).getInspector().ys();
          ((k.a)localObject5).iDs = ((MBRuntime)localObject4).getInspector().yu();
          ((k.a)localObject5).iDt = ((MBRuntime)localObject4).getInspector().yv();
          ((k.a)localObject5).iDr = ((MBRuntime)localObject4).getInspector().yw();
          ((k.a)localObject5).iDl = localQualitySessionRuntime.iDi.iDl;
          if (!((MBRuntime)localObject4).getParams().use_command_buffer);
        }
        for (i = 1; ; i = 0)
        {
          ((k.a)localObject5).iDx = i;
          break;
        }
      }
      else
      {
        localObject4 = localQualitySessionRuntime.iDh;
        if (((e)localObject4).iCL == null);
        for (i = 0; ; i = (int)(((e)localObject4).iCL.iwc + 0.5D))
        {
          ((k.a)localObject5).fps = i;
          break;
        }
        label365: a.aLz();
        localQualitySessionRuntime = a.DG(this.iCK.appId);
        if (localQualitySessionRuntime != null)
        {
          localObject5 = new com/tencent/mm/g/b/a/cd;
          ((cd)localObject5).<init>();
          ((cd)localObject5).gV(localQualitySessionRuntime.appId);
          ((cd)localObject5).gU(localQualitySessionRuntime.igT);
          ((cd)localObject5).dfc = cd.a.hd(localQualitySessionRuntime.iCZ);
          ((cd)localObject5).ddz = localQualitySessionRuntime.apptype;
          ((cd)localObject5).ddd = localQualitySessionRuntime.iDa;
          ((cd)localObject5).cVR = localQualitySessionRuntime.scene;
          ((cd)localObject5).He();
          ((cd)localObject5).Hf();
          ((cd)localObject5).Hd();
          ((cd)localObject5).dfd = ((k)localObject4).fps;
          ((cd)localObject5).dfe = Math.round(((k)localObject4).iDq);
          if (((k)localObject4).iDl == j.a.iDn)
          {
            i = 1;
            label497: ((cd)localObject5).dfm = i;
            ((cd)localObject5).dfn = ((k)localObject4).iDr;
            ((cd)localObject5).dfo = ((k)localObject4).iDs;
            ((cd)localObject5).dfp = ((k)localObject4).iDt;
            ((cd)localObject5).dfi = ((k)localObject4).iCW;
            ((cd)localObject5).dfj = ((k)localObject4).iCX;
            ((cd)localObject5).dfg = ((k)localObject4).iCV;
            ((cd)localObject5).dfh = ((k)localObject4).iDu;
            ((cd)localObject5).dfk = (((k)localObject4).iDv / 1000);
            ((cd)localObject5).dfl = ((k)localObject4).hrU;
            ((cd)localObject5).dff = ((k)localObject4).iDw;
            ((cd)localObject5).dfq = ((k)localObject4).iDx;
            ((cd)localObject5).ajK();
          }
        }
        else
        {
          if (!this.iCK.hrs)
            break label1727;
          localObject5 = new com/tencent/mm/plugin/appbrand/game/d/e;
          ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).<init>(this.iCK, (k)localObject4);
          if (((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV == null)
            break label1727;
          localObject4 = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV;
          if (((k)localObject4).iDl != j.a.iDn)
            break label1696;
          i = 1;
        }
        while (true)
        {
          ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT = i;
          ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.hrU;
          if (((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV != null)
          {
            j = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDv;
            i = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDw;
            com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hrX.hsh), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Kv_14959", "Kv_14959.reportCpu cpu = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT) });
          }
          if (((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV != null)
          {
            j = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDv;
            int k = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iCV;
            i = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iCW;
            int m = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iCX;
            int n = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDu;
            com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hrY.hsh), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
            com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hsc.hsh), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
            com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hsd.hsh), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
            com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hsf.hsh), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Kv_14959", "Kv_14959.reportMemory pid = [%d] native = [%d] dalvik = [%d] delta = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT) });
          }
          if (((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV == null)
            break label1727;
          i = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDv;
          int j = ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.fps;
          com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hrW.hsh), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Kv_14959", "Kv_14959.reportFps fps = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT) });
          j = (int)((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrV.iDq;
          if (j == -1)
            break label1718;
          com.tencent.mm.plugin.report.service.h.pYm.e(14959, new Object[] { ((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).axy), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).css), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hsg.hsh), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU) });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.Kv_14959", "Kv_14959.reportFps variance fps = [%d] eventid: [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(com.tencent.mm.plugin.appbrand.game.d.e.a.hsg.hsh), Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrU), Integer.valueOf(((com.tencent.mm.plugin.appbrand.game.d.e)localObject5).hrT) });
          AppMethodBeat.o(132693);
          break;
          if (((k)localObject4).iDl == j.a.iDo)
          {
            i = 2;
            break label497;
          }
          i = 0;
          break label497;
          label1696: if (((k)localObject4).iDl == j.a.iDo)
            i = 2;
          else
            i = 0;
        }
        label1718: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.Kv_14959", "variance == -1!");
        label1727: AppMethodBeat.o(132693);
      }
    }
  }

  public final boolean aLA()
  {
    try
    {
      QualitySessionRuntime localQualitySessionRuntime = this.iCK;
      if (localQualitySessionRuntime != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final void destroy()
  {
    try
    {
      AppMethodBeat.i(132692);
      this.iCK = null;
      if (this.handler != null)
      {
        this.handler.removeCallbacks(this.iCJ);
        this.handler = null;
      }
      if (this.iCL != null)
      {
        this.iCL.stop();
        this.iCL = null;
      }
      AppMethodBeat.o(132692);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.e
 * JD-Core Version:    0.6.2
 */