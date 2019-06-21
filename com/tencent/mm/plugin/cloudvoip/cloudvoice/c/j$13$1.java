package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class j$13$1
  implements Runnable
{
  j$13$1(j.13 param13)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135532);
    if ((!bo.isNullOrNil(j.d(this.kAX.kAJ))) && (j.e(this.kAX.kAJ) != j.d.kBm))
    {
      j.f(this.kAX.kAJ).reset(j.d(this.kAX.kAJ));
      j.f(this.kAX.kAJ).a(j.d(this.kAX.kAJ), new j.13.1.1(this));
      AppMethodBeat.o(135532);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room now");
      AppMethodBeat.o(135532);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.13.1
 * JD-Core Version:    0.6.2
 */