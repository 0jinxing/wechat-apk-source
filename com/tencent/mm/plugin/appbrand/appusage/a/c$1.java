package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  c$1(c paramc, PBool paramPBool1, PBool paramPBool2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(129738);
    if (this.gZG.value)
      AppMethodBeat.o(129738);
    while (true)
    {
      return false;
      this.gZH.value = true;
      c.a(this.hbf);
      ab.i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onTimerExpired");
      if (c.b(this.hbf) != null)
        c.b(this.hbf).G(c.axV(), c.axW());
      AppMethodBeat.o(129738);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.c.1
 * JD-Core Version:    0.6.2
 */