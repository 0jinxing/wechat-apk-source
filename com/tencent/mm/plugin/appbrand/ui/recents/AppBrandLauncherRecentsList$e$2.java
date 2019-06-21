package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class AppBrandLauncherRecentsList$e$2
  implements Runnable
{
  AppBrandLauncherRecentsList$e$2(AppBrandLauncherRecentsList.e parame, AppBrandRecentTaskInfo paramAppBrandRecentTaskInfo, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133385);
    if (!this.iNx.had)
    {
      i = ((s)f.E(s.class)).aG(this.iNx.csl, this.iNx.gVs);
      if (i == -2)
      {
        this.iNw.iMV.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133384);
            h.a(AppBrandLauncherRecentsList.e.2.this.iNw.iMV.getActivity(), AppBrandLauncherRecentsList.e.2.this.iNw.iMV.getResources().getString(2131296596, new Object[] { Integer.valueOf(AppBrandLauncherRecentsList.A(AppBrandLauncherRecentsList.e.2.this.iNw.iMV)) }), "", AppBrandLauncherRecentsList.e.2.this.iNw.iMV.getResources().getString(2131296994), false, null);
            AppMethodBeat.o(133384);
          }
        });
        AppMethodBeat.o(133385);
      }
      while (true)
      {
        return;
        if (i != -1)
          break;
        ab.e("MicroMsg.AppBrandLauncherRecentsList", "addStarApp, username %s, type %d, fatal", new Object[] { this.iNx.csl, Integer.valueOf(this.iNx.gVs) });
        AppMethodBeat.o(133385);
      }
    }
    for (int i = 6; ; i = 7)
    {
      e.a(this.iNx, i, this.iNy, this.iNz);
      AppMethodBeat.o(133385);
      break;
      ((s)f.E(s.class)).j(this.iNx.csl, this.iNx.gVs, true);
      if ((!AppBrandLauncherRecentsList.i(this.iNw.iMV)) && (AppBrandLauncherRecentsList.n(this.iNw.iMV)))
        f.auT().a(this.iNx.csl, this.iNx.gVs, false, 0, 2, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.e.2
 * JD-Core Version:    0.6.2
 */