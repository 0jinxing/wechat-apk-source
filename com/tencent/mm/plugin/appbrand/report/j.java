package com.tencent.mm.plugin.appbrand.report;

import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.q.d;
import com.tencent.mm.plugin.appbrand.jsapi.q.d.a;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/report/ReportUtilKt;", "", "()V", "getNetworkTypeForReport", "", "context", "Landroid/content/Context;", "plugin-appbrand-integration_release"})
public final class j
{
  public static final j iAv;

  static
  {
    AppMethodBeat.i(134943);
    iAv = new j();
    AppMethodBeat.o(134943);
  }

  public static final String cW(Context paramContext)
  {
    AppMethodBeat.i(134942);
    Context localContext = paramContext;
    if (paramContext == null)
      localContext = ah.getContext();
    paramContext = d.cK(localContext);
    switch (k.eQZ[paramContext.ordinal()])
    {
    default:
      paramContext = paramContext.value;
      a.f.b.j.o(paramContext, "type.value");
      AppMethodBeat.o(134942);
    case 1:
    }
    while (true)
    {
      return paramContext;
      paramContext = "offline";
      AppMethodBeat.o(134942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.j
 * JD-Core Version:    0.6.2
 */