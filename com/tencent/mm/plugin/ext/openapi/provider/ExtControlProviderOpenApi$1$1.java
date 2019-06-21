package com.tencent.mm.plugin.ext.openapi.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.g.a.fh.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtControlProviderOpenApi$1$1
  implements Runnable
{
  ExtControlProviderOpenApi$1$1(ExtControlProviderOpenApi.1 param1, fh paramfh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20309);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList run");
    if ((this.lPQ == null) || (this.lPQ.cyX == null) || (this.lPQ.cyX.cyD == 0))
      AppMethodBeat.o(20309);
    while (true)
    {
      return;
      ab.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList return cursor");
      this.lPR.cC(this.lPQ.cyX.cyZ);
      AppMethodBeat.o(20309);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.1.1
 * JD-Core Version:    0.6.2
 */