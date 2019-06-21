package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLauncherRecentsList$9
  implements Runnable
{
  AppBrandLauncherRecentsList$9(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133340);
    if ((AppBrandLauncherRecentsList.o(this.iMV).apJ == null) || (AppBrandLauncherRecentsList.o(this.iMV).apJ.getHeight() <= 0) || (AppBrandLauncherRecentsList.d(this.iMV) == null))
      AppMethodBeat.o(133340);
    while (true)
    {
      return;
      try
      {
        AppBrandLauncherRecentsList.d(this.iMV).scrollBy(0, AppBrandLauncherRecentsList.o(this.iMV).apJ.getHeight());
        AppMethodBeat.o(133340);
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        ab.e("MicroMsg.AppBrandLauncherRecentsList", "makeFooterFullyVisible scrollBy e=%s", new Object[] { localIndexOutOfBoundsException });
        AppMethodBeat.o(133340);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.9
 * JD-Core Version:    0.6.2
 */