package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;

final class o$2
  implements Runnable
{
  o$2(o paramo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128976);
    AppBrandPerformanceManager.e(this.gPy);
    AppMethodBeat.o(128976);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.2
 * JD-Core Version:    0.6.2
 */