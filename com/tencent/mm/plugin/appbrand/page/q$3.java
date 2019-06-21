package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.e;

final class q$3
  implements f.e
{
  q$3(q paramq, n paramn, Runnable paramRunnable)
  {
  }

  public final void onReady()
  {
    AppMethodBeat.i(87079);
    this.irU.getCurrentPageView().b(this);
    this.irR.removeCallbacks(this.irV);
    this.irR.post(this.irV);
    this.irR.aJq();
    AppMethodBeat.o(87079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.3
 * JD-Core Version:    0.6.2
 */