package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.z;

final class o$3
  implements ap.a
{
  o$3(o paramo)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(77954);
    if ((!g.RN().QY()) || (o.acd() == null))
    {
      ab.w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", new Object[] { Boolean.valueOf(g.RN().QY()), o.acd() });
      AppMethodBeat.o(77954);
    }
    while (true)
    {
      return false;
      if (((Boolean)g.RP().Ry().get(90113, Boolean.FALSE)).booleanValue())
      {
        o.acx();
        o.acw();
      }
      g.RP().Ry().set(90113, Boolean.FALSE);
      AppMethodBeat.o(77954);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(77955);
    String str = super.toString() + "|upAssetsHandler";
    AppMethodBeat.o(77955);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.o.3
 * JD-Core Version:    0.6.2
 */