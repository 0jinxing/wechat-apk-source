package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.h.z;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;

public final class AppBrandPrepareTask
{
  boolean hrs;
  AppBrandPrepareTask.PrepareParams ifS;
  public volatile transient AppBrandPrepareTask.b<AppBrandSysConfigWC> ifT;
  volatile transient WeakReference<Activity> ifU;

  public AppBrandPrepareTask(Activity paramActivity, o paramo)
  {
    AppMethodBeat.i(131758);
    AppBrandStatObject localAppBrandStatObject = paramo.ya().bQn;
    this.ifS = new AppBrandPrepareTask.PrepareParams();
    this.ifU = new WeakReference(paramActivity);
    AppBrandPrepareTask.PrepareParams.a(this.ifS, paramo.mAppId);
    AppBrandPrepareTask.PrepareParams.b(this.ifS, paramo.atI().username);
    AppBrandPrepareTask.PrepareParams.a(this.ifS, paramo.gNB.gVs);
    paramActivity = this.ifS;
    if (localAppBrandStatObject == null)
    {
      j = 0;
      AppBrandPrepareTask.PrepareParams.b(paramActivity, j);
      paramActivity = this.ifS;
      if (localAppBrandStatObject != null)
        break label236;
    }
    label236: for (int j = i; ; j = localAppBrandStatObject.scene)
    {
      AppBrandPrepareTask.PrepareParams.c(paramActivity, j);
      AppBrandPrepareTask.PrepareParams.c(this.ifS, paramo.atI().hgC);
      AppBrandPrepareTask.PrepareParams.a(this.ifS, paramo.atI().hgF);
      AppBrandPrepareTask.PrepareParams.d(this.ifS, paramo.atI().xz());
      AppBrandPrepareTask.PrepareParams.a(this.ifS, paramo.xy());
      AppBrandPrepareTask.PrepareParams.b(this.ifS, paramo.atI().hgO);
      AppBrandPrepareTask.PrepareParams.a(this.ifS, paramo.atI().hgN);
      this.hrs = paramo.xy();
      AppMethodBeat.o(131758);
      return;
      j = localAppBrandStatObject.cOq;
      break;
    }
  }

  public final void aHd()
  {
    AppMethodBeat.i(131759);
    if (al.isMainThread())
    {
      d.post(new AppBrandPrepareTask.1(this), "AppBrandPrepareTask" + this.ifS.toShortString());
      AppMethodBeat.o(131759);
    }
    while (true)
    {
      return;
      if (!WxaCommLibRuntimeReader.avO())
      {
        ab.i("MicroMsg.AppBrandPrepareTask", "startPrepare(), CommLib not loaded, %s", new Object[] { this.ifS.toShortString() });
        WxaCommLibRuntimeReader.avN();
        z.aBv();
      }
      AppBrandPrepareTask.PrepareParams.d(this.ifS, WxaCommLibRuntimeReader.avQ().gVu);
      XIPCInvoker.a("com.tencent.mm", this.ifS, AppBrandPrepareTask.a.class, new AppBrandPrepareTask.2(this));
      ab.i("MicroMsg.AppBrandPrepareTask", "[applaunch] startPrepare in appbrand %s, %d", new Object[] { AppBrandPrepareTask.PrepareParams.a(this.ifS), Integer.valueOf(AppBrandPrepareTask.PrepareParams.b(this.ifS)) });
      AppMethodBeat.o(131759);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask
 * JD-Core Version:    0.6.2
 */