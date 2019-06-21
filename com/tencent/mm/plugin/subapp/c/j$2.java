package com.tencent.mm.plugin.subapp.c;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class j$2
  implements Runnable
{
  j$2(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25308);
    long l = System.currentTimeMillis() - j.j(this.stp);
    ab.d("MicroMsg.VoiceRemindService", "Try Run service runningFlag:" + j.e(this.stp) + " timeWait:" + l + " sending:" + j.g(this.stp) + " recving:" + j.f(this.stp));
    if (j.e(this.stp))
      if (l < 60000L)
        AppMethodBeat.o(25308);
    while (true)
    {
      return;
      ab.e("MicroMsg.VoiceRemindService", "ERR: Try Run service runningFlag:" + j.e(this.stp) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + j.g(this.stp) + " recving:" + j.f(this.stp));
      j.k(this.stp);
      j.b(this.stp);
      j.a(this.stp, 3);
      j.a(this.stp);
      this.stp.cqZ.evE = SystemClock.elapsedRealtime();
      j.l(this.stp).ae(10L, 10L);
      AppMethodBeat.o(25308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.j.2
 * JD-Core Version:    0.6.2
 */