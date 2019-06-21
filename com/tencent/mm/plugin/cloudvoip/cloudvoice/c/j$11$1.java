package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$11$1
  implements Runnable
{
  j$11$1(j.11 param11)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135527);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: hy: phone broken. exit room if in room");
    j.a(this.kAT.kAJ, j.a.kBh);
    AppMethodBeat.o(135527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.11.1
 * JD-Core Version:    0.6.2
 */