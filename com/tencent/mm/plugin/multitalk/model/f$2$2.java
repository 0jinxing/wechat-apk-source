package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2$2
  implements Runnable
{
  f$2$2(f.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53939);
    p.bSe().oFP.rn(false);
    if ((g.KK() != null) && (g.KK().KP()))
    {
      ab.i("MicroMsg.MT.MultiTalkManager", "is bluetooth can use and start bluetooth");
      g.KK().KM();
      AppMethodBeat.o(53939);
    }
    while (true)
    {
      return;
      this.oGC.oGB.jo(p.bSf().oGb);
      AppMethodBeat.o(53939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.2.2
 * JD-Core Version:    0.6.2
 */