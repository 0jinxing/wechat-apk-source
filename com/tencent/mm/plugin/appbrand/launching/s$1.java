package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

final class s$1 extends n.c
{
  s$1(s params, CountDownLatch paramCountDownLatch, String paramString, int paramInt)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(131866);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", "codeLib url result errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(parama.errCode), parama.aIm });
    AppMethodBeat.o(131866);
  }

  public final void aHm()
  {
    AppMethodBeat.i(131863);
    s.a(this.ihv, 3);
    AppMethodBeat.o(131863);
  }

  public final void aHn()
  {
    AppMethodBeat.i(131864);
    s.a(this.ihv, 4);
    AppMethodBeat.o(131864);
  }

  public final void aHo()
  {
    AppMethodBeat.i(131865);
    s.a(this.ihv, 2);
    AppMethodBeat.o(131865);
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131867);
    if (paramWxaPkgWrappingInfo != null)
      ((j)this.ihv.ihp.get(paramWxaPkgWrappingInfo.cvZ)).value = paramWxaPkgWrappingInfo;
    this.val$latch.countDown();
    if (paramWxaPkgWrappingInfo != null);
    for (paramWxaPkgWrappingInfo = paramWxaPkgWrappingInfo.toString(); ; paramWxaPkgWrappingInfo = "null")
    {
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", "codeLib pkgInfo :%s", new Object[] { paramWxaPkgWrappingInfo });
      g.dOW().i(new a()
      {
      }).dMk();
      AppMethodBeat.o(131867);
      return;
    }
  }

  public final void c(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131868);
    if (paramWxaPkgWrappingInfo != null)
    {
      s.oY(0);
      AppMethodBeat.o(131868);
    }
    while (true)
    {
      return;
      s.oY(1);
      AppMethodBeat.o(131868);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s.1
 * JD-Core Version:    0.6.2
 */