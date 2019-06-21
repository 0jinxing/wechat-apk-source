package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.z.b.b.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public j(int paramInt)
  {
    super("reportIDKey", paramInt);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10851);
    parama = paramJSONObject.optJSONArray("dataArray");
    if (parama == null)
    {
      parama1.au(a(false, "dataArray is null", null));
      AppMethodBeat.o(10851);
    }
    while (true)
    {
      return;
      int i = 0;
      while (true)
        if (i < parama.length())
          try
          {
            paramJSONObject = parama.getJSONObject(i);
            int j = paramJSONObject.optInt("id");
            int k = paramJSONObject.optInt("key");
            int m = paramJSONObject.optInt("value");
            h.pYm.a(j, k, m, false);
            i++;
          }
          catch (Exception paramJSONObject)
          {
            while (true)
              ab.e("MicroMsg.JsApiFunc_ReportIDKey", "parse json failed : %s", new Object[] { paramJSONObject.getMessage() });
          }
      parama1.au(a(true, "", null));
      AppMethodBeat.o(10851);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.j
 * JD-Core Version:    0.6.2
 */