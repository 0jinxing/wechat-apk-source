package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

final class ah$a$1 extends t
{
  ah$a$1(ah.a parama, int paramInt, j paramj, CountDownLatch paramCountDownLatch)
  {
    super(paramInt);
  }

  final String aHr()
  {
    AppMethodBeat.i(131957);
    String str = String.format(Locale.US, "Incremental %d|%d", new Object[] { Integer.valueOf(ah.a.a(this.iiw)), Integer.valueOf(ah.a.b(this.iiw)) });
    AppMethodBeat.o(131957);
    return str;
  }

  final void d(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131958);
    this.hom.value = paramWxaPkgWrappingInfo;
    this.fuC.countDown();
    AppMethodBeat.o(131958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah.a.1
 * JD-Core Version:    0.6.2
 */