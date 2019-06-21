package com.tencent.mm.plugin.appbrand.l;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.DiscoveryListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum p
{
  public final Map<p.b, NsdManager.DiscoveryListener> ipq;

  static
  {
    AppMethodBeat.i(108278);
    ipp = new p("INSTANCE");
    ipr = new p[] { ipp };
    AppMethodBeat.o(108278);
  }

  private p()
  {
    AppMethodBeat.i(108274);
    this.ipq = new ConcurrentHashMap();
    AppMethodBeat.o(108274);
  }

  public static NsdManager aIN()
  {
    AppMethodBeat.i(108276);
    NsdManager localNsdManager = (NsdManager)ah.getContext().getSystemService("servicediscovery");
    AppMethodBeat.o(108276);
    return localNsdManager;
  }

  public final void a(p.b paramb)
  {
    AppMethodBeat.i(108275);
    synchronized (this.ipq)
    {
      if (!this.ipq.containsKey(paramb))
        AppMethodBeat.o(108275);
      while (true)
      {
        return;
        NsdManager localNsdManager = aIN();
        try
        {
          localNsdManager.stopServiceDiscovery((NsdManager.DiscoveryListener)this.ipq.get(paramb));
          this.ipq.remove(paramb);
          AppMethodBeat.o(108275);
        }
        catch (Throwable localThrowable)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.LocalServiceMgr", localThrowable, "Throwable: stopScanServices", new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.p
 * JD-Core Version:    0.6.2
 */