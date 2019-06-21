package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.os.Build.VERSION;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a
{
  public static final int CTRL_INDEX = 318;
  public static final String NAME = "getConnectedWifi";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94372);
    if (!d.ide)
    {
      ab.e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramc.M(paramInt, j("fail:not invoke startWifi", paramJSONObject));
      AppMethodBeat.o(94372);
    }
    while (true)
    {
      return;
      Object localObject = paramc.getContext();
      if (localObject == null)
      {
        ab.e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12010));
        paramc.M(paramInt, j("fail:context is null", paramJSONObject));
        AppMethodBeat.o(94372);
      }
      else
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cP((Context)localObject);
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled())
        {
          ab.e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(12005));
          paramc.M(paramInt, j("fail:wifi is disable", paramJSONObject));
          AppMethodBeat.o(94372);
        }
        else
        {
          paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.aGy();
          if (paramJSONObject == null)
          {
            if ((Build.VERSION.SDK_INT >= 23) && (!com.tencent.mm.sdk.h.b.Ms()) && (!((LocationManager)((Context)localObject).getSystemService("location")).isProviderEnabled("gps")))
            {
              paramJSONObject = new HashMap();
              paramJSONObject.put("errCode", Integer.valueOf(12006));
              paramc.M(paramInt, j("fail:may be not open GPS", paramJSONObject));
              ab.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not open GPS");
              AppMethodBeat.o(94372);
            }
            else
            {
              boolean bool = g.a((Activity)localObject, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
              ab.i("MicroMsg.JsApiGetConnectedWifi", "checkLocation:%b", new Object[] { Boolean.valueOf(bool) });
              if (!bool)
              {
                paramJSONObject = new HashMap();
                paramJSONObject.put("errCode", Integer.valueOf(12012));
                paramc.M(paramInt, j("fail:may be not obtain GPS Perrmission", paramJSONObject));
                ab.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not obtain GPS Perrmission");
                AppMethodBeat.o(94372);
              }
              else
              {
                ab.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
                paramJSONObject = new HashMap();
                paramJSONObject.put("errCode", Integer.valueOf(12010));
                paramc.M(paramInt, j("fail:currentWifi is null", paramJSONObject));
                AppMethodBeat.o(94372);
              }
            }
          }
          else
          {
            localObject = (ConnectivityManager)((Context)localObject).getSystemService("connectivity");
            if (localObject == null)
            {
              ab.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null");
              paramJSONObject = new HashMap();
              paramJSONObject.put("errCode", Integer.valueOf(12010));
              paramc.M(paramInt, j("fail:connectivityManager is null", paramJSONObject));
              AppMethodBeat.o(94372);
            }
            else
            {
              localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
              if (localObject == null)
              {
                ab.e("MicroMsg.JsApiGetConnectedWifi", "netInfo is null");
                paramJSONObject = new HashMap();
                paramJSONObject.put("errCode", Integer.valueOf(12010));
                paramc.M(paramInt, j("fail:netInfo is null", paramJSONObject));
                AppMethodBeat.o(94372);
              }
              else if (((NetworkInfo)localObject).getDetailedState() != NetworkInfo.DetailedState.CONNECTED)
              {
                ab.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null, detailState:%s", new Object[] { ((NetworkInfo)localObject).getDetailedState() });
                paramJSONObject = new HashMap();
                paramJSONObject.put("errCode", Integer.valueOf(12010));
                paramc.M(paramInt, j("fail:detailState is not connected", paramJSONObject));
                AppMethodBeat.o(94372);
              }
              else
              {
                ab.i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", new Object[] { paramJSONObject });
                try
                {
                  localObject = new java/util/HashMap;
                  ((HashMap)localObject).<init>();
                  ((HashMap)localObject).put("wifi", paramJSONObject.toJSONObject());
                  ((HashMap)localObject).put("errCode", Integer.valueOf(0));
                  paramc.M(paramInt, j("ok", (Map)localObject));
                  AppMethodBeat.o(94372);
                }
                catch (JSONException paramJSONObject)
                {
                  ab.printErrStackTrace("MicroMsg.JsApiGetConnectedWifi", paramJSONObject, "", new Object[0]);
                  paramJSONObject = new HashMap();
                  paramJSONObject.put("errCode", Integer.valueOf(12010));
                  paramc.M(paramInt, j("fail:parse json err", paramJSONObject));
                  AppMethodBeat.o(94372);
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.b
 * JD-Core Version:    0.6.2
 */