package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.pluginsdk.d.a.b;

final class ExtControlProviderSNS$2$1
  implements bk.a
{
  ExtControlProviderSNS$2$1(ExtControlProviderSNS.2 param2)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(20378);
    this.lQF.jDX.countDown();
    AppMethodBeat.o(20378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS.2.1
 * JD-Core Version:    0.6.2
 */