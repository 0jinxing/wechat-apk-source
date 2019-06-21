package com.tencent.mm.plugin.soter.d;

import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.n.a;
import com.tencent.mm.plugin.appbrand.n.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class i
{
  public static void ai(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(73891);
    ((b)e.C(b.class)).e(13711, new Object[] { Integer.valueOf(0), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(73891);
  }

  public static void fI(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(73892);
    switch (paramInt2)
    {
    default:
      paramInt1 = -1;
    case 26:
    case 4:
    case 9:
    case 5:
    case 10:
    case 1001:
    }
    while (true)
    {
      if (paramInt1 != -1)
      {
        ab.i("SoterLuggageReportManager", "luggage soter idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(672), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        ((a)e.C(a.class)).f(672L, paramInt1, 1L);
      }
      AppMethodBeat.o(73892);
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
        continue;
        paramInt1 = 2;
        continue;
        paramInt1 = 3;
        continue;
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.d.i
 * JD-Core Version:    0.6.2
 */