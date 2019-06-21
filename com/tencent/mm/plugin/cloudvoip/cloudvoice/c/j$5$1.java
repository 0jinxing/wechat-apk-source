package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class j$5$1
  implements Runnable
{
  j$5$1(j.5 param5, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135520);
    if (j.e(this.kAP.kAJ) != j.d.kBo)
    {
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: onSpeakerListChanged but not in room!");
      AppMethodBeat.o(135520);
    }
    while (true)
    {
      return;
      if (j.q(this.kAP.kAJ) != null)
        j.q(this.kAP.kAJ).a(0, 0, "on talklist change", this.kAO);
      AppMethodBeat.o(135520);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.5.1
 * JD-Core Version:    0.6.2
 */