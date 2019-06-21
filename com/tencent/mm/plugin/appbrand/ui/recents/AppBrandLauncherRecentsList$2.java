package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

final class AppBrandLauncherRecentsList$2
  implements MessageQueue.IdleHandler
{
  AppBrandLauncherRecentsList$2(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(133330);
    Looper.myQueue().removeIdleHandler(this);
    if ((!AppBrandLauncherRecentsList.p(this.iMV)) && (AppBrandLauncherRecentsList.d(this.iMV) != null));
    try
    {
      AppBrandLauncherRecentsList.d(this.iMV).setLayoutFrozen(true);
      label43: AppMethodBeat.o(133330);
      return false;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label43;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.2
 * JD-Core Version:    0.6.2
 */