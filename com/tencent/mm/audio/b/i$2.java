package com.tencent.mm.audio.b;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class i$2
  implements Runnable
{
  i$2(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116519);
    long l = System.currentTimeMillis() - i.j(this.cre);
    ab.i("MicroMsg.SceneVoiceService", "Try Run service runningFlag:" + i.e(this.cre) + " timeWait:" + l + " sending:" + i.g(this.cre) + " recving:" + i.f(this.cre));
    if (i.e(this.cre))
      if (l < 60000L)
        AppMethodBeat.o(116519);
    while (true)
    {
      return;
      ab.e("MicroMsg.SceneVoiceService", "ERR: Try Run service runningFlag:" + i.e(this.cre) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + i.g(this.cre) + " recving:" + i.f(this.cre));
      i.k(this.cre);
      i.b(this.cre);
      i.a(this.cre, 3);
      i.a(this.cre);
      this.cre.cqZ.evE = SystemClock.elapsedRealtime();
      i.l(this.cre).ae(10L, 10L);
      AppMethodBeat.o(116519);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(116520);
    String str = super.toString() + "|run";
    AppMethodBeat.o(116520);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.i.2
 * JD-Core Version:    0.6.2
 */