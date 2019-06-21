package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class e$2
  implements Runnable
{
  e$2(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5390);
    long l = System.currentTimeMillis() - e.f(this.mhj);
    if (e.g(this.mhj))
      if (l < 60000L)
        AppMethodBeat.o(5390);
    while (true)
    {
      return;
      ab.e("MicroMsg.Fav.FavSendService", "klem ERR: Try Run service runningFlag:" + e.g(this.mhj) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + e.g(this.mhj));
      e.a(this.mhj);
      e.h(this.mhj);
      e.i(this.mhj);
      e.j(this.mhj).ae(10L, 10L);
      AppMethodBeat.o(5390);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5391);
    String str = super.toString() + "|run";
    AppMethodBeat.o(5391);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.e.2
 * JD-Core Version:    0.6.2
 */