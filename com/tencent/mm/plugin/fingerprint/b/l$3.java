package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.soter.a.a.a;

final class l$3
  implements ap.a
{
  l$3(l paraml, c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(41511);
    ab.i("MicroMsg.SoterAuthMgrImp", "timeout: %s", new Object[] { Integer.valueOf(this.ioE) });
    l.b(this.mrY).rp(true);
    AppMethodBeat.o(41511);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.l.3
 * JD-Core Version:    0.6.2
 */