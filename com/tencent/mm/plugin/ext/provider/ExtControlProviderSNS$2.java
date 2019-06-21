package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.ad;

final class ExtControlProviderSNS$2
  implements Runnable
{
  ExtControlProviderSNS$2(ExtControlProviderSNS paramExtControlProviderSNS, ad paramad, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20379);
    fo localfo = new fo();
    localfo.czp.type = 1;
    localfo.czp.username = this.ejm.field_username;
    localfo.czp.czq = ExtControlProviderSNS.a(this.lQE);
    localfo.czp.czr = ExtControlProviderSNS.b(this.lQE);
    localfo.czp.czs = ExtControlProviderSNS.c(this.lQE);
    localfo.czp.czt = new ExtControlProviderSNS.2.1(this);
    a.xxA.m(localfo);
    AppMethodBeat.o(20379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS.2
 * JD-Core Version:    0.6.2
 */