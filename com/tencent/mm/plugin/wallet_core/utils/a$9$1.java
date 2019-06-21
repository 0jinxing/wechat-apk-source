package com.tencent.mm.plugin.wallet_core.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class a$9$1
  implements com.tencent.mm.ai.f
{
  a$9$1(a.9 param9, com.tencent.mm.vending.g.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47992);
    g.RQ();
    g.RO().eJo.b(1650, this);
    this.tPa.tOT.tOS = null;
    com.tencent.mm.vending.g.f.a(this.bQV, new Object[0]);
    AppMethodBeat.o(47992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.9.1
 * JD-Core Version:    0.6.2
 */