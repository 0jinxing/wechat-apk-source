package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.udp.libmmudp.UdpNative;

final class s$5
  implements Runnable
{
  s$5(s params)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129071);
    ab.i("MicroMsg.AppBrandService", "destoryUdpBinding destoryUdp");
    UdpNative.instance().destoryUdp();
    AppMethodBeat.o(129071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.5
 * JD-Core Version:    0.6.2
 */