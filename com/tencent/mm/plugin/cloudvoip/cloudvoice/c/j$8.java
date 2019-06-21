package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$8
  implements Runnable
{
  j$8(j paramj, a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135524);
    if (j.e(this.kAJ) != j.d.kBo)
    {
      ab.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
      if (this.kAR != null)
      {
        this.kAR.a(-10086, -1001, "not in room", "");
        AppMethodBeat.o(135524);
      }
    }
    while (true)
    {
      return;
      j.k(this.kAJ).kzm = this.kAS;
      if (this.kAR != null)
        this.kAR.a(0, 0, "ok", "");
      AppMethodBeat.o(135524);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.8
 * JD-Core Version:    0.6.2
 */