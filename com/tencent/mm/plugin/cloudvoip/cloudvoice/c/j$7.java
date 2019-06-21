package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$7
  implements Runnable
{
  j$7(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135523);
    if ((j.e(this.kAJ) == j.d.kBm) && (!j.a(this.kAJ)))
    {
      ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: still not join room in %d ms. directly release", new Object[] { Long.valueOf(180000L) });
      j.r(this.kAJ);
    }
    AppMethodBeat.o(135523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.7
 * JD-Core Version:    0.6.2
 */