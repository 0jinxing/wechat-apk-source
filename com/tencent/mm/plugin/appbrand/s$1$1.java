package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.udp.libmmudp.UdpNative;

final class s$1$1
  implements Runnable
{
  s$1$1(s.1 param1, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129063);
    ab.i("MicroMsg.AppBrandService", "onCallBack apiName:%s", new Object[] { this.gPW });
    UdpNative.instance().updateNativeInterface();
    AppMethodBeat.o(129063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.1.1
 * JD-Core Version:    0.6.2
 */