package com.tencent.mm.plugin.sns.ui.item;

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
    AppMethodBeat.i(40137);
    j.cql().f("adId", this.rHc, "adxml", 0);
    AppMethodBeat.o(40137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c.3
 * JD-Core Version:    0.6.2
 */