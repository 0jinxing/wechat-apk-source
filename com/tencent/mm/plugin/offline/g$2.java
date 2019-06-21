package com.tencent.mm.plugin.offline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class g$2
  implements ap.a
{
  g$2(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(43313);
    if (g.a(this.oXn) != null)
      if (!com.tencent.mm.kernel.g.RK())
      {
        ap localap = g.a(this.oXn);
        long l = g.access$400();
        localap.ae(l, l);
        AppMethodBeat.o(43313);
      }
    while (true)
    {
      return false;
      if ((a.bYE()) && (a.bYd()))
        g.bXd();
      AppMethodBeat.o(43313);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.g.2
 * JD-Core Version:    0.6.2
 */