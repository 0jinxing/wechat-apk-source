package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements Runnable
{
  c$2(c paramc, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117388);
    if (((this.bVv == 2) && (!this.iet.hLX)) || ((this.bVv == 1) && (!this.iet.hLW)))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handleWebViewBackground runnable, video not auto pause");
      AppMethodBeat.o(117388);
    }
    while (true)
    {
      return;
      if ((this.iet.idR != null) && (this.iet.iea))
      {
        this.iet.iee = this.iet.idR.isPlaying();
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handleWebViewBackground runnable, video playing state when enter background:%s", new Object[] { Boolean.valueOf(this.iet.iee) });
        this.iet.pause();
      }
      AppMethodBeat.o(117388);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c.2
 * JD-Core Version:    0.6.2
 */