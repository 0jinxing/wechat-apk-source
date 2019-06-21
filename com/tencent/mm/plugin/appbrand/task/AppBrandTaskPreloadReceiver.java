package com.tencent.mm.plugin.appbrand.task;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.b;
import com.tencent.mm.sdk.platformtools.ab;

public class AppBrandTaskPreloadReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(132873);
    long l = SystemClock.elapsedRealtime();
    paramIntent.setExtrasClassLoader(AppBrandPreloadProfiler.class.getClassLoader());
    paramContext = (AppBrandPreloadProfiler)paramIntent.getParcelableExtra("preloadProfiler");
    b.a(g.H(paramIntent), paramContext);
    ab.i("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile] Receiver cost [%d]ms, at [%d]", new Object[] { Long.valueOf(SystemClock.elapsedRealtime() - l), Long.valueOf(l) });
    AppMethodBeat.o(132873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver
 * JD-Core Version:    0.6.2
 */