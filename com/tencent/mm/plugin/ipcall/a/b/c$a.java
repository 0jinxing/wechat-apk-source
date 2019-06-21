package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$a
  implements Runnable
{
  private com.tencent.mm.audio.b.c nxt = null;

  public c$a(c paramc, com.tencent.mm.audio.b.c paramc1)
  {
    this.nxt = paramc1;
  }

  public final void run()
  {
    AppMethodBeat.i(21814);
    ab.d("MicroMsg.IPCallRecorder", "do stopRecord");
    if (this.nxt != null)
    {
      this.nxt.EB();
      this.nxt = null;
      c localc = this.nxs;
      localc.nxo = 92;
      localc.nxp = true;
      localc.nxq = 0;
    }
    AppMethodBeat.o(21814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b.c.a
 * JD-Core Version:    0.6.2
 */