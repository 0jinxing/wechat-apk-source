package com.tencent.mm.plugin.appbrand;

import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.e;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.plugin.appbrand.report.model.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONObject;

final class s$7 extends com.tencent.mm.plugin.appbrand.page.i
{
  s$7(s params, boolean paramBoolean)
  {
  }

  public final p s(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(129074);
    paramMap.put("scene", Integer.valueOf(this.gPV.getRuntime().ya().bQn.scene));
    Object localObject = this.gPV.getRuntime().atI().xA();
    if (localObject != null)
      paramMap.put("shareInfo", localObject);
    paramMap = new JSONObject(paramMap);
    localObject = this.gPV.getRuntime();
    if (this.gQd)
      e.a((o)localObject, paramMap);
    while (true)
    {
      super.AL(paramMap.toString());
      AppMethodBeat.o(129074);
      return this;
      try
      {
        e.b((o)localObject, paramMap);
        paramMap.put("referpagepath", ((o)localObject).atJ().getReporter().aHX().aLo().iBm);
        paramMap.put("clickTimestamp", ((o)localObject).atI().startTime);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterForeground ex = %s", new Object[] { localException });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.7
 * JD-Core Version:    0.6.2
 */