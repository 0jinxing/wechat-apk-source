package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLauncherRecentsList$18
  implements k.a
{
  AppBrandLauncherRecentsList$18(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133355);
    ab.d("MicroMsg.AppBrandLauncherRecentsList", "onContactUpdate %s", new Object[] { paramString });
    AppBrandLauncherRecentsList.a(this.iMV, false, -1L, false);
    AppMethodBeat.o(133355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.18
 * JD-Core Version:    0.6.2
 */