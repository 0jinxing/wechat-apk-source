package com.tencent.mm.plugin.offline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

final class h$1$1
  implements Runnable
{
  h$1$1(h.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43324);
    ab.d("MicroMsg.OfflineProcess", "tofutest do callback");
    this.oXp.oXo.a(this.oXp.hwd, 0, h.b(this.oXp.oXo));
    this.oXp.Agm.cNM();
    AppMethodBeat.o(43324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.h.1.1
 * JD-Core Version:    0.6.2
 */