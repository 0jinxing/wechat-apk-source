package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$4$1
  implements Runnable
{
  j$4$1(j.4 param4, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135516);
    if (j.e(this.kAN.kAJ) != j.d.kBo)
    {
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: current not in room");
      j.a(this.kAN.kAJ, -1L);
      j.o(this.kAN.kAJ);
      AppMethodBeat.o(135516);
    }
    while (true)
    {
      return;
      if ((j.p(this.kAN.kAJ) != null) && (j.e(this.kAN.kAJ) == j.d.kBo))
        j.p(this.kAN.kAJ).a(-10087, this.crd, "call end", j.n(this.kAN.kAJ));
      j.a(this.kAN.kAJ, -1L);
      j.a(this.kAN.kAJ, j.d.kBm);
      j.o(this.kAN.kAJ);
      AppMethodBeat.o(135516);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.4.1
 * JD-Core Version:    0.6.2
 */