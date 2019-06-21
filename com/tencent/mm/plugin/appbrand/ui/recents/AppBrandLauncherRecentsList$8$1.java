package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Message;
import android.support.v4.view.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import java.util.ArrayList;

final class AppBrandLauncherRecentsList$8$1
  implements Runnable
{
  AppBrandLauncherRecentsList$8$1(AppBrandLauncherRecentsList.8 param8, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133338);
    if ((AppBrandLauncherRecentsList.d(this.iNa.iMV) == null) || (!s.av(AppBrandLauncherRecentsList.d(this.iNa.iMV))))
      AppMethodBeat.o(133338);
    while (true)
    {
      return;
      if (AppBrandLauncherRecentsList.d(this.iNa.iMV).jz())
      {
        AppBrandLauncherRecentsList.e(this.iNa.iMV).obtainMessage(2, this).sendToTarget();
        AppMethodBeat.o(133338);
      }
      else
      {
        AppBrandLauncherRecentsList.a(this.iNa.iMV, this.iMZ);
        AppMethodBeat.o(133338);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.8.1
 * JD-Core Version:    0.6.2
 */