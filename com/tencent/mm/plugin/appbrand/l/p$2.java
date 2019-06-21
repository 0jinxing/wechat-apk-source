package com.tencent.mm.plugin.appbrand.l;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class p$2
  implements Runnable
{
  public p$2(p paramp, p.c paramc, p.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(108269);
    ab.i("MicroMsg.LocalServiceMgr", "start reslove " + this.ipu.ipz);
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    NsdServiceInfo localNsdServiceInfo = new NsdServiceInfo();
    localNsdServiceInfo.setServiceName(this.ipu.ipz);
    localNsdServiceInfo.setServiceType(this.ipu.ipA);
    p.aIO().resolveService(localNsdServiceInfo, new p.2.1(this, localCountDownLatch));
    try
    {
      localCountDownLatch.await(1000L, TimeUnit.MILLISECONDS);
      ab.i("MicroMsg.LocalServiceMgr", "finish reslove " + this.ipu.ipz + " trhead id=" + Thread.currentThread().getId());
      AppMethodBeat.o(108269);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.printErrStackTrace("LocalServiceMgr", localInterruptedException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.p.2
 * JD-Core Version:    0.6.2
 */