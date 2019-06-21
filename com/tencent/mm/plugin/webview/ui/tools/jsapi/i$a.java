package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i$a
{
  private static String a(String paramString1, String paramString2, Map<String, Object> paramMap, JSONObject paramJSONObject, boolean paramBoolean, String paramString3)
  {
    AppMethodBeat.i(9813);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("__msg_type", paramString1);
      if (paramString1.equals("callback"))
        localJSONObject.put("__callback_id", paramString2);
      while (paramJSONObject == null)
      {
        localJSONObject.put("__params", ao(paramMap));
        if (!paramBoolean)
          break label148;
        paramString1 = m(localJSONObject, paramString3);
        AppMethodBeat.o(9813);
        return paramString1;
        if (paramString1.equals("event"))
          localJSONObject.put("__event_id", paramString2);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.MsgWrapper", "build fail, exception = " + paramString1.getMessage());
        paramString1 = null;
        AppMethodBeat.o(9813);
        continue;
        localJSONObject.put("__params", paramJSONObject);
        continue;
        label148: paramString1 = localJSONObject.toString();
        AppMethodBeat.o(9813);
      }
    }
  }

  public static String a(String paramString1, Map<String, Object> paramMap, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(9810);
    paramString1 = a("callback", paramString1, paramMap, null, paramBoolean, paramString2);
    AppMethodBeat.o(9810);
    return paramString1;
  }

  public static String a(String paramString1, JSONObject paramJSONObject, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(9811);
    paramString1 = a("event", paramString1, null, paramJSONObject, paramBoolean, paramString2);
    AppMethodBeat.o(9811);
    return paramString1;
  }

  private static i agB(String paramString)
  {
    AppMethodBeat.i(9816);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgWrapper", "fromString fail, src is null");
      AppMethodBeat.o(9816);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      i locali = new i();
      while (true)
      {
        String str;
        try
        {
          Object localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(paramString);
          locali.type = ((JSONObject)localObject).getString("__msg_type");
          locali.uIG = ((JSONObject)localObject).getString("__callback_id");
          locali.uIJ = ((JSONObject)localObject).getString("func");
          paramString = new java/util/HashMap;
          paramString.<init>();
          locali.puc = paramString;
          JSONObject localJSONObject = ((JSONObject)localObject).getJSONObject("params");
          locali.uIH = localJSONObject;
          if (localJSONObject == null)
            break label313;
          Iterator localIterator = localJSONObject.keys();
          if (!localIterator.hasNext())
            break label313;
          str = (String)localIterator.next();
          localObject = localJSONObject.getString(str);
          paramString = (String)localObject;
          if (localObject == null)
            paramString = "";
          if (!"urls".equalsIgnoreCase(str))
            break label297;
          ab.v("MicroMsg.MsgWrapper", "key is JSONArray, %s", new Object[] { str });
          try
          {
            localObject = new org/json/JSONArray;
            ((JSONArray)localObject).<init>(paramString);
            paramString = new String[((JSONArray)localObject).length()];
            int i = 0;
            if (i < paramString.length)
            {
              paramString[i] = ((JSONArray)localObject).getString(i);
              i++;
              continue;
            }
            locali.puc.put(str, paramString);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.MsgWrapper", "parse JSONArray fail, ex = %s", new Object[] { paramString.getMessage() });
          }
          continue;
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.MsgWrapper", "fromString fail, exception = " + paramString.getMessage());
          AppMethodBeat.o(9816);
          paramString = null;
        }
        break;
        label297: locali.puc.put(str, paramString);
      }
      label313: AppMethodBeat.o(9816);
      paramString = locali;
    }
  }

  public static JSONObject ao(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9815);
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      paramMap = new JSONObject();
      AppMethodBeat.o(9815);
    }
    while (true)
    {
      return paramMap;
      JSONObject localJSONObject;
      while (true)
      {
        Object localObject;
        try
        {
          String str = (String)paramMap.get("jsapi_callback_json_special_key");
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          Iterator localIterator = paramMap.keySet().iterator();
          if (!localIterator.hasNext())
            break label200;
          localObject = (String)localIterator.next();
          if ((localObject == null) || (((String)localObject).equals("jsapi_callback_json_special_key")))
            continue;
          if ((str == null) || (!((String)localObject).equals(str)))
            break label182;
          localObject = new org/json/JSONArray;
          ((JSONArray)localObject).<init>((String)paramMap.get(str));
          localJSONObject.put(str, localObject);
          continue;
        }
        catch (Exception paramMap)
        {
          ab.e("MicroMsg.MsgWrapper", "convertMapToJSON fail, exception = " + paramMap.getMessage());
          paramMap = null;
          AppMethodBeat.o(9815);
        }
        break;
        label182: localJSONObject.put((String)localObject, paramMap.get(localObject));
      }
      label200: AppMethodBeat.o(9815);
      paramMap = localJSONObject;
    }
  }

  public static String b(String paramString1, Map<String, Object> paramMap, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(9812);
    paramString1 = a("event", paramString1, paramMap, null, paramBoolean, paramString2);
    AppMethodBeat.o(9812);
    return paramString1;
  }

  static List<i> i(String paramString1, boolean paramBoolean, String paramString2)
  {
    int i = 0;
    Object localObject1 = null;
    AppMethodBeat.i(9817);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.e("MicroMsg.MsgWrapper", "getMsgList fail, src is null");
      AppMethodBeat.o(9817);
      paramString1 = localObject1;
    }
    while (true)
    {
      return paramString1;
      if (paramBoolean);
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString1);
        paramString1 = ((JSONObject)localObject2).getJSONArray("__json_message");
        localObject2 = ((JSONObject)localObject2).getString("__sha_key");
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString2 = n.getSHA1(paramString1.toString().replaceAll("\\\\/", "/") + paramString2);
        if (!((String)localObject2).equals(paramString2))
        {
          ab.e("MicroMsg.MsgWrapper", "fromString SHA1 verification failed, sha1Str = %s, calSha1Str = %s, jsonList = %s", new Object[] { localObject2, paramString2, paramString1.toString().replaceAll("\\\\/", "/") });
          h.pYm.a(894L, 6L, 1L, false);
          AppMethodBeat.o(9817);
          paramString1 = localObject1;
          continue;
        }
        while (true)
        {
          int j = paramString1.length();
          if (j != 0)
            break label213;
          AppMethodBeat.o(9817);
          paramString1 = localObject1;
          break;
          paramString1 = new JSONArray(paramString1);
        }
        label213: paramString2 = new java/util/LinkedList;
        paramString2.<init>();
        while (i < paramString1.length())
        {
          paramString2.add(agB(paramString1.getString(i)));
          i++;
        }
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.MsgWrapper", "dealMsgQueue fail, exception = " + paramString1.getMessage());
        AppMethodBeat.o(9817);
        paramString1 = localObject1;
      }
      continue;
      AppMethodBeat.o(9817);
      paramString1 = paramString2;
    }
  }

  private static String m(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(9814);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("__json_message", paramJSONObject);
      String str = paramJSONObject.toString().replaceAll("\\\\/", "/");
      ab.i("MicroMsg.MsgWrapper", "js digest verification contentStr = ", new Object[] { str });
      paramJSONObject = new java/lang/StringBuilder;
      paramJSONObject.<init>();
      paramJSONObject = n.getSHA1(str + paramString);
      ab.i("MicroMsg.MsgWrapper", "js digest verification shaStr = ", new Object[] { paramJSONObject });
      localJSONObject.put("__sha_key", paramJSONObject);
      paramJSONObject = localJSONObject.toString();
      AppMethodBeat.o(9814);
      return paramJSONObject;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.MsgWrapper", "build fail, exception = " + paramJSONObject.getMessage());
        paramJSONObject = null;
        AppMethodBeat.o(9814);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a
 * JD-Core Version:    0.6.2
 */