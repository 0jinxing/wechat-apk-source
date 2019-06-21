package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j;

final class a$4
  implements Runnable
{
  a$4(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36064);
    j.cql().f("adId", this.qHA, "adxml", 1);
    AppMethodBeat.o(36064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.4
 * JD-Core Version:    0.6.2
 */