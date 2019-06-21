package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ab;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.sdk.platformtools.ah;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor;", "", "()V", "matchLaunchScene", "", "config", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "stat", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "scene", "", "shouldInterceptLaunch", "_context", "Landroid/content/Context;", "shouldOverrideRuntimeInitialization", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "container", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeContainerWC;", "plugin-appbrand-integration_release"})
public final class f
{
  public static final f ikt;

  static
  {
    AppMethodBeat.i(134741);
    ikt = new f();
    AppMethodBeat.o(134741);
  }

  public static final o a(AppBrandInitConfigWC paramAppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.l paraml)
  {
    AppMethodBeat.i(134739);
    a.f.b.j.p(paramAppBrandInitConfigWC, "config");
    a.f.b.j.p(paraml, "container");
    AppBrandStatObject localAppBrandStatObject = paramAppBrandInitConfigWC.xx();
    a.f.b.j.o(localAppBrandStatObject, "config.statObject");
    if (d(paramAppBrandInitConfigWC, localAppBrandStatObject))
    {
      paramAppBrandInitConfigWC = (o)new j(paraml.getContext(), (ab)paraml);
      AppMethodBeat.o(134739);
    }
    while (true)
    {
      return paramAppBrandInitConfigWC;
      paramAppBrandInitConfigWC = null;
      AppMethodBeat.o(134739);
    }
  }

  public static final boolean c(Context paramContext, AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(134738);
    a.f.b.j.p(paramAppBrandInitConfigWC, "config");
    a.f.b.j.p(paramAppBrandStatObject, "stat");
    Context localContext;
    if (d(paramAppBrandInitConfigWC, paramAppBrandStatObject))
    {
      h.DN(paramAppBrandInitConfigWC.appId);
      localContext = paramContext;
      if (paramContext == null)
        localContext = ah.getContext();
      paramContext = new Intent();
      paramContext.setClass(localContext, AppBrandPluginUI.class);
      if (!(localContext instanceof Activity))
        paramContext.addFlags(268435456);
      paramContext.putExtra("key_appbrand_init_config", (Parcelable)paramAppBrandInitConfigWC);
      paramContext.putExtra("key_appbrand_stat_object", (Parcelable)paramAppBrandStatObject);
      localContext.startActivity(paramContext);
      if ((localContext instanceof Activity))
        break label145;
    }
    label145: for (paramContext = null; ; paramContext = localContext)
    {
      paramContext = (Activity)paramContext;
      if (paramContext != null)
        paramContext.overridePendingTransition(0, 0);
      boolean bool = true;
      AppMethodBeat.o(134738);
      while (true)
      {
        return bool;
        AppMethodBeat.o(134738);
        bool = false;
      }
    }
  }

  public static final boolean d(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(134740);
    a.f.b.j.p(paramAppBrandInitConfigWC, "config");
    a.f.b.j.p(paramAppBrandStatObject, "stat");
    boolean bool;
    if (1111 == paramAppBrandStatObject.scene)
    {
      bool = true;
      AppMethodBeat.o(134740);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134740);
    }
  }

  public static final boolean pf(int paramInt)
  {
    if (1111 == paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f
 * JD-Core Version:    0.6.2
 */