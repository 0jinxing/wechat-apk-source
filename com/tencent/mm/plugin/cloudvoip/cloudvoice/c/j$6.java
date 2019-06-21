package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$6
  implements Runnable
{
  j$6(j paramj, j.a parama, a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135522);
    int i = j.a(this.kAJ, this.kAQ);
    if (i == -9999)
    {
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: pending exit. waiting for next time");
      j.b(this.kAJ, this.kAR);
      AppMethodBeat.o(135522);
    }
    while (true)
    {
      return;
      if (this.kAR != null)
      {
        if (i == 0)
        {
          this.kAR.a(0, 0, "", "");
          AppMethodBeat.o(135522);
        }
        else
        {
          this.kAR.a(-10086, -17, "exit failed", "");
        }
      }
      else
        AppMethodBeat.o(135522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.6
 * JD-Core Version:    0.6.2
 */