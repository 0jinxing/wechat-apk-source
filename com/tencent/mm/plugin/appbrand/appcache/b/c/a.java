package com.tencent.mm.plugin.appbrand.appcache.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public enum a
{
  public static final a.a gWm;
  public static final a.a gWn;
  public static final a.a gWo;
  public static final a.a gWp;

  static
  {
    AppMethodBeat.i(129502);
    gWl = new a("INSTANCE");
    gWq = new a[] { gWl };
    gWm = new a.1();
    gWn = new a.2();
    gWo = new a.3();
    gWp = new a.4();
    AppMethodBeat.o(129502);
  }

  public static void cO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138693);
    z(paramInt1, paramInt2);
    AppMethodBeat.o(138693);
  }

  public static void z(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(129501);
    if (paramLong2 < 0L)
    {
      ab.e("MicroMsg.AppBrand.PredownloadReporter", "idkeyStat with invalid ID(%d), key (%d)", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      AppMethodBeat.o(129501);
    }
    while (true)
    {
      return;
      if (paramLong1 > 0L)
      {
        h.pYm.k(paramLong1, paramLong2, 1L);
        h.pYm.e(15272, new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      }
      if (843L != paramLong1)
      {
        h.pYm.k(843L, paramLong2, 1L);
        h.pYm.e(15272, new Object[] { Integer.valueOf(843), Long.valueOf(paramLong2) });
      }
      AppMethodBeat.o(129501);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.c.a
 * JD-Core Version:    0.6.2
 */