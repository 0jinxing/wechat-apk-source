package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.e.a;

final class i$c
  implements i.a, a
{
  private boolean gOp;

  private i$c(i parami)
  {
    AppMethodBeat.i(86666);
    this.gOb.keep(this);
    this.gOp = false;
    AppMethodBeat.o(86666);
  }

  public final void dead()
  {
    this.gOp = true;
  }

  public final void done()
  {
    AppMethodBeat.i(86667);
    i locali;
    if (!this.gOp)
    {
      locali = this.gOb;
      if (!locali.mFinished)
        if (locali.eMP)
        {
          ab.e("MicroMsg.AppBrandRuntime", "initRuntime, mInitialized TRUE !!!  go check callee %s", new Object[] { bo.l(new Throwable()) });
          AppMethodBeat.o(86667);
        }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandRuntime", "initRuntime %s", new Object[] { locali.mAppId });
      new i.11(locali).run();
      AppMethodBeat.o(86667);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.c
 * JD-Core Version:    0.6.2
 */