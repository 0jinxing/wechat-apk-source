package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class s$1
  implements Runnable
{
  s$1(s params)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43421);
    ab.v("MicroMsg.WalletOfflineMsgManager", "DO NetSceneOfflineAckMsg");
    g.RQ();
    g.RO().eJo.a(new b(this.oYN), 0);
    AppMethodBeat.o(43421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.s.1
 * JD-Core Version:    0.6.2
 */