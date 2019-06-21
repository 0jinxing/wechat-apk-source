package com.tencent.mm.plugin.appbrand;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$8
  implements Runnable
{
  k$8(k paramk, i parami1, i parami2, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86717);
    boolean bool = this.gOH.g(this.gON);
    if (this.gOO != null)
      this.gOO.a(this.gON.yf(), null);
    this.gOP.run();
    if ((bool) && (this.gOO != null) && (this.gOH.gOF))
      this.gOO.atl();
    if (this.gOO == null);
    for (String str = "null"; ; str = this.gOO.mAppId)
    {
      d.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", new Object[] { Boolean.valueOf(bool), str, Boolean.valueOf(this.gOH.gOF) });
      AppMethodBeat.o(86717);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.8
 * JD-Core Version:    0.6.2
 */