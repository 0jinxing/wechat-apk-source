package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$3
  implements Runnable
{
  i$3(i parami, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86653);
    if ((!this.gOb.eMP) || (this.gOb.mFinished))
    {
      this.gOb.gNz.f(this.gOb);
      AppMethodBeat.o(86653);
    }
    while (true)
    {
      return;
      this.gOb.gNz.a(this.gOb, this.gOc);
      AppMethodBeat.o(86653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.3
 * JD-Core Version:    0.6.2
 */