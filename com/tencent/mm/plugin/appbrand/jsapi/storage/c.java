package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel;
import com.tencent.mm.plugin.appbrand.backgroundfetch.h;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 522;
  public static final String NAME = "getBackgroundFetchData";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131483);
    if (paramc == null)
    {
      ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "fail:component is null");
      AppMethodBeat.o(131483);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "fail:data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(131483);
      }
      else
      {
        Object localObject = paramJSONObject.optString("fetchType");
        if (bo.isNullOrNil((String)localObject))
        {
          ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "fail:fetchType is null");
          paramc.M(paramInt, j("fail:fetchType is null", null));
          AppMethodBeat.o(131483);
        }
        else
        {
          paramJSONObject = paramc.getAppId();
          if (bo.isNullOrNil(paramJSONObject))
          {
            ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "fail:appid is null");
            paramc.M(paramInt, j("fail:appid is null", null));
            AppMethodBeat.o(131483);
          }
          else
          {
            if (((String)localObject).equals("periodic"));
            AppBrandBackgroundFetchDataParcel localAppBrandBackgroundFetchDataParcel;
            for (int i = 1; ; i = 0)
            {
              localAppBrandBackgroundFetchDataParcel = ((h)g.K(h.class)).aR(paramJSONObject, i);
              if (localAppBrandBackgroundFetchDataParcel != null)
                break label214;
              ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "worker fail:record is null");
              paramc.M(paramInt, j("fail:record is null", null));
              AppMethodBeat.o(131483);
              break;
            }
            label214: if (localAppBrandBackgroundFetchDataParcel.data == null)
            {
              ab.w("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "worker fail:fetched data is null");
              paramc.M(paramInt, j("fail:fetched data is null", null));
              AppMethodBeat.o(131483);
            }
            else
            {
              localObject = new HashMap();
              ((Map)localObject).put("fetchedData", localAppBrandBackgroundFetchDataParcel.data);
              ((Map)localObject).put("path", localAppBrandBackgroundFetchDataParcel.path);
              ((Map)localObject).put("query", localAppBrandBackgroundFetchDataParcel.query);
              ((Map)localObject).put("scene", Integer.valueOf(localAppBrandBackgroundFetchDataParcel.scene));
              ((Map)localObject).put("timeStamp", Long.valueOf(localAppBrandBackgroundFetchDataParcel.updateTime));
              ab.i("MicroMsg.JsApiGetBackgroundFetchData.javayhu", "JsApiGetBackgroundFetchData, app(%s_%d)", new Object[] { paramJSONObject, Integer.valueOf(i) });
              paramc.M(paramInt, j("ok", (Map)localObject));
              AppMethodBeat.o(131483);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.c
 * JD-Core Version:    0.6.2
 */