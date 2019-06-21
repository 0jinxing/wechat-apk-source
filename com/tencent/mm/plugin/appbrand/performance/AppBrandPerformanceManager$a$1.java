package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandPerformanceManager$a$1
  implements Runnable
{
  AppBrandPerformanceManager$a$1(AppBrandPerformanceManager.a parama, GetStorageSizeTask paramGetStorageSizeTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102214);
    AppBrandPerformanceManager.a(this.ivM.ivC, 401, bo.ga(this.ivL.size));
    this.ivL.aBW();
    AppMethodBeat.o(102214);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager.a.1
 * JD-Core Version:    0.6.2
 */