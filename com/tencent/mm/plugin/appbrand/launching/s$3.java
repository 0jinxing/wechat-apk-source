package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class s$3 extends n.c
{
  s$3(s params, j paramj, CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(131871);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", "mainModule without lib url result errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(parama.errCode), parama.aIm });
    AppMethodBeat.o(131871);
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131872);
    if (paramWxaPkgWrappingInfo != null)
      this.ihk.value = paramWxaPkgWrappingInfo;
    this.val$latch.countDown();
    if (paramWxaPkgWrappingInfo != null);
    for (paramWxaPkgWrappingInfo = paramWxaPkgWrappingInfo.toString(); ; paramWxaPkgWrappingInfo = "null")
    {
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", "mainModule without codeLib pkgInfo :%s", new Object[] { paramWxaPkgWrappingInfo });
      AppMethodBeat.o(131872);
      return;
    }
  }

  public final void c(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131873);
    if (paramWxaPkgWrappingInfo != null)
    {
      s.oY(4);
      AppMethodBeat.o(131873);
    }
    while (true)
    {
      return;
      s.oY(5);
      AppMethodBeat.o(131873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s.3
 * JD-Core Version:    0.6.2
 */