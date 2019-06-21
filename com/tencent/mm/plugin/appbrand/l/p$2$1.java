package com.tencent.mm.plugin.appbrand.l;

import android.net.nsd.NsdManager.ResolveListener;
import android.net.nsd.NsdServiceInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class p$2$1
  implements NsdManager.ResolveListener
{
  p$2$1(p.2 param2, CountDownLatch paramCountDownLatch)
  {
  }

  public final void onResolveFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
  {
    AppMethodBeat.i(108267);
    this.ipx.ipv.c(new p.c(paramNsdServiceInfo));
    this.ipw.countDown();
    AppMethodBeat.o(108267);
  }

  public final void onServiceResolved(NsdServiceInfo paramNsdServiceInfo)
  {
    AppMethodBeat.i(108268);
    this.ipx.ipv.d(new p.c(paramNsdServiceInfo));
    this.ipw.countDown();
    AppMethodBeat.o(108268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.p.2.1
 * JD-Core Version:    0.6.2
 */