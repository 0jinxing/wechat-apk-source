package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.mm.plugin.appbrand.jsapi.version.a;

public abstract interface AppBrandPrepareTask$b<C extends AppBrandSysConfigLU> extends j
{
  public abstract void a(C paramC, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction, AppStartupPerformanceReportBundle paramAppStartupPerformanceReportBundle);

  public abstract void a(a parama);

  public abstract void atT();

  public abstract void gf(long paramLong);

  public abstract void nn(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.b
 * JD-Core Version:    0.6.2
 */