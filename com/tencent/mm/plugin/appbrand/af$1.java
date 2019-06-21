package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.k.c;
import com.tencent.mm.plugin.appbrand.m.c;
import com.tencent.mm.sdk.platformtools.ab;

final class af$1
  implements k.c
{
  public final boolean auB()
  {
    AppMethodBeat.i(129159);
    boolean bool = af.access$100();
    AppMethodBeat.o(129159);
    return bool;
  }

  public final boolean xj(String paramString)
  {
    AppMethodBeat.i(129158);
    boolean bool;
    if (c.CU(paramString))
    {
      ab.i("MicroMsg.WcWssSwitchLogic", "isWcWssOpen : true for hardcode case");
      bool = true;
      AppMethodBeat.o(129158);
    }
    while (true)
    {
      return bool;
      bool = af.access$000();
      AppMethodBeat.o(129158);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.af.1
 * JD-Core Version:    0.6.2
 */