package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class AdReportCgiHelper
{
  public static void a(int paramInt, String paramString, AdReportCgiHelper.a parama)
  {
    AppMethodBeat.i(132577);
    if (ah.bqo())
    {
      ab(paramInt, paramString);
      if (parama == null)
        break label68;
      parama.onDone();
      AppMethodBeat.o(132577);
    }
    while (true)
    {
      return;
      AdReportCgiHelper.AdReportCgiParams localAdReportCgiParams = new AdReportCgiHelper.AdReportCgiParams();
      AdReportCgiHelper.AdReportCgiParams.a(localAdReportCgiParams, paramInt);
      AdReportCgiHelper.AdReportCgiParams.a(localAdReportCgiParams, paramString);
      XIPCInvoker.a("com.tencent.mm", localAdReportCgiParams, AdReportCgiHelper.b.class, new AdReportCgiHelper.1(parama));
      label68: AppMethodBeat.o(132577);
    }
  }

  static void ab(int paramInt, String paramString)
  {
    AppMethodBeat.i(132578);
    if (g.K(a.class) != null)
      ((a)g.K(a.class)).i(paramInt, paramString, (int)bo.anT());
    AppMethodBeat.o(132578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper
 * JD-Core Version:    0.6.2
 */