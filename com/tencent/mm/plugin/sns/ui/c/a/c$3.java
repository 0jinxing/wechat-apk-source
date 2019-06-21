package com.tencent.mm.plugin.sns.ui.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j;

final class c$3
  implements Runnable
{
  c$3(c paramc, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40096);
    j.cql().f("adId", this.rHc, "adxml", 0);
    AppMethodBeat.o(40096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.c.3
 * JD-Core Version:    0.6.2
 */