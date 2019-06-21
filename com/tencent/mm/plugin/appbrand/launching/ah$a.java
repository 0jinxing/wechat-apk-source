package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.p;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

final class ah$a
  implements Callable<WxaPkgWrappingInfo>
{
  private final int iis;
  private final int iit;
  private final arc iiu;

  private ah$a(ah paramah, int paramInt1, int paramInt2, arc paramarc)
  {
    this.iis = paramInt1;
    this.iit = paramInt2;
    this.iiu = paramarc;
  }

  private WxaPkgWrappingInfo aHz()
  {
    AppMethodBeat.i(131959);
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    Object localObject = new j();
    ah.a.1 local1 = new ah.a.1(this, this.iiv.har, (j)localObject, localCountDownLatch);
    if (!p.a(this.iiv.appId, this.iis, this.iit, this.iiu.cDL, local1))
    {
      localObject = null;
      AppMethodBeat.o(131959);
    }
    while (true)
    {
      return localObject;
      try
      {
        localCountDownLatch.await();
        localObject = (WxaPkgWrappingInfo)((j)localObject).value;
        AppMethodBeat.o(131959);
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepCheckAppPkg", localInterruptedException, "downloadIncremental semaphore exp ", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ah.a
 * JD-Core Version:    0.6.2
 */