package com.tencent.mm.plugin.appbrand.l;

import android.net.nsd.NsdManager.DiscoveryListener;
import android.net.nsd.NsdServiceInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class p$1
  implements NsdManager.DiscoveryListener
{
  public p$1(p paramp, p.b paramb)
  {
  }

  public final void onDiscoveryStarted(String paramString)
  {
    AppMethodBeat.i(108263);
    this.ips.aEr();
    ab.i("MicroMsg.LocalServiceMgr", "onDiscoveryStarted ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108263);
  }

  public final void onDiscoveryStopped(String paramString)
  {
    AppMethodBeat.i(108264);
    this.ips.aEs();
    ab.i("MicroMsg.LocalServiceMgr", "onDiscoveryStopped ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108264);
  }

  public final void onServiceFound(NsdServiceInfo paramNsdServiceInfo)
  {
    AppMethodBeat.i(108265);
    p.c localc = new p.c(paramNsdServiceInfo);
    this.ips.a(localc);
    ab.i("MicroMsg.LocalServiceMgr", "onServicesFound " + paramNsdServiceInfo.getServiceType());
    AppMethodBeat.o(108265);
  }

  public final void onServiceLost(NsdServiceInfo paramNsdServiceInfo)
  {
    AppMethodBeat.i(108266);
    this.ips.b(new p.c(paramNsdServiceInfo));
    ab.i("MicroMsg.LocalServiceMgr", "onServiceLost " + paramNsdServiceInfo.getServiceType());
    AppMethodBeat.o(108266);
  }

  public final void onStartDiscoveryFailed(String paramString, int paramInt)
  {
    AppMethodBeat.i(108261);
    this.ips.aEp();
    ab.i("MicroMsg.LocalServiceMgr", "onStartDiscoveryFailed ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108261);
  }

  public final void onStopDiscoveryFailed(String paramString, int paramInt)
  {
    AppMethodBeat.i(108262);
    this.ips.aEq();
    ab.i("MicroMsg.LocalServiceMgr", "onStopDiscoveryFailed ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(108262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.p.1
 * JD-Core Version:    0.6.2
 */