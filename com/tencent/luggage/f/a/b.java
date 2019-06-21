package com.tencent.luggage.f.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class b
  implements com.tencent.mm.plugin.appbrand.jsapi.g.a.c
{
  public com.tencent.mm.plugin.appbrand.jsapi.g.a.b a(Context paramContext, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(51148);
    if (paramContext == null)
    {
      paramContext = null;
      AppMethodBeat.o(51148);
    }
    while (true)
    {
      return paramContext;
      paramContext = new a(paramContext, paramString, paramMap);
      AppMethodBeat.o(51148);
    }
  }

  public com.tencent.mm.plugin.appbrand.jsapi.g.a.b a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(51147);
    if ((paramc == null) || (paramJSONObject == null))
    {
      paramc = null;
      AppMethodBeat.o(51147);
    }
    while (true)
    {
      return paramc;
      Context localContext = paramc.getContext();
      String str1 = paramJSONObject.optString("theme", "");
      int i = paramJSONObject.optInt("mapType", 1);
      String str2 = paramJSONObject.optString("subKey", "");
      String str3 = paramc.getAppId();
      int j = paramJSONObject.optInt("styleId", 0);
      paramJSONObject = f.g(paramc, paramJSONObject);
      paramc = new HashMap(5);
      paramc.put("theme", str1);
      paramc.put("mapType", Integer.valueOf(i));
      paramc.put("subKey", str2);
      paramc.put("subId", str3);
      paramc.put("styleId", Integer.valueOf(j));
      paramc = new a(localContext, paramJSONObject, paramc);
      AppMethodBeat.o(51147);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.f.a.b
 * JD-Core Version:    0.6.2
 */