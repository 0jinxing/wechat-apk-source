package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class AppBrandLauncherRecentsList$7
  implements LoadMoreRecyclerView.a
{
  AppBrandLauncherRecentsList$7(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void aMC()
  {
    AppMethodBeat.i(133337);
    e locale = AppBrandLauncherRecentsList.o(this.iMV);
    int i;
    if ((locale.iNB != null) && (locale.iNB.isShown()))
    {
      i = 1;
      if (i != 0)
        break label47;
      AppMethodBeat.o(133337);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label47: AppBrandLauncherRecentsList.s(this.iMV);
      AppMethodBeat.o(133337);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.7
 * JD-Core Version:    0.6.2
 */