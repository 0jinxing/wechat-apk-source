package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.z.b.b.a;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public f(int paramInt)
  {
    super("log", paramInt);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10832);
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray("dataArray");
      paramJSONObject = new java/util/ArrayList;
      paramJSONObject.<init>(localJSONArray.length());
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        if (localJSONObject != null)
        {
          LogInfo localLogInfo = new com/tencent/mm/modelappbrand/LogInfo;
          localLogInfo.<init>();
          localLogInfo.ts = localJSONObject.optLong("ts");
          localLogInfo.level = (localJSONObject.optInt("level") + 1);
          localLogInfo.message = localJSONObject.optString("msg");
          paramJSONObject.add(localLogInfo);
          ab.d("MicroMsg.JsApiFunc_Log", "ts : %s, level : %d, msg : %s", new Object[] { Util.nz(localLogInfo.ts), Integer.valueOf(localLogInfo.level), localLogInfo.message });
        }
      }
      com.tencent.mm.plugin.appbrand.dynamic.debugger.a.c(parama.Qy().getString("__page_view_id", null), paramJSONObject);
      parama1.au(a(true, "", null));
      AppMethodBeat.o(10832);
      return;
    }
    catch (JSONException parama)
    {
      while (true)
      {
        parama1.au(a(false, "dataArray is null", null));
        AppMethodBeat.o(10832);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.f
 * JD-Core Version:    0.6.2
 */