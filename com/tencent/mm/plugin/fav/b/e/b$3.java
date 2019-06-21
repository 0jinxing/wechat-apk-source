package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5352);
    long l = System.currentTimeMillis() - b.d(this.mhc);
    if (b.e(this.mhc))
      if (l < 60000L)
        AppMethodBeat.o(5352);
    while (true)
    {
      return;
      ab.e("MicroMsg.Fav.FavCheckCdnService", "klem ERR: Try Run service runningFlag:" + b.e(this.mhc) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + b.e(this.mhc));
      b.a(this.mhc);
      b.f(this.mhc);
      b.g(this.mhc).ae(10L, 10L);
      AppMethodBeat.o(5352);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(5353);
    String str = super.toString() + "|run";
    AppMethodBeat.o(5353);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.b.3
 * JD-Core Version:    0.6.2
 */