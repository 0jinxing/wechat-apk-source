package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class b$1
  implements d.a
{
  b$1(b paramb, com.tencent.luggage.sdk.a.a.b paramb1, int paramInt)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(102005);
    ab.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, message = %s", new Object[] { paramObject });
    this.hQG.M(this.eIl, this.hSV.j("fail:cgi fail", null));
    AppMethodBeat.o(102005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.b.1
 * JD-Core Version:    0.6.2
 */