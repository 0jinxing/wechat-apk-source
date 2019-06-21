package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class d$2
  implements Runnable
{
  d$2(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5374);
    long l = System.currentTimeMillis() - d.f(this.mhh);
    if (d.g(this.mhh))
      if (l < 60000L)
        AppMethodBeat.o(5374);
    while (true)
    {
      return;
      ab.e("MicroMsg.Fav.FavModService", "klem ERR: Try Run service runningFlag:" + d.g(this.mhh) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + d.g(this.mhh));
      d.a(this.mhh);
      d.h(this.mhh);
      d.i(this.mhh);
      d.j(this.mhh).ae(10L, 10L);
      AppMethodBeat.o(5374);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5375);
    String str = super.toString() + "|run";
    AppMethodBeat.o(5375);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.d.2
 * JD-Core Version:    0.6.2
 */