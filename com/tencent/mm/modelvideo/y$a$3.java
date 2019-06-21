package com.tencent.mm.modelvideo;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class y$a$3
  implements Runnable
{
  y$a$3(y.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50870);
    long l = System.currentTimeMillis() - y.a.l(this.fXQ);
    ab.d("MicroMsg.VideoService", "Try Run service runningFlag:" + y.a.h(this.fXQ) + " timeWait:" + l + " sending:" + y.a.j(this.fXQ) + " recving:" + y.a.i(this.fXQ));
    if (y.a.h(this.fXQ))
      if (l < 60000L)
        AppMethodBeat.o(50870);
    while (true)
    {
      return;
      ab.e("MicroMsg.VideoService", "ERR: Try Run service runningFlag:" + y.a.h(this.fXQ) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + y.a.j(this.fXQ) + " recving:" + y.a.i(this.fXQ));
      y.a.a(this.fXQ, 3);
      y.a.m(this.fXQ);
      y.a.d(this.fXQ);
      y.a.b(this.fXQ);
      y.a.e(this.fXQ);
      y.a.c(this.fXQ);
      this.fXQ.cqZ.evE = SystemClock.elapsedRealtime();
      y.a.n(this.fXQ).ae(10L, 10L);
      AppMethodBeat.o(50870);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(50871);
    String str = super.toString() + "|run";
    AppMethodBeat.o(50871);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.y.a.3
 * JD-Core Version:    0.6.2
 */