package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.m.a.b;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends b
{
  public static d.a iqf;

  public final void a(i parami, c paramc)
  {
    AppMethodBeat.i(102195);
    if (iqf == null)
    {
      ab.d("MicroMsg.NodeReportIDKey", "sDelegate null");
      AppMethodBeat.o(102195);
    }
    while (true)
    {
      return;
      try
      {
        int i = parami.getInt("id");
        int j = parami.getInt("key");
        int k = parami.optInt("val", 1);
        iqf.M(i, j, k);
        AppMethodBeat.o(102195);
      }
      catch (g parami)
      {
        ab.e("MicroMsg.NodeReportIDKey", "execute exception : %s", new Object[] { parami });
        paramc.aIU();
        AppMethodBeat.o(102195);
      }
    }
  }

  public final int aIT()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.d
 * JD-Core Version:    0.6.2
 */