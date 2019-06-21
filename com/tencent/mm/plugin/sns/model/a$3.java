package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j;
import com.tencent.mm.protocal.protobuf.TimeLineObject;

final class a$3
  implements Runnable
{
  a$3(TimeLineObject paramTimeLineObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36063);
    j.cql().f("adId", this.qHz.rCK, "adxml", 0);
    AppMethodBeat.o(36063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.3
 * JD-Core Version:    0.6.2
 */