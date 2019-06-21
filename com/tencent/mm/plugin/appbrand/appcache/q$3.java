package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.platformtools.ab;

final class q$3 extends c
{
  q$3(q paramq)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(129356);
    super.enter();
    ab.i("MicroMsg.LibIncrementalTestCase[incremental]", "FetchNewestLibAndDoIncremental enter");
    aj.dC(true);
    g.RO().eJo.a(1168, new q.3.1(this));
    AppMethodBeat.o(129356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.q.3
 * JD-Core Version:    0.6.2
 */