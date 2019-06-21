package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class AppBrandIDKeyBatchReport$b$2
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(132521);
    ab.d("MicroMsg.AppBrandIDKeyBatchReport", "startReport run in TimerTask!");
    AppBrandIDKeyBatchReport.b.BL();
    AppMethodBeat.o(132521);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.b.2
 * JD-Core Version:    0.6.2
 */