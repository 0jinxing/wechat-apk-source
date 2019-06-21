package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.s.o;
import com.tencent.mm.plugin.appbrand.s.o.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class s$3
  implements Runnable
{
  s$3(s params, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129069);
    if (s.a(this.gPV));
    while (true)
    {
      try
      {
        localObject = this.gPV;
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        ((s)localObject).bo("onSubPackageReady", localJSONObject.put("moduleName", this.gPZ).toString());
        AppMethodBeat.o(129069);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandService", "loadModule using isolate context, notify but get exception %s");
        AppMethodBeat.o(129069);
        continue;
      }
      if (!"__APP__".equals(this.gPZ))
        break;
      s.b(this.gPV);
      AppMethodBeat.o(129069);
    }
    Object localObject = new StringBuilder().append(this.gPZ);
    if (this.gPZ.endsWith("/"));
    for (String str = ""; ; str = "/")
    {
      str = str + "app-service.js";
      localObject = aw.a(this.gPV.gOq, str);
      h.pYm.a(370L, 30L, 1L, false);
      o.a(this.gPV.getRuntime(), this.gPV.aBx(), str, "", "", (String)localObject, o.a.iRA, new s.3.1(this));
      AppMethodBeat.o(129069);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.3
 * JD-Core Version:    0.6.2
 */