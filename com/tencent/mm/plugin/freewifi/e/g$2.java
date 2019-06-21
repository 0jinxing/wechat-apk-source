package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class g$2
  implements a.a
{
  g$2(g paramg)
  {
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(20814);
    g.c(this.mwN);
    AppMethodBeat.o(20814);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(20813);
    ab.i("MicroMsg.FreeWifi.ProtocolOne", "sessionKey=%s, step=%d, desc=Network. ", new Object[] { m.V(this.mwN.intent), Integer.valueOf(m.W(this.mwN.intent)) });
    g.b(this.mwN);
    AppMethodBeat.o(20813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.g.2
 * JD-Core Version:    0.6.2
 */