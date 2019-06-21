package com.tencent.mm.plugin.appbrand.launching;

import a.l;
import com.tencent.luggage.g.d;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/launching/LaunchPrepareCallbackWrapper;", "C", "Lcom/tencent/luggage/sdk/config/AppBrandSysConfigLU;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareCallback;", "Lcom/tencent/mm/vending/lifecycle/ILifeCycle;", "referenced", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareCallback;)V", "mDead", "", "mReferenced", "dead", "", "onDataTransferState", "state", "", "onDownloadProcess", "progress", "onDownloadStarted", "startTime", "", "onPrepareDone", "config", "errorAction", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorAction;", "startupPerformanceReport", "Lcom/tencent/mm/plugin/appbrand/launching/AppStartupPerformanceReportBundle;", "(Lcom/tencent/luggage/sdk/config/AppBrandSysConfigLU;Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorAction;Lcom/tencent/mm/plugin/appbrand/launching/AppStartupPerformanceReportBundle;)V", "onSyncLaunchStart", "onVersionUpdateEvent", "Lcom/tencent/mm/plugin/appbrand/jsapi/version/UpdateState;", "tryOrThrows", "block", "Lkotlin/Function0;", "plugin-appbrand-integration_release"})
public final class x<C extends AppBrandSysConfigLU>
  implements AppBrandPrepareTask.b<C>, com.tencent.mm.vending.e.a
{
  private volatile boolean gOp;
  private volatile AppBrandPrepareTask.b<C> ihJ;

  public x(AppBrandPrepareTask.b<C> paramb)
  {
    AppMethodBeat.i(134717);
    this.ihJ = paramb;
    AppMethodBeat.o(134717);
  }

  public final void a(C paramC, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction, AppStartupPerformanceReportBundle paramAppStartupPerformanceReportBundle)
  {
    AppMethodBeat.i(134712);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.a(paramC, paramAppBrandLaunchErrorAction, paramAppStartupPerformanceReportBundle);
        AppMethodBeat.o(134712);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134712);
      }
    }
    catch (Throwable paramC)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + paramC + " when dead");
        AppMethodBeat.o(134712);
      }
      AppMethodBeat.o(134712);
    }
    throw paramC;
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.version.a parama)
  {
    AppMethodBeat.i(134715);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.a(parama);
        AppMethodBeat.o(134715);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134715);
      }
    }
    catch (Throwable parama)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + parama + " when dead");
        AppMethodBeat.o(134715);
      }
      AppMethodBeat.o(134715);
    }
    throw parama;
  }

  public final void atT()
  {
    AppMethodBeat.i(134716);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.atT();
        AppMethodBeat.o(134716);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134716);
      }
    }
    catch (Throwable localThrowable)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + localThrowable + " when dead");
        AppMethodBeat.o(134716);
      }
      AppMethodBeat.o(134716);
      throw localThrowable;
    }
  }

  public final void dead()
  {
    this.ihJ = null;
    this.gOp = true;
  }

  public final void gf(long paramLong)
  {
    AppMethodBeat.i(134713);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.gf(paramLong);
        AppMethodBeat.o(134713);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134713);
      }
    }
    catch (Throwable localThrowable)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + localThrowable + " when dead");
        AppMethodBeat.o(134713);
      }
      AppMethodBeat.o(134713);
      throw localThrowable;
    }
  }

  public final void nm(int paramInt)
  {
    AppMethodBeat.i(134711);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.nm(paramInt);
        AppMethodBeat.o(134711);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134711);
      }
    }
    catch (Throwable localThrowable)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + localThrowable + " when dead");
        AppMethodBeat.o(134711);
      }
      AppMethodBeat.o(134711);
      throw localThrowable;
    }
  }

  public final void nn(int paramInt)
  {
    AppMethodBeat.i(134714);
    try
    {
      AppBrandPrepareTask.b localb = this.ihJ;
      if (localb != null)
      {
        localb.nn(paramInt);
        AppMethodBeat.o(134714);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(134714);
      }
    }
    catch (Throwable localThrowable)
    {
      while (this.gOp)
      {
        d.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows get " + localThrowable + " when dead");
        AppMethodBeat.o(134714);
      }
      AppMethodBeat.o(134714);
      throw localThrowable;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.x
 * JD-Core Version:    0.6.2
 */