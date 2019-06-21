package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l
  implements o, com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.b, c
{
  private com.tencent.mm.storage.o fwE;
  private com.tencent.mm.storage.p fwF;

  public final com.tencent.mm.storage.o XP()
  {
    return this.fwE;
  }

  public final com.tencent.mm.storage.p XQ()
  {
    return this.fwF;
  }

  public final String Yf()
  {
    AppMethodBeat.i(11416);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "brandicon/";
    AppMethodBeat.o(11416);
    return localObject;
  }

  public final List<String> collectStoragePaths()
  {
    AppMethodBeat.i(11417);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "brandicon/" });
    AppMethodBeat.o(11417);
    return localLinkedList;
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(11418);
    h localh = ((j)g.K(j.class)).bOr();
    paramc = new com.tencent.mm.storage.o(localh);
    this.fwE = paramc;
    localh.a(paramc);
    this.fwF = new com.tencent.mm.storage.p(((j)g.K(j.class)).XR());
    AppMethodBeat.o(11418);
  }

  public final void onAccountRelease()
  {
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(11419);
    a.a(this, c.class).aJ(g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class));
    AppMethodBeat.o(11419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.l
 * JD-Core Version:    0.6.2
 */