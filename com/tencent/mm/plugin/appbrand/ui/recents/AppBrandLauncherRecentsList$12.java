package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandLauncherRecentsList$12
  implements Runnable
{
  AppBrandLauncherRecentsList$12(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList, m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133344);
    if (!bo.ek(AppBrandLauncherRecentsList.a(this.iMV)))
    {
      int i = AppBrandLauncherRecentsList.a(this.iMV).size();
      AppBrandLauncherRecentsList.a(this.iMV).clear();
      AppBrandLauncherRecentsList.b(this.iMV).au(0, i);
    }
    AppBrandLauncherRecentsList.a(this.iMV).addAll(this.iNd);
    AppBrandLauncherRecentsList.b(this.iMV).at(0, this.iNd.size());
    AppMethodBeat.o(133344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.12
 * JD-Core Version:    0.6.2
 */