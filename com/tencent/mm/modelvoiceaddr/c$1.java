package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements Runnable
{
  c$1(c paramc, h.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116672);
    ab.i("MicroMsg.NetSceneNewVoiceInput", "real doLastScene voiceId:%s, voiceFileMarkEnd:%s,hashCode:%s", new Object[] { this.gaH.gbv, Integer.valueOf(this.gaH.gby), Integer.valueOf(this.gaI.hashCode()) });
    g.Rg().a(this.gaI, 0);
    AppMethodBeat.o(116672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.c.1
 * JD-Core Version:    0.6.2
 */