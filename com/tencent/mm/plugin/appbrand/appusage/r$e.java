package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class r$e
{
  public static final e hab;

  static
  {
    AppMethodBeat.i(129633);
    hab = new e();
    AppMethodBeat.o(129633);
  }

  static void a(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129632);
    h.pYm.e(14112, new Object[] { Integer.valueOf(1), bo.nullAsNil(paramString), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(129632);
  }

  static void axC()
  {
    AppMethodBeat.i(129629);
    a((String)g.RP().Ry().get(ac.a.xOe, ""), ((Long)g.RP().Ry().get(ac.a.xOf, Long.valueOf(0L))).longValue(), 3, axE());
    AppMethodBeat.o(129629);
  }

  public static void axD()
  {
    AppMethodBeat.i(129630);
    a("", 0L, 1, 1);
    AppMethodBeat.o(129630);
  }

  static int axE()
  {
    AppMethodBeat.i(129631);
    int i;
    if (g.RP().Ry().getBoolean(ac.a.xOk, false))
    {
      i = 1;
      AppMethodBeat.o(129631);
    }
    while (true)
    {
      return i;
      int j = ((Integer)g.RP().Ry().get(ac.a.xOh, Integer.valueOf(0))).intValue();
      i = j;
      if (j > 0)
        i = j + 1;
      AppMethodBeat.o(129631);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.r.e
 * JD-Core Version:    0.6.2
 */