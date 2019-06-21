package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.h.c;
import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherRecentsList$13
  implements Runnable
{
  AppBrandLauncherRecentsList$13(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList, m paramm1, m paramm2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133346);
    Object localObject = c.a(new n(this.iNe, this.iNf), false);
    AppBrandLauncherRecentsList.a.a(AppBrandLauncherRecentsList.e(this.iMV));
    localObject = new AppBrandLauncherRecentsList.13.1(this, (c.b)localObject);
    AppBrandLauncherRecentsList.e(this.iMV).sendMessage(AppBrandLauncherRecentsList.e(this.iMV).obtainMessage(1, localObject));
    AppMethodBeat.o(133346);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.13
 * JD-Core Version:    0.6.2
 */