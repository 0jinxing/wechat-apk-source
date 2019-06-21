package com.tencent.mm.plugin.appbrand.ui.recents;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SuppressLint({"HandlerLeak"})
final class AppBrandLauncherRecentsList$a extends Handler
{
  public AppBrandLauncherRecentsList$a(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
    super(Looper.getMainLooper());
    AppMethodBeat.i(133360);
    AppMethodBeat.o(133360);
  }

  private void aNn()
  {
    AppMethodBeat.i(133362);
    removeMessages(1);
    removeMessages(2);
    AppMethodBeat.o(133362);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(133361);
    if (paramMessage.what == 1)
    {
      ((Runnable)paramMessage.obj).run();
      removeMessages(2);
      AppMethodBeat.o(133361);
    }
    while (true)
    {
      return;
      if (paramMessage.what == 2)
      {
        ((Runnable)paramMessage.obj).run();
        AppMethodBeat.o(133361);
      }
      else
      {
        super.handleMessage(paramMessage);
        AppMethodBeat.o(133361);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.a
 * JD-Core Version:    0.6.2
 */