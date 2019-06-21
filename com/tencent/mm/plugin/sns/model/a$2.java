package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j;

final class a$2
  implements Runnable
{
  a$2(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36062);
    j.cql().f("adId", this.qHy, "adxml", 0);
    AppMethodBeat.o(36062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.2
 * JD-Core Version:    0.6.2
 */