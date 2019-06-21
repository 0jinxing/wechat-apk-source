package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private static Set<String> hoG;

  static
  {
    AppMethodBeat.i(10958);
    hoG = new HashSet();
    if (!TextUtils.isEmpty("drawCanvas"))
      hoG.add("drawCanvas");
    AppMethodBeat.o(10958);
  }

  public static void a(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(10956);
    try
    {
      paramJSONObject.put("__session_id", paramString1);
      paramJSONObject.put("__invoke_jsapi_timestamp", System.nanoTime());
      paramString1 = c.yH(paramString1);
      if (paramString1 != null)
        paramString1.cBY.putInt("__invoke_jsapi_data_size", paramString2.length());
      AppMethodBeat.o(10956);
      return;
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiCostTimeStrategy", "%s", new Object[] { Log.getStackTraceString(paramString1) });
        AppMethodBeat.o(10956);
      }
    }
  }

  public static String o(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(10957);
    paramJSONObject = paramJSONObject.optString("__session_id");
    AppMethodBeat.o(10957);
    return paramJSONObject;
  }

  public static boolean yN(String paramString)
  {
    AppMethodBeat.i(10955);
    boolean bool = hoG.contains(paramString);
    AppMethodBeat.o(10955);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.d
 * JD-Core Version:    0.6.2
 */