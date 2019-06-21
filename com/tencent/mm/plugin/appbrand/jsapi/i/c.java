package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 615;
  public static final String NAME = "checkNetworkAPIURL";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(108020);
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data nil", null));
      ab.w("MicroMsg.JsApiCheckNetworkAPIURL", "data is null");
      AppMethodBeat.o(108020);
    }
    HashMap localHashMap;
    String str;
    while (true)
    {
      return;
      localHashMap = new HashMap();
      str = paramJSONObject.optString("api", "");
      paramJSONObject = paramJSONObject.optString("url", "");
      if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil(paramJSONObject)))
        break;
      ab.w("MicroMsg.JsApiCheckNetworkAPIURL", "invalid api:%s,url:%s", new Object[] { str, paramJSONObject });
      localHashMap.put("isValid", Boolean.FALSE);
      paramc.M(paramInt, j("fail:api or url invalid", localHashMap));
      AppMethodBeat.o(108020);
    }
    Object localObject = (com.tencent.mm.plugin.appbrand.l.a)paramc.aa(com.tencent.mm.plugin.appbrand.l.a.class);
    boolean bool;
    if (str.equalsIgnoreCase("request"))
    {
      bool = j.b(((com.tencent.mm.plugin.appbrand.l.a)localObject).bQF, paramJSONObject, false);
      label170: localObject = (String)j.CP(paramJSONObject).get("host");
      if (bo.isNullOrNil((String)localObject))
        break label562;
      ab.i("MicroMsg.JsApiCheckNetworkAPIURL", "ipHost:%s", new Object[] { localObject });
    }
    label269: label562: for (int i = j.CR((String)localObject); ; i = 0)
    {
      ab.i("MicroMsg.JsApiCheckNetworkAPIURL", "checkRet:%b,ipCheckRet:%d,api:%s,url:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), str, paramJSONObject });
      if (bool)
      {
        localHashMap.put("isInDomainList", Boolean.TRUE);
        switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
      }
      while (true)
      {
        paramc.M(paramInt, j("ok", localHashMap));
        AppMethodBeat.o(108020);
        break;
        if (str.equalsIgnoreCase("websocket"))
        {
          bool = j.b(((com.tencent.mm.plugin.appbrand.l.a)localObject).bQG, paramJSONObject, ((com.tencent.mm.plugin.appbrand.l.a)localObject).bQB);
          break label170;
        }
        if (str.equalsIgnoreCase("downloadFile"))
        {
          bool = j.b(((com.tencent.mm.plugin.appbrand.l.a)localObject).bQI, paramJSONObject, false);
          break label170;
        }
        if (str.equalsIgnoreCase("uploadFile"))
        {
          bool = j.b(((com.tencent.mm.plugin.appbrand.l.a)localObject).bQH, paramJSONObject, false);
          break label170;
        }
        if (str.equalsIgnoreCase("udp"))
        {
          bool = j.b(((com.tencent.mm.plugin.appbrand.l.a)localObject).bQJ, paramJSONObject, false);
          break label170;
        }
        localHashMap.put("isValid", Boolean.FALSE);
        paramc.M(paramInt, j("fail:unknow api", localHashMap));
        AppMethodBeat.o(108020);
        break;
        localHashMap.put("isInDomainList", Boolean.FALSE);
        break label269;
        localHashMap.put("isInLAN", Boolean.FALSE);
        localHashMap.put("isLocalHost", Boolean.FALSE);
        continue;
        localHashMap.put("isInLAN", Boolean.TRUE);
        localHashMap.put("isLocalHost", Boolean.TRUE);
        continue;
        localHashMap.put("isInLAN", Boolean.TRUE);
        localHashMap.put("isLocalHost", Boolean.FALSE);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.i.c
 * JD-Core Version:    0.6.2
 */