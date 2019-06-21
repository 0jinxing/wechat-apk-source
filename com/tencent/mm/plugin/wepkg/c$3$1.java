package com.tencent.mm.plugin.wepkg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.utils.a;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3$1
  implements Runnable
{
  c$3$1(c.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63366);
    try
    {
      ab.i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
      c.d(this.uVI.uVG);
      c.e(this.uVI.uVG);
      int i = c.dgl();
      if (i > 1)
      {
        if (c.f(this.uVI.uVG) != null)
          a.b("whiteScreen", c.g(this.uVI.uVG), c.f(this.uVI.uVG).eBS, c.f(this.uVI.uVG).version, -1L, 0L, null);
        h.pYm.a(859L, 13L, 1L, false);
        String str = d.aid(c.g(this.uVI.uVG));
        b.Dp(str);
        com.tencent.mm.plugin.wepkg.model.b.dgz().dP(str, 1);
        c.dgm();
        AppMethodBeat.o(63366);
      }
      while (true)
      {
        return;
        c.Kj(i + 1);
        AppMethodBeat.o(63366);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(63366);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.c.3.1
 * JD-Core Version:    0.6.2
 */