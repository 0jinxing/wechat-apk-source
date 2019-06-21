package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$9
  implements Runnable
{
  j$9(j paramj, a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135525);
    if (j.e(this.kAJ) != j.d.kBo)
    {
      ab.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
      if (this.kAR != null)
      {
        this.kAR.a(-10086, -1001, "not in room", "");
        AppMethodBeat.o(135525);
      }
    }
    while (true)
    {
      return;
      c localc = j.k(this.kAJ);
      boolean bool = this.kAS;
      int i;
      if (localc.kzb != null)
      {
        localc.kzb.bs(bool);
        i = 1;
      }
      while (true)
        if (this.kAR != null)
        {
          if (i != 0)
          {
            this.kAR.a(0, 0, "ok", "");
            AppMethodBeat.o(135525);
            break;
            i = 0;
            continue;
          }
          this.kAR.a(-10086, -15, "set mute failed", "");
        }
      AppMethodBeat.o(135525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.9
 * JD-Core Version:    0.6.2
 */