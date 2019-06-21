package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherRecentsList$1
  implements Runnable
{
  AppBrandLauncherRecentsList$1(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133329);
    int i = AppBrandLauncherRecentsList.a(this.iMV).size();
    if (i > 0)
    {
      AppBrandLauncherRecentsList.a(this.iMV).clear();
      AppBrandLauncherRecentsList.b(this.iMV).au(0, i);
    }
    AppBrandLauncherRecentsList.c(this.iMV);
    AppMethodBeat.o(133329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.1
 * JD-Core Version:    0.6.2
 */