package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.udp.libmmudp.UdpNative;
import com.tencent.mm.udp.libmmudp.UdpNative.b;

final class s$4
  implements Runnable
{
  s$4(s params, i parami, UdpNative.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129070);
    ab.i("MicroMsg.AppBrandService", "createUdpBinding initBindingUdp");
    com.tencent.mm.plugin.appbrand.h.s locals = (com.tencent.mm.plugin.appbrand.h.s)this.gQb.af(com.tencent.mm.plugin.appbrand.h.s.class);
    if (locals == null)
    {
      ab.e("MicroMsg.AppBrandService", "createUdpBinding v8Addon is null");
      AppMethodBeat.o(129070);
    }
    while (true)
    {
      return;
      UdpNative.instance().initBindingUdp(locals.getIsolatePtr(), locals.aGW());
      UdpNative.instance().InitCallBack(this.gQc);
      AppMethodBeat.o(129070);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.4
 * JD-Core Version:    0.6.2
 */