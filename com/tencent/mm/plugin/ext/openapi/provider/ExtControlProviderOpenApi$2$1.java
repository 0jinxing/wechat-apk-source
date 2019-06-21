package com.tencent.mm.plugin.ext.openapi.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.g.a.fe.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtControlProviderOpenApi$2$1
  implements Runnable
{
  ExtControlProviderOpenApi$2$1(ExtControlProviderOpenApi.2 param2, fe paramfe)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20312);
    ab.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi run");
    if ((this.lPS == null) || (this.lPS.cyB == null) || (this.lPS.cyB.cyD == 0))
      AppMethodBeat.o(20312);
    while (true)
    {
      return;
      ab.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi errcode = %s,errmsg = %s", new Object[] { Integer.valueOf(this.lPS.cyB.cyE), this.lPS.cyB.cyF });
      this.lPT.cC(Integer.valueOf(this.lPS.cyB.cyE));
      AppMethodBeat.o(20312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.2.1
 * JD-Core Version:    0.6.2
 */