package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public final class c extends b
{
  public static void a(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(131717);
    paramAppBrandInitConfigWC.resetSession();
    paramAppBrandInitConfigWC.resetSession();
    g.RN();
    paramAppBrandInitConfigWC.uin = a.QF();
    boolean bool = f.auT().aI(paramAppBrandInitConfigWC.username, paramAppBrandInitConfigWC.gVs);
    if (f.auU().aF(paramAppBrandInitConfigWC.username, paramAppBrandInitConfigWC.gVs))
      paramAppBrandStatObject.iAo = 1;
    while (true)
    {
      if (paramAppBrandInitConfigWC.xy())
        ((com.tencent.mm.plugin.boots.a.c)g.K(com.tencent.mm.plugin.boots.a.c.class)).rT(com.tencent.mm.plugin.boots.a.b.jJv);
      if (!paramAppBrandInitConfigWC.hgJ)
      {
        ((com.tencent.mm.plugin.boots.a.c)g.K(com.tencent.mm.plugin.boots.a.c.class)).rT(com.tencent.mm.plugin.boots.a.b.jJx);
        if (!paramAppBrandInitConfigWC.xy())
          ((com.tencent.mm.plugin.boots.a.c)g.K(com.tencent.mm.plugin.boots.a.c.class)).rT(com.tencent.mm.plugin.boots.a.b.jJy);
      }
      AppMethodBeat.o(131717);
      return;
      if (bool)
        paramAppBrandStatObject.iAo = 2;
      else
        paramAppBrandStatObject.iAo = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.c
 * JD-Core Version:    0.6.2
 */