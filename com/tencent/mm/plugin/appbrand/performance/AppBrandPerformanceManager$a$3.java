package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;

final class AppBrandPerformanceManager$a$3 extends g.c
{
  AppBrandPerformanceManager$a$3(AppBrandPerformanceManager.a parama)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(102217);
    super.a(paramd);
    paramd = this.ivM;
    paramd.mPaused = true;
    if ((AppBrandPerformanceManager.a.aKj()) && (paramd.ivI != null))
      paramd.ivI.stop();
    AppMethodBeat.o(102217);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(102216);
    super.onDestroy();
    this.ivM.stop();
    AppMethodBeat.o(102216);
  }

  public final void onResume()
  {
    AppMethodBeat.i(102218);
    super.onResume();
    AppBrandPerformanceManager.a locala = this.ivM;
    locala.mPaused = false;
    if ((AppBrandPerformanceManager.a.aKj()) && (locala.ivI != null))
      locala.ivI.start();
    AppMethodBeat.o(102218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager.a.3
 * JD-Core Version:    0.6.2
 */