package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.f.b.j;
import a.l;
import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalUIAnimationStyle;", "", "()V", "setOpenAnimation", "", "activity", "Landroid/app/Activity;", "config", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfig;", "stat", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "plugin-appbrand-integration_release"})
public final class k
{
  public static final k ikD;

  static
  {
    AppMethodBeat.i(134748);
    ikD = new k();
    AppMethodBeat.o(134748);
  }

  public static final boolean a(Activity paramActivity, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(134747);
    j.p(paramActivity, "activity");
    j.p(paramAppBrandInitConfig, "config");
    j.p(paramAppBrandStatObject, "stat");
    if (!(paramAppBrandInitConfig instanceof AppBrandInitConfigWC))
      AppMethodBeat.o(134747);
    while (true)
    {
      return bool2;
      bool2 = bool1;
      try
      {
        if (f.d((AppBrandInitConfigWC)paramAppBrandInitConfig, paramAppBrandStatObject))
        {
          paramActivity.overridePendingTransition(0, 0);
          bool2 = true;
        }
        AppMethodBeat.o(134747);
      }
      catch (Exception paramActivity)
      {
        while (true)
          bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k
 * JD-Core Version:    0.6.2
 */