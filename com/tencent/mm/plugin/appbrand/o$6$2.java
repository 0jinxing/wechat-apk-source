package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class o$6$2
  implements Runnable
{
  o$6$2(o.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128984);
    ab.i("MicroMsg.AppBrandRuntimeWC", "AppBrandPrepareTask done. runOnUiThread appId = %s, finished[%B]", new Object[] { this.gPD.gPy.mAppId, Boolean.valueOf(this.gPD.gPy.mFinished) });
    if (this.gPD.gPy.mFinished)
      AppMethodBeat.o(128984);
    while (true)
    {
      return;
      j localj = o.h(this.gPD.gPy);
      if (!localj.gOr)
        localj.wL();
      o.d(this.gPD.gPy, this.gPD.gPA);
      o.i(this.gPD.gPy);
      AppMethodBeat.o(128984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.6.2
 * JD-Core Version:    0.6.2
 */