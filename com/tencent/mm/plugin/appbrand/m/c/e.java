package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.m.a.b;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends b
{
  public static e.a iqg;

  public final void a(i parami, c paramc)
  {
    AppMethodBeat.i(102196);
    if (iqg == null)
    {
      ab.d("MicroMsg.NodeReportKV", "sDelegate null");
      AppMethodBeat.o(102196);
    }
    while (true)
    {
      return;
      try
      {
        int i = parami.getInt("id");
        parami = parami.optString("val");
        iqg.X(i, parami);
        AppMethodBeat.o(102196);
      }
      catch (g parami)
      {
        ab.e("MicroMsg.NodeReportKV", "execute exception : %s", new Object[] { parami });
        paramc.aIU();
        AppMethodBeat.o(102196);
      }
    }
  }

  public final int aIT()
  {
    return 8;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.e
 * JD-Core Version:    0.6.2
 */