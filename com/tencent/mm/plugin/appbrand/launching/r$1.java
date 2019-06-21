package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

final class r$1 extends n.c
{
  r$1(r paramr, CountDownLatch paramCountDownLatch, String paramString, int paramInt)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(131844);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "codeLib url result errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(parama.errCode), parama.aIm });
    AppMethodBeat.o(131844);
  }

  public final void aHm()
  {
    AppMethodBeat.i(131841);
    r.a(this.ihs, 3);
    AppMethodBeat.o(131841);
  }

  public final void aHn()
  {
    AppMethodBeat.i(131842);
    r.a(this.ihs, 4);
    AppMethodBeat.o(131842);
  }

  public final void aHo()
  {
    AppMethodBeat.i(131843);
    r.a(this.ihs, 2);
    AppMethodBeat.o(131843);
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131845);
    if (paramWxaPkgWrappingInfo != null)
      ((j)this.ihs.ihp.get(paramWxaPkgWrappingInfo.cvZ)).value = paramWxaPkgWrappingInfo;
    this.val$latch.countDown();
    if (paramWxaPkgWrappingInfo != null);
    for (paramWxaPkgWrappingInfo = paramWxaPkgWrappingInfo.toString(); ; paramWxaPkgWrappingInfo = "null")
    {
      ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", "codeLib pkgInfo :%s", new Object[] { paramWxaPkgWrappingInfo });
      g.dOW().i(new r.1.1(this)).dMk();
      AppMethodBeat.o(131845);
      return;
    }
  }

  public final void c(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131846);
    if (paramWxaPkgWrappingInfo != null)
    {
      r.oX(0);
      AppMethodBeat.o(131846);
    }
    while (true)
    {
      return;
      r.oX(1);
      AppMethodBeat.o(131846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.r.1
 * JD-Core Version:    0.6.2
 */