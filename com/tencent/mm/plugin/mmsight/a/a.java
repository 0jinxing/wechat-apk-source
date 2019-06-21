package com.tencent.mm.plugin.mmsight.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static void a(a.a parama)
  {
    AppMethodBeat.i(54958);
    ab.i("MicroMsg.VideoEditReporter", "[report-VideoEditCountData] %s", new Object[] { parama.toString() });
    h.pYm.e(14529, new Object[] { Integer.valueOf(parama.scene), Integer.valueOf(parama.cvd) });
    AppMethodBeat.o(54958);
  }

  public static void a(a.b paramb, String paramString)
  {
    AppMethodBeat.i(54957);
    h localh = h.pYm;
    int i = paramb.scene;
    if (paramb.eVT);
    for (int j = 2; ; j = 1)
    {
      localh.e(14362, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramb.oxz), Integer.valueOf(paramb.oxA), Integer.valueOf(paramb.oxC), Boolean.valueOf(paramb.oxB), Integer.valueOf(paramb.efs), Integer.valueOf(paramb.oxx), Integer.valueOf(paramb.oxy), Integer.valueOf(paramb.oxD), Integer.valueOf(0), Integer.valueOf(paramb.textColor), paramString, Long.valueOf(bo.anT()) });
      ab.i("MicroMsg.VideoEditReporter", "[report-VideoEditDetailData] %s", new Object[] { paramb.toString() });
      AppMethodBeat.o(54957);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.a.a
 * JD-Core Version:    0.6.2
 */