package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLauncherRecentsList$17
  implements k.a
{
  AppBrandLauncherRecentsList$17(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133354);
    if (("single".equals(paramString)) && ((3 == paramm.hsh) || (2 == paramm.hsh)))
    {
      this.iMV.runOnUiThread(new AppBrandLauncherRecentsList.17.1(this));
      ab.d("MicroMsg.AppBrandLauncherRecentsList", "onHistoryRecordModified");
      AppBrandLauncherRecentsList.a(this.iMV, true, 9223372036854775807L, false);
    }
    AppMethodBeat.o(133354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.17
 * JD-Core Version:    0.6.2
 */