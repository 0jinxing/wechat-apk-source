package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.a.s.g;
import com.tencent.mm.plugin.offline.g;
import com.tencent.mm.plugin.wallet_core.ui.q.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$15
  implements q.a
{
  c$15(c paramc, s.g paramg)
  {
  }

  public final void bXx()
  {
    AppMethodBeat.i(43485);
    if (this.oZs.oZn != null)
      this.oZs.oZn.e(0, this.oZt.id, "", this.oZt.cBT);
    g.cM(this.oZt.cBT, g.oXg);
    ab.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do cancel pay");
    AppMethodBeat.o(43485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c.15
 * JD-Core Version:    0.6.2
 */