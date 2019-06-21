package com.tencent.mm.at;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class i$4
  implements Runnable
{
  i$4(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78287);
    long l = System.currentTimeMillis() - i.g(this.fEQ);
    if (i.h(this.fEQ))
      if (l < 60000L)
        AppMethodBeat.o(78287);
    while (true)
    {
      return;
      ab.e("MicroMsg.ImgService", "ERR: Try Run service runningFlag:" + i.h(this.fEQ) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + i.h(this.fEQ));
      ab.i("MicroMsg.ImgService", "run from run");
      i.i(this.fEQ);
      i.j(this.fEQ);
      this.fEQ.cqZ.evE = SystemClock.elapsedRealtime();
      i.k(this.fEQ).ae(10L, 10L);
      AppMethodBeat.o(78287);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(78288);
    String str = super.toString() + "|run";
    AppMethodBeat.o(78288);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.i.4
 * JD-Core Version:    0.6.2
 */