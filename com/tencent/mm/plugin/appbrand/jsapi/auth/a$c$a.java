package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onAuthResult"})
final class a$c$a
  implements d
{
  a$c$a(a.c paramc)
  {
  }

  public final void aCB()
  {
    AppMethodBeat.i(134648);
    a.aCA();
    ab.d("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "execute() done, " + this.hBG.hBF);
    a.a(this.hBG.hBA);
    AppMethodBeat.o(134648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a.c.a
 * JD-Core Version:    0.6.2
 */