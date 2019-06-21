package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import java.util.concurrent.CountDownLatch;

final class ah$c$1 extends t
{
  ah$c$1(ah.c paramc, int paramInt, j paramj, CountDownLatch paramCountDownLatch)
  {
    super(paramInt);
  }

  final String aHr()
  {
    return "Zstd";
  }

  final void d(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131967);
    this.hom.value = paramWxaPkgWrappingInfo;
    this.fuC.countDown();
    AppMethodBeat.o(131967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah.c.1
 * JD-Core Version:    0.6.2
 */