package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class f
{
  public static void k(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(94486);
    paramString = String.format("%s,%s,%s,%s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
    ab.i("MicroMsg.SNS.SnsReportLogic", "snsRedDotAction 16172 report %s", new Object[] { paramString });
    e.pXa.X(16172, paramString);
    AppMethodBeat.o(94486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.f
 * JD-Core Version:    0.6.2
 */