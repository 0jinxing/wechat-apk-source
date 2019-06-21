package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 317;
  public static final String NAME = "getWifiList";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94373);
    if (!d.ide)
    {
      ab.e("MicroMsg.JsApiGetWifiList", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramc.M(paramInt, j("fail:not invoke startWifi", paramJSONObject));
      AppMethodBeat.o(94373);
    }
    while (true)
    {
      return;
      Object localObject = paramc.getContext();
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiGetWifiList", "mContext is null, invoke fail!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12010));
        paramc.M(paramInt, j("fail:context is null", paramJSONObject));
        AppMethodBeat.o(94373);
      }
      else
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cP((Context)localObject);
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled())
        {
          ab.e("MicroMsg.JsApiGetWifiList", "wifi is disable,invoke fail!");
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(12005));
          paramc.M(paramInt, j("fail:wifi is disable", paramJSONObject));
          AppMethodBeat.o(94373);
        }
        else
        {
          paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.aGz();
          if (paramJSONObject.hAa.equals("ok"))
          {
            try
            {
              ab.i("MicroMsg.JsApiGetWifiList", "onGetWifiList size:%d", new Object[] { Integer.valueOf(paramJSONObject.ido.size()) });
              if (paramJSONObject.ido.size() == 0)
              {
                if ((Build.VERSION.SDK_INT >= 23) && (!((LocationManager)((Context)localObject).getSystemService("location")).isProviderEnabled("gps")))
                {
                  paramJSONObject = new java/util/HashMap;
                  paramJSONObject.<init>();
                  paramJSONObject.put("errCode", Integer.valueOf(12006));
                  paramc.M(paramInt, j("fail:may be not open GPS", paramJSONObject));
                  ab.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not open GPS");
                  AppMethodBeat.o(94373);
                  continue;
                }
                boolean bool = g.a((Activity)localObject, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
                ab.i("MicroMsg.JsApiGetWifiList", "checkLocation:%b", new Object[] { Boolean.valueOf(bool) });
                if (!bool)
                {
                  paramJSONObject = new java/util/HashMap;
                  paramJSONObject.<init>();
                  paramJSONObject.put("errCode", Integer.valueOf(12012));
                  paramc.M(paramInt, j("fail:may be not obtain GPS Perrmission", paramJSONObject));
                  ab.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not obtain GPS Perrmission");
                  AppMethodBeat.o(94373);
                  continue;
                }
              }
              localObject = new java/util/HashMap;
              ((HashMap)localObject).<init>();
              ((Map)localObject).put("errCode", Integer.valueOf(0));
              paramc.M(paramInt, j("ok", (Map)localObject));
              ab.d("MicroMsg.JsApiGetWifiList", "onGetWifiList %s", new Object[] { paramJSONObject });
              localObject = new com/tencent/mm/plugin/appbrand/jsapi/wifi/c$a;
              ((c.a)localObject).<init>();
              HashMap localHashMap = new java/util/HashMap;
              localHashMap.<init>();
              localHashMap.put("wifiList", paramJSONObject.aGx());
              ((c.a)localObject).b(paramc, 0).t(localHashMap).aCj();
              AppMethodBeat.o(94373);
            }
            catch (JSONException paramJSONObject)
            {
              ab.printErrStackTrace("MicroMsg.JsApiGetWifiList", paramJSONObject, "", new Object[0]);
              paramJSONObject = new HashMap();
              paramJSONObject.put("errCode", Integer.valueOf(12010));
              paramc.M(paramInt, j("fail:parse json err", paramJSONObject));
              AppMethodBeat.o(94373);
            }
          }
          else
          {
            ab.e("MicroMsg.JsApiGetWifiList", "error, mErrorMsg:%s", new Object[] { paramJSONObject.hAa });
            localObject = new HashMap();
            ((Map)localObject).put("errCode", Integer.valueOf(12010));
            paramc.M(paramInt, j("fail:" + paramJSONObject.hAa, (Map)localObject));
            AppMethodBeat.o(94373);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.c
 * JD-Core Version:    0.6.2
 */