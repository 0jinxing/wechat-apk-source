package com.tencent.mm.plugin.appbrand.game;

import android.util.SparseLongArray;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.a;
import com.tencent.magicbrush.c;
import com.tencent.magicbrush.handler.MBJsThreadHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.game.d.d;
import com.tencent.mm.plugin.appbrand.game.f.a.1;
import com.tencent.mm.plugin.appbrand.game.f.a.2;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.report.quality.j;
import com.tencent.mm.plugin.appbrand.report.quality.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$a extends MBRuntime.a
{
  private b$a(b paramb)
  {
  }

  public final void onConsoleOutput(String paramString)
  {
    AppMethodBeat.i(130012);
    ab.i("MicroMsg.WAGameAppService", "[WAGame][CONSOLE] output = [%s]", new Object[] { paramString });
    if ((!this.hqr.atU()) && (!this.hqr.isRunning()))
      AppMethodBeat.o(130012);
    while (true)
    {
      return;
      o localo = this.hqr.getRuntime();
      if ((localo == null) || (localo.atH().bQp))
        d.aAI().Ax(paramString);
      AppMethodBeat.o(130012);
    }
  }

  public final void onFirstFrameRendered()
  {
    AppMethodBeat.i(130011);
    com.tencent.mm.plugin.appbrand.game.f.a locala;
    if ((this.hqr.atU()) || (this.hqr.isRunning()))
    {
      locala = com.tencent.mm.plugin.appbrand.game.f.a.aBG();
      locala.hud = bo.yz();
    }
    try
    {
      locala.mbInspector = ((b)com.tencent.mm.plugin.appbrand.a.wI(locala.appId).atK()).getMBRuntime().getInspector();
      if (locala.mbInspector != null)
      {
        com.tencent.magicbrush.a locala1 = locala.mbInspector;
        int i = locala1.yt();
        locala1.bSh.put(i, c.yz());
        locala.hue = i;
      }
      com.tencent.mm.ce.a.post(new a.1(locala));
      com.tencent.mm.ce.a.postDelayed(new a.2(locala), 10L);
      AppMethodBeat.o(130011);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MBNiReporter", localNullPointerException, "inspector null pointer!", new Object[0]);
    }
  }

  public final void onMainCanvasTypeDefined(int paramInt)
  {
    AppMethodBeat.i(130013);
    if ((paramInt != 1) && (paramInt != 2))
    {
      localObject = new IllegalStateException("onMainCanvasTypeDefined received invalid input [" + paramInt + "]");
      AppMethodBeat.o(130013);
      throw ((Throwable)localObject);
    }
    if ((!this.hqr.atU()) && (!this.hqr.isRunning()))
      AppMethodBeat.o(130013);
    while (true)
    {
      return;
      localObject = com.tencent.mm.plugin.appbrand.report.quality.a.DG(this.hqr.getRuntime().mAppId);
      if (localObject != null)
        break;
      AppMethodBeat.o(130013);
    }
    j localj = ((QualitySessionRuntime)localObject).iDi;
    if (paramInt == 1);
    for (Object localObject = j.a.iDn; ; localObject = j.a.iDo)
    {
      localj.iDl = ((j.a)localObject);
      AppMethodBeat.o(130013);
      break;
    }
  }

  public final void onRendererReady(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130009);
    ab.i("MicroMsg.WAGameAppService", "MagicBrushListener.onRendererReady width = [%d] height = [%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b.a(this.hqr);
    this.hqr.getMBRuntime().getJsThreadHandler().f(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(130008);
        b.b(b.a.this.hqr);
        AppMethodBeat.o(130008);
      }
    });
    AppMethodBeat.o(130009);
  }

  public final void onSystemSizeChanged(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130010);
    o localo = this.hqr.getRuntime();
    if (localo == null)
      AppMethodBeat.o(130010);
    while (true)
    {
      return;
      m localm = localo.gNM;
      ab.i("MicroMsg.AppBrandOnWindowSizeChangedEvent", "hy: on resizeWindow");
      localm.i(localo.xT()).aCj();
      AppMethodBeat.o(130010);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.a
 * JD-Core Version:    0.6.2
 */