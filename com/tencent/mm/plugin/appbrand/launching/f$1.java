package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.u;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements Runnable
{
  f$1(Context paramContext, AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131770);
    Context localContext = this.val$context;
    AppBrandInitConfigWC localAppBrandInitConfigWC = this.igA;
    AppBrandStatObject localAppBrandStatObject = this.igB;
    int i = com.tencent.mm.plugin.appbrand.task.h.d(localContext, localAppBrandInitConfigWC, localAppBrandStatObject);
    if ((localContext instanceof Activity))
    {
      localAppBrandInitConfigWC.bQn = localAppBrandStatObject;
      ((u)e.B(u.class)).a((Activity)localContext, localAppBrandInitConfigWC);
    }
    ab.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] startAppOnInitConfigGot %s", new Object[] { localAppBrandInitConfigWC });
    if ((i == 1) && (!f.d(localAppBrandInitConfigWC, localAppBrandStatObject)))
    {
      new g(localAppBrandInitConfigWC, localAppBrandStatObject).aHd();
      com.tencent.mm.plugin.report.service.h.pYm.k(369L, 21L, 1L);
    }
    AppMethodBeat.o(131770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.f.1
 * JD-Core Version:    0.6.2
 */