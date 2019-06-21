package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.sdk.platformtools.al;

final class AppBrandLauncherRecentsList$14
  implements Runnable
{
  AppBrandLauncherRecentsList$14(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList, m paramm, c.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133347);
    if ((AppBrandLauncherRecentsList.d(this.iMV) == null) || (!AppBrandLauncherRecentsList.d(this.iMV).isAttachedToWindow()))
      AppMethodBeat.o(133347);
    while (true)
    {
      return;
      if (AppBrandLauncherRecentsList.d(this.iMV).jz())
      {
        AppBrandLauncherRecentsList.e(this.iMV).sendMessage(AppBrandLauncherRecentsList.e(this.iMV).obtainMessage(2, this));
        AppMethodBeat.o(133347);
      }
      else
      {
        AppBrandLauncherRecentsList.a(this.iMV).clear();
        AppBrandLauncherRecentsList.a(this.iMV).addAll(this.iNd);
        al.Ma(-8);
        this.iNg.a(AppBrandLauncherRecentsList.f(this.iMV));
        AppMethodBeat.o(133347);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.14
 * JD-Core Version:    0.6.2
 */