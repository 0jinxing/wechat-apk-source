package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.luggage.sdk.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.r.m;

final class e$1
  implements Runnable
{
  e$1(e parame, a parama, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102126);
    m.runOnUiThread(new e.1.1(this, AppBrandPerformanceManager.e(this.hXa.xL())));
    AppMethodBeat.o(102126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.e.1
 * JD-Core Version:    0.6.2
 */