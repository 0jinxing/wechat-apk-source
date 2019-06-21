package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import a.l;
import android.content.Context;
import com.tencent.luggage.sdk.customize.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.launching.precondition.f;
import com.tencent.mm.plugin.appbrand.o;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic;", "", "()V", "loadNewRuntimeUglyMaybe", "", "from", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "to", "config", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "navigateToStandaloneActivity", "", "plugin-appbrand-integration_release"})
public final class j
{
  public static final j hRc;

  static
  {
    AppMethodBeat.i(134683);
    hRc = new j();
    AppMethodBeat.o(134683);
  }

  public static final boolean a(o paramo1, o paramo2, AppBrandInitConfigWC paramAppBrandInitConfigWC)
  {
    AppMethodBeat.i(134682);
    a.f.b.j.p(paramo1, "from");
    a.f.b.j.p(paramo2, "to");
    a.f.b.j.p(paramAppBrandInitConfigWC, "config");
    boolean bool;
    if ((paramo1.xy()) && (paramAppBrandInitConfigWC.xy()))
    {
      f.ijT.a((Context)paramo1.atM(), null, paramAppBrandInitConfigWC.appId, paramAppBrandInitConfigWC.hgC, paramAppBrandInitConfigWC.gVs, paramAppBrandInitConfigWC.axy, paramAppBrandInitConfigWC.xx(), paramAppBrandInitConfigWC.hgF, null);
      bool = true;
      AppMethodBeat.o(134682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134682);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.j
 * JD-Core Version:    0.6.2
 */