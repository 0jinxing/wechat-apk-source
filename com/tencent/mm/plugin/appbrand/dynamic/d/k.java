package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.k.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.b.b.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public k(int paramInt)
  {
    super("reportKeyValue", paramInt);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10852);
    parama = com.tencent.mm.plugin.appbrand.dynamic.k.Aa(parama.Qy().getString("__page_view_id", null));
    if (parama == null)
    {
      parama1.au(a(false, "JsApi Framework Context is null", null));
      AppMethodBeat.o(10852);
    }
    while (true)
    {
      return;
      paramJSONObject = paramJSONObject.optJSONArray("dataArray");
      if (paramJSONObject == null)
      {
        parama1.au(a(false, "dataArray is null", null));
        AppMethodBeat.o(10852);
      }
      else
      {
        int i = 0;
        while (true)
          if (i < paramJSONObject.length())
            try
            {
              Object localObject = paramJSONObject.getJSONObject(i);
              int j = ((JSONObject)localObject).optInt("key");
              localObject = ((JSONObject)localObject).optString("value");
              if ((j > 0) && (!bo.isNullOrNil((String)localObject)))
                h.pYm.e(j, new Object[] { parama.getAppId(), Integer.valueOf(parama.azH()), Integer.valueOf(b.nO(parama.avn()) + 1), localObject });
              i++;
            }
            catch (Exception localException)
            {
              while (true)
                ab.e("MicroMsg.JsApiFunc_ReportKeyValue", "parse report value failed : %s", new Object[] { localException });
            }
        parama1.au(a(true, "", null));
        AppMethodBeat.o(10852);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.k
 * JD-Core Version:    0.6.2
 */