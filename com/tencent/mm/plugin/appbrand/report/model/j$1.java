package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import java.util.concurrent.ThreadFactory;

final class j$1
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(132615);
    paramRunnable = d.a(paramRunnable, "AppBrandJsApiInvokeReportWorkerThread", 1);
    if (paramRunnable.isDaemon())
      paramRunnable.setDaemon(false);
    AppMethodBeat.o(132615);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.j.1
 * JD-Core Version:    0.6.2
 */