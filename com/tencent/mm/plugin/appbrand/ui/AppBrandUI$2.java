package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.l;

final class AppBrandUI$2 extends e
{
  AppBrandUI$2(AppBrandUI paramAppBrandUI, Activity paramActivity)
  {
    super(paramActivity);
  }

  public final void awC()
  {
    AppMethodBeat.i(133118);
    i locali = AppBrandUI.b(this.iIZ).atv();
    if (locali == null)
      AppMethodBeat.o(133118);
    while (true)
    {
      return;
      g.a(locali.mAppId, g.d.gNq);
      AppMethodBeat.o(133118);
    }
  }

  public final void awD()
  {
    AppMethodBeat.i(133119);
    i locali = AppBrandUI.b(this.iIZ).atv();
    if (locali == null)
      AppMethodBeat.o(133119);
    while (true)
    {
      return;
      g.a(locali.mAppId, g.d.gNr);
      AppMethodBeat.o(133119);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandUI.2
 * JD-Core Version:    0.6.2
 */