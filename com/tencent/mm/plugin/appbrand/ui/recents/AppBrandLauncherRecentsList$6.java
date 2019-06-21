package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandLauncherRecentsList$6
  implements ViewTreeObserver.OnPreDrawListener
{
  AppBrandLauncherRecentsList$6(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList, Runnable paramRunnable)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(133336);
    AppBrandLauncherRecentsList.r(this.iMV).getViewTreeObserver().removeOnPreDrawListener(this);
    this.iMX.run();
    AppMethodBeat.o(133336);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.6
 * JD-Core Version:    0.6.2
 */