package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLauncherRecentsList$3$1
  implements Runnable
{
  AppBrandLauncherRecentsList$3$1(AppBrandLauncherRecentsList.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133331);
    try
    {
      AppBrandLauncherRecentsList.b(this.iMW.iMV).aop.notifyChanged();
      AppMethodBeat.o(133331);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        ab.w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged after scroll e=%s", new Object[] { localIllegalStateException });
        AppMethodBeat.o(133331);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.3.1
 * JD-Core Version:    0.6.2
 */