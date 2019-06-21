package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.ui.base.l;

public final class f extends a
{
  public f()
  {
    super(o.imS.ordinal());
    AppMethodBeat.i(132208);
    AppMethodBeat.o(132208);
  }

  public final void a(Context paramContext, u paramu, l paraml, String paramString)
  {
    AppMethodBeat.i(132209);
    paramu = (AppBrandSysConfigWC)paramu.aa(AppBrandSysConfigWC.class);
    if (paramu.hhd.gVt == 1)
      if (!paramu.bQq)
        break label58;
    label58: for (paramContext = paramContext.getString(2131296738); ; paramContext = paramContext.getString(2131296745))
    {
      paraml.e(o.imS.ordinal(), paramContext);
      AppMethodBeat.o(132209);
      return;
    }
  }

  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132210);
    int i;
    if (!((AppBrandSysConfigWC)paramu.aa(AppBrandSysConfigWC.class)).bQq)
    {
      i = 1;
      if (i == 0)
        break label54;
      AppBrandPerformanceManager.Dm(paramString);
      Toast.makeText(paramContext, 2131296746, 0).show();
      AppMethodBeat.o(132210);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label54: AppBrandPerformanceManager.Dn(paramString);
      Toast.makeText(paramContext, 2131296739, 0).show();
      AppMethodBeat.o(132210);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.f
 * JD-Core Version:    0.6.2
 */