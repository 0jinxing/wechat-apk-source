package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class eh extends dy
{
  private static boolean a = false;

  public final void a(du paramdu)
  {
    AppMethodBeat.i(98786);
    Object localObject1 = new dx();
    Object localObject2 = new dw();
    Object localObject3 = new dv();
    try
    {
      if ((eu.a(((dw)localObject2).b)) || (!a))
      {
        paramdu.a.put("needUpdateState", Integer.valueOf(1));
        a = true;
      }
      while (true)
      {
        if (eu.a(((dw)localObject2).b))
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("model", ((dx)localObject1).a);
          localJSONObject.put("osVersion", ((dx)localObject1).b);
          localJSONObject.put("imei", ((dx)localObject1).c);
          localJSONObject.put("imsi", ((dx)localObject1).d);
          localJSONObject.put("pseudoId", ((dx)localObject1).e);
          paramdu.a.put("RegistDeviceInfo", localJSONObject);
        }
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        ((JSONObject)localObject1).put("platform", ((dw)localObject2).a);
        ((JSONObject)localObject1).put("deviceId", ((dw)localObject2).b);
        ((JSONObject)localObject1).put("sdkVersion", ((dw)localObject2).c);
        paramdu.a.put("BindDeviceInfo", localObject1);
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
        ((JSONObject)localObject2).put("bundle", ((dv)localObject3).a);
        ((JSONObject)localObject2).put("verCode", ((dv)localObject3).b);
        ((JSONObject)localObject2).put("verName", ((dv)localObject3).c);
        ((JSONObject)localObject2).put("appId", ((dv)localObject3).e);
        ((JSONObject)localObject2).put("uuid", ((dv)localObject3).d);
        localObject3 = new org/json/JSONArray;
        ((JSONArray)localObject3).<init>();
        ((JSONArray)localObject3).put(localObject2);
        paramdu.a.put("AppState", localObject3);
        localObject3 = er.a(ce.g());
        paramdu.a.put("netType", localObject3);
        localObject3 = ds.a(ce.j().intValue());
        paramdu.a.put("oper", localObject3);
        AppMethodBeat.o(98786);
        return;
        paramdu.a.put("needUpdateState", Integer.valueOf(0));
      }
    }
    catch (Exception paramdu)
    {
      while (true)
        AppMethodBeat.o(98786);
    }
  }

  public final void a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(98787);
    try
    {
      String str1 = paramJSONObject.optString("result");
      boolean bool = TextUtils.isEmpty(str1);
      if (!bool)
        try
        {
          if (Integer.parseInt(str1) == 1002)
          {
            er.a("");
            AppMethodBeat.o(98787);
            return;
          }
        }
        catch (Throwable localThrowable)
        {
        }
      String str2 = paramJSONObject.optString("deviceId");
      if (!TextUtils.isEmpty(str2))
      {
        String str3 = er.a();
        if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str3)))
          er.a(str2);
      }
      while (true)
      {
        paramJSONObject = paramJSONObject.optString("oper");
        if (!TextUtils.isEmpty(paramJSONObject))
          ds.a().a(ce.b(), paramJSONObject);
        AppMethodBeat.o(98787);
        break;
        er.a("");
      }
    }
    catch (Throwable paramJSONObject)
    {
      while (true)
        AppMethodBeat.o(98787);
    }
  }

  public final String c()
  {
    return "state";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.eh
 * JD-Core Version:    0.6.2
 */