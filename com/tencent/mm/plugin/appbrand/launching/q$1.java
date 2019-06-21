package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import java.util.concurrent.CountDownLatch;

final class q$1 extends n.c
{
  q$1(q paramq, j paramj, CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(131829);
    q.a(this.ihl);
    AppMethodBeat.o(131829);
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131828);
    this.ihk.value = paramWxaPkgWrappingInfo;
    this.fuC.countDown();
    AppMethodBeat.o(131828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.q.1
 * JD-Core Version:    0.6.2
 */