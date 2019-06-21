package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$13
  implements Runnable
{
  c$13(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117399);
    if ((this.iet.idR != null) && (this.iet.iea) && (this.iet.iee))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handleWebViewForeground runnable, video playing when enter background");
      this.iet.iee = false;
      this.iet.play();
    }
    AppMethodBeat.o(117399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.13
 * JD-Core Version:    0.6.2
 */