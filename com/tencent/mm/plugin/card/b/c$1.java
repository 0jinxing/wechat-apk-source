package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(87637);
    ab.i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
    this.kaO.Gk(this.kaO.kaE);
    this.kaO.bal();
    AppMethodBeat.o(87637);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.c.1
 * JD-Core Version:    0.6.2
 */