package com.tencent.mm.plugin.appbrand.report.quality;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cq;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.appbrand.s;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/report/quality/AppBrandServiceScriptErrorReport;", "", "()V", "reportError", "", "service", "Lcom/tencent/mm/plugin/appbrand/AppBrandServiceWC;", "message", "", "stackTrace", "plugin-appbrand-integration_release"})
public final class f
{
  public static final f iCN;

  static
  {
    AppMethodBeat.i(134947);
    iCN = new f();
    AppMethodBeat.o(134947);
  }

  public static final void a(s params, String paramString1, String paramString2)
  {
    AppMethodBeat.i(134946);
    j.p(params, "service");
    cq localcq = new cq();
    localcq.hx(params.getAppId());
    localcq.ez(params.getRuntime().atI().axy);
    localcq.eA(params.getRuntime().asT() + 1);
    localcq.Hj();
    localcq.hy(paramString1);
    localcq.hz(paramString2);
    paramString1 = params.asG();
    if (paramString1 == null)
      j.dWJ();
    localcq.hA(paramString1.avk());
    localcq.eB(d.Dx(params.getAppId()) + 1000L);
    paramString1 = params.aun();
    j.o(paramString1, "page");
    params = paramString1.getURL();
    paramString1 = paramString1.aBm();
    j.o(paramString1, "page.urlWithQuery");
    int i = params.length();
    if (paramString1 == null)
    {
      params = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(134946);
      throw params;
    }
    paramString1 = paramString1.substring(i);
    j.o(paramString1, "(this as java.lang.String).substring(startIndex)");
    localcq.hB(params);
    localcq.hC(paramString1);
    localcq.ajK();
    AppMethodBeat.o(134946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.f
 * JD-Core Version:    0.6.2
 */