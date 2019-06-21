package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.concurrent.CountDownLatch;

final class ap$a$2 extends ap.a.a
{
  ap$a$2(ap.a parama, ap.c paramc, ap paramap, j paramj, CountDownLatch paramCountDownLatch)
  {
    super(paramc);
  }

  final void b(m paramm)
  {
    AppMethodBeat.i(59484);
    if (this.gUt != null)
      this.gUt.stopTimer();
    this.gUr.value = paramm;
    this.fuC.countDown();
    AppMethodBeat.o(59484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.a.2
 * JD-Core Version:    0.6.2
 */