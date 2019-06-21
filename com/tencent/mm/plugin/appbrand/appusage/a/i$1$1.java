package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1$1
  implements b.a
{
  i$1$1(i.1 param1)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(129752);
    ab.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick page click errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
      AppMethodBeat.o(129752);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
      AppMethodBeat.o(129752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.i.1.1
 * JD-Core Version:    0.6.2
 */