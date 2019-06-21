package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.m.a.b;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends b
{
  public final void a(i parami, c paramc)
  {
    AppMethodBeat.i(102197);
    try
    {
      int i = parami.getInt("level");
      parami = parami.optString("message");
      switch (i)
      {
      default:
        ab.d("MicroMsg.NodeJs", parami);
        AppMethodBeat.o(102197);
      case 2:
        while (true)
        {
          return;
          ab.i("MicroMsg.NodeJs", parami);
          AppMethodBeat.o(102197);
        }
      case 3:
      case 4:
      }
    }
    catch (g parami)
    {
      while (true)
      {
        ab.e("MicroMsg.NodeToXLog", "execute exception : %s", new Object[] { parami });
        paramc.aIU();
        AppMethodBeat.o(102197);
        continue;
        ab.w("MicroMsg.NodeJs", parami);
        AppMethodBeat.o(102197);
        continue;
        ab.e("MicroMsg.NodeJs", parami);
        AppMethodBeat.o(102197);
      }
    }
  }

  public final int aIT()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.f
 * JD-Core Version:    0.6.2
 */