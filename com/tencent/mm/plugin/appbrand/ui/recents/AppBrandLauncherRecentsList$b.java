package com.tencent.mm.plugin.appbrand.ui.recents;

import android.support.v7.widget.RecyclerView.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherRecentsList$b
  implements RecyclerView.f.a
{
  private AppBrandLauncherRecentsList$b(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  final void aNo()
  {
    AppMethodBeat.i(133366);
    AppBrandLauncherRecentsList.h(this.iMV).iOM = true;
    AppMethodBeat.o(133366);
  }

  public final void jT()
  {
    AppMethodBeat.i(133365);
    AppBrandLauncherRecentsList.h(this.iMV).iOM = false;
    AppMethodBeat.o(133365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.b
 * JD-Core Version:    0.6.2
 */