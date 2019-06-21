package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.jsapi.version.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandPrepareTask$a$1
  implements g.b
{
  AppBrandPrepareTask$a$1(AppBrandPrepareTask.a parama, c paramc, AppBrandPrepareTask.PrepareParams paramPrepareParams)
  {
  }

  public final void a(AppBrandSysConfigWC paramAppBrandSysConfigWC, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction, AppStartupPerformanceReportBundle paramAppStartupPerformanceReportBundle)
  {
    AppMethodBeat.i(131740);
    if (this.ifZ != null)
    {
      AppBrandPrepareTask.PrepareResult localPrepareResult = new AppBrandPrepareTask.PrepareResult();
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, 2);
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, paramAppBrandSysConfigWC);
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, paramAppBrandLaunchErrorAction);
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, paramAppStartupPerformanceReportBundle);
      this.ifZ.ao(localPrepareResult);
      if (paramAppBrandSysConfigWC != null)
      {
        paramAppBrandSysConfigWC = new AppBrandPrepareTask.a.1.1(this);
        if (!AppBrandPrepareTask.PrepareParams.f(this.iga))
        {
          paramAppBrandSysConfigWC = new i(AppBrandPrepareTask.PrepareParams.c(this.iga), AppBrandPrepareTask.PrepareParams.d(this.iga), paramAppBrandSysConfigWC, AppBrandPrepareTask.PrepareParams.g(this.iga));
          if (paramAppBrandSysConfigWC.igX == null)
            break label148;
          d.post(new i.1(paramAppBrandSysConfigWC), "MicroMsg.AppBrand.Launching.ContactSilentSyncProcess");
          AppMethodBeat.o(131740);
        }
      }
    }
    while (true)
    {
      return;
      paramAppBrandSysConfigWC.b(a.hYf);
      label148: AppMethodBeat.o(131740);
      continue;
      r.zu(p.zo(AppBrandPrepareTask.PrepareParams.a(this.iga)));
      AppMethodBeat.o(131740);
    }
  }

  public final void aHe()
  {
    AppMethodBeat.i(131737);
    if (this.ifZ != null)
    {
      AppBrandPrepareTask.PrepareResult localPrepareResult = new AppBrandPrepareTask.PrepareResult();
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, 1);
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, bo.anU());
      this.ifZ.ao(localPrepareResult);
    }
    AppMethodBeat.o(131737);
  }

  public final void atT()
  {
    AppMethodBeat.i(131739);
    if (this.ifZ != null)
    {
      AppBrandPrepareTask.PrepareResult localPrepareResult = new AppBrandPrepareTask.PrepareResult();
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, 6);
      this.ifZ.ao(localPrepareResult);
    }
    AppMethodBeat.o(131739);
  }

  public final void nm(int paramInt)
  {
    AppMethodBeat.i(131741);
    AppBrandPrepareTask.PrepareResult localPrepareResult = new AppBrandPrepareTask.PrepareResult();
    AppBrandPrepareTask.PrepareResult.a(localPrepareResult, 7);
    AppBrandPrepareTask.PrepareResult.c(localPrepareResult, paramInt);
    this.ifZ.ao(localPrepareResult);
    AppMethodBeat.o(131741);
  }

  public final void onDownloadProgress(int paramInt)
  {
    AppMethodBeat.i(131738);
    if (this.ifZ != null)
    {
      AppBrandPrepareTask.PrepareResult localPrepareResult = new AppBrandPrepareTask.PrepareResult();
      AppBrandPrepareTask.PrepareResult.b(localPrepareResult, paramInt);
      AppBrandPrepareTask.PrepareResult.a(localPrepareResult, 4);
      this.ifZ.ao(localPrepareResult);
    }
    AppMethodBeat.o(131738);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.a.1
 * JD-Core Version:    0.6.2
 */