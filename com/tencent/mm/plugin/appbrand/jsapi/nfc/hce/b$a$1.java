package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$1
  implements Runnable
{
  b$a$1(b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137912);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timer check, timeLimit: %d, hasCommandNotResponded: %b", new Object[] { Integer.valueOf(b.d(this.hSI.hSH)), Boolean.valueOf(b.e(this.hSI.hSH)) });
    b.a(this.hSI.hSH, true);
    b.a(this.hSI.hSH, b.aEy(), true, b.f(this.hSI.hSH));
    AppMethodBeat.o(137912);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.b.a.1
 * JD-Core Version:    0.6.2
 */