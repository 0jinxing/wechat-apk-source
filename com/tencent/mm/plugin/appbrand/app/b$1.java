package com.tencent.mm.plugin.appbrand.app;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.mm.plugin.appbrand.task.g;

final class b$1
  implements Runnable
{
  b$1(g paramg, AppBrandPreloadProfiler paramAppBrandPreloadProfiler)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129193);
    Looper.myQueue().addIdleHandler(new b.1.1(this));
    AppMethodBeat.o(129193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.b.1
 * JD-Core Version:    0.6.2
 */