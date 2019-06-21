package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

final class AppBrandLauncherRecentsList$5
  implements Runnable
{
  AppBrandLauncherRecentsList$5(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133335);
    if (AppBrandLauncherRecentsList.d(this.iMV).computeVerticalScrollOffset() == 0)
      AppBrandLauncherRecentsList.d(this.iMV).scrollBy(0, AppBrandLauncherRecentsList.r(this.iMV).getTop());
    AppMethodBeat.o(133335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.5
 * JD-Core Version:    0.6.2
 */