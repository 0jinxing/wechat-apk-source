package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.report.e;

final class AppBrandLauncherRecentsList$e$3
  implements Runnable
{
  AppBrandLauncherRecentsList$e$3(AppBrandLauncherRecentsList.e parame, AppBrandRecentTaskInfo paramAppBrandRecentTaskInfo, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133386);
    ((s)f.E(s.class)).j(this.iNx.csl, this.iNx.gVs, true);
    e.a(this.iNx, 7, this.iNy, this.iNz);
    AppMethodBeat.o(133386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.e.3
 * JD-Core Version:    0.6.2
 */