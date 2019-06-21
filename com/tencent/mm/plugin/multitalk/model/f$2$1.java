package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2$1
  implements Runnable
{
  f$2$1(f.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53938);
    j.a locala1 = j.bRX();
    if (locala1 != f.i(this.oGC.oGB))
    {
      j.a locala2 = f.i(this.oGC.oGB);
      f.a(this.oGC.oGB, locala1);
      ab.i("MicroMsg.MT.MultiTalkManager", "steve: network change: %s -> %s", new Object[] { locala2.name(), f.i(this.oGC.oGB).name() });
      this.oGC.oGB.zf(f.j(this.oGC.oGB));
      if (f.k(this.oGC.oGB) != null)
        f.k(this.oGC.oGB).a(f.i(this.oGC.oGB));
      AppMethodBeat.o(53938);
    }
    while (true)
    {
      return;
      this.oGC.oGB.zf(f.j(this.oGC.oGB));
      ab.i("MicroMsg.MT.MultiTalkManager", "network not change: %s", new Object[] { f.i(this.oGC.oGB).name() });
      AppMethodBeat.o(53938);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.2.1
 * JD-Core Version:    0.6.2
 */