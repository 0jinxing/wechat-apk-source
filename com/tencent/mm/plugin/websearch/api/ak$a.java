package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class ak$a
{
  private static JSONObject ao(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(124199);
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      paramMap = new JSONObject();
      AppMethodBeat.o(124199);
    }
    while (true)
    {
      return paramMap;
      JSONObject localJSONObject;
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        Iterator localIterator = paramMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str != null)
            localJSONObject.put(str, paramMap.get(str));
        }
      }
      catch (Exception paramMap)
      {
        ab.e("MicroMsg.WebViewPreLoadMgr.Builder", "convertMapToJSON fail, exception = " + paramMap.getMessage());
        paramMap = null;
        AppMethodBeat.o(124199);
      }
      continue;
      AppMethodBeat.o(124199);
      paramMap = localJSONObject;
    }
  }

  static String i(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(124198);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("__msg_type", paramString1);
      if (paramString1.equals("event"))
        localJSONObject.put("__event_id", paramString2);
      localJSONObject.put("__params", ao(paramMap));
      paramString1 = localJSONObject.toString();
      AppMethodBeat.o(124198);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewPreLoadMgr.Builder", "build fail, exception = " + paramString1.getMessage());
        paramString1 = null;
        AppMethodBeat.o(124198);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ak.a
 * JD-Core Version:    0.6.2
 */