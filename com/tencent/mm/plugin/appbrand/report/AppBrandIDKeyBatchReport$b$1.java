package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class AppBrandIDKeyBatchReport$b$1
  implements ap.a
{
  public final boolean BI()
  {
    AppMethodBeat.i(132520);
    AppBrandIDKeyBatchReport.b.BM();
    ab.d("MicroMsg.AppBrandIDKeyBatchReport", "on timer expired in monitor timer!");
    AppMethodBeat.o(132520);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.b.1
 * JD-Core Version:    0.6.2
 */