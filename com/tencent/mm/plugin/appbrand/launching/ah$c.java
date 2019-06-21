package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.bd;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

final class ah$c
  implements Callable<WxaPkgWrappingInfo>
{
  private final arc iiu;
  private final int iix;

  private ah$c(ah paramah, int paramInt, arc paramarc)
  {
    this.iix = paramInt;
    this.iiu = paramarc;
  }

  final WxaPkgWrappingInfo aHA()
  {
    AppMethodBeat.i(131968);
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    Object localObject = new j();
    ah.c.1 local1 = new ah.c.1(this, this.iiv.har, (j)localObject, localCountDownLatch);
    if (!bd.a(this.iiu.wuP, this.iiv.appId, this.iix, 0, local1))
    {
      localObject = null;
      AppMethodBeat.o(131968);
    }
    while (true)
    {
      return localObject;
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((j)localObject).value;
        AppMethodBeat.o(131968);
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localInterruptedException, "doZstdJob semaphore exp ", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah.c
 * JD-Core Version:    0.6.2
 */