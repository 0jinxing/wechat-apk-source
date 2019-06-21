package com.tencent.mm.plugin.appbrand.jsapi.o;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends a
{
  private static final int CTRL_INDEX = 64;
  private static final String NAME = "reportIDKey";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(73182);
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(73182);
    }
    while (true)
    {
      return;
      int i = 0;
      while (true)
        if (i < paramJSONObject.length())
          try
          {
            JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
            int j = localJSONObject.optInt("id");
            int k = localJSONObject.optInt("key");
            int m = localJSONObject.optInt("value");
            h.pYm.a(j, k, m, false);
            i++;
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", new Object[] { localException.getMessage() });
          }
      paramc.M(paramInt, j("ok", null));
      AppMethodBeat.o(73182);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.o.e
 * JD-Core Version:    0.6.2
 */