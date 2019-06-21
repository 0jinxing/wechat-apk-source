package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.model.AdReportCgiHelper.a;

final class z$1
  implements AdReportCgiHelper.a
{
  z$1(z paramz, c paramc, int paramInt)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(130371);
    this.hwp.M(this.eIl, this.hwq.j("ok", null));
    AppMethodBeat.o(130371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.z.1
 * JD-Core Version:    0.6.2
 */