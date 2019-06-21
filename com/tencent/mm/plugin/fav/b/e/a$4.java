package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class a$4
  implements Runnable
{
  a$4(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5327);
    long l = System.currentTimeMillis() - this.mgY.cqW;
    if (this.mgY.running)
      if (l < 300000L)
        AppMethodBeat.o(5327);
    while (true)
    {
      return;
      ab.e("MicroMsg.Fav.FavCdnService", "klem ERR: Try Run service runningFlag:" + this.mgY.running + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + this.mgY.running);
      ab.i("MicroMsg.Fav.FavCdnService", "do run cdn job, wait time %d", new Object[] { Long.valueOf(l) });
      this.mgY.cqU = false;
      this.mgY.running = true;
      this.mgY.mgV = 0;
      this.mgY.cqV = 3;
      this.mgY.cra.ae(100L, 100L);
      AppMethodBeat.o(5327);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5328);
    String str = super.toString() + "|run";
    AppMethodBeat.o(5328);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.a.4
 * JD-Core Version:    0.6.2
 */