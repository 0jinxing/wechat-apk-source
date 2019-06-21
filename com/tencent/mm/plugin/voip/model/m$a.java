package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class m$a
  implements Runnable
{
  private c nxe = null;
  private com.tencent.mm.audio.b.c nxt = null;

  public m$a(m paramm, c paramc, com.tencent.mm.audio.b.c paramc1)
  {
    this.nxe = paramc;
    this.nxt = paramc1;
  }

  public final void run()
  {
    AppMethodBeat.i(4439);
    if (this.nxe != null)
    {
      this.nxe.cIr();
      this.nxe.cIo();
      this.nxe = null;
    }
    ab.i("MicroMsg.Voip.VoipDeviceHandler", "do stopRecord");
    if (this.nxt != null)
    {
      this.nxt.EB();
      this.nxt = null;
      ab.i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord");
    }
    AppMethodBeat.o(4439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.m.a
 * JD-Core Version:    0.6.2
 */