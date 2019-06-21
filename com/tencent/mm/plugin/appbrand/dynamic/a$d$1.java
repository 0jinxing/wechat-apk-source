package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$d$1
  implements Runnable
{
  a$d$1(a.d paramd, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10649);
    c localc = this.hla;
    ab.i("MicroMsg.DynamicPageViewIPCProxy", "onPause(%s)", new Object[] { localc.eIq });
    localc.hlo = true;
    AppMethodBeat.o(10649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.d.1
 * JD-Core Version:    0.6.2
 */