package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.performance.c;
import com.tencent.mm.plugin.appbrand.report.g;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.report.quality.b;

final class o$3$1
  implements Runnable
{
  o$3$1(o.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128977);
    if ((!this.gPB.gPz) && (!this.gPB.gPy.mFinished))
    {
      a.aLz();
      b.a(false, this.gPB.gPy.mAppId, this.gPB.fEG, g.aLe());
    }
    o.d(this.gPB.gPy).y(2, System.currentTimeMillis() - this.gPB.fEG);
    c.a(this.gPB.gPy.mAppId, "X5Prepare", this.gPB.fEG, System.currentTimeMillis());
    this.gPB.gPA.wL();
    AppMethodBeat.o(128977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.3.1
 * JD-Core Version:    0.6.2
 */