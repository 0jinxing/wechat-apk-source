package com.tencent.mm.plugin.wepkg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$3
  implements ap.a
{
  c$3(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(63367);
    if ((c.b(this.uVG)) && (!c.c(this.uVG)))
    {
      ab.i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
      al.d(new c.3.1(this));
    }
    while (true)
    {
      AppMethodBeat.o(63367);
      return false;
      c.Kj(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.c.3
 * JD-Core Version:    0.6.2
 */