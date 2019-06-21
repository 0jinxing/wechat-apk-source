package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import java.util.concurrent.CountDownLatch;

final class q$3 extends n.c
{
  q$3(q paramq, j paramj, CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(131832);
    q.a(this.ihl);
    AppMethodBeat.o(131832);
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131833);
    this.ihm.value = paramWxaPkgWrappingInfo;
    this.fuC.countDown();
    AppMethodBeat.o(131833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.q.3
 * JD-Core Version:    0.6.2
 */