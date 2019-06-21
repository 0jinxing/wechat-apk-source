package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import java.util.ArrayList;

final class AppBrandLauncherRecentsList$19$2
  implements Runnable
{
  AppBrandLauncherRecentsList$19$2(AppBrandLauncherRecentsList.19 param19, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133357);
    if ((AppBrandLauncherRecentsList.d(this.iNj.iMV) == null) || (!AppBrandLauncherRecentsList.d(this.iNj.iMV).isAttachedToWindow()))
      AppMethodBeat.o(133357);
    while (true)
    {
      return;
      if (AppBrandLauncherRecentsList.d(this.iNj.iMV).jz())
      {
        AppBrandLauncherRecentsList.e(this.iNj.iMV).sendMessage(AppBrandLauncherRecentsList.e(this.iNj.iMV).obtainMessage(2, this));
        AppMethodBeat.o(133357);
      }
      else
      {
        AppBrandLauncherRecentsList.a(this.iNj.iMV, this.iMZ);
        AppMethodBeat.o(133357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.19.2
 * JD-Core Version:    0.6.2
 */