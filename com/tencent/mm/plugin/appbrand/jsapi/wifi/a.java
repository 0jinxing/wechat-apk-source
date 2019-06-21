package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.widget.b.j;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 316;
  public static final String NAME = "connectWifi";

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94371);
    if (!d.ide)
    {
      ab.e("MicroMsg.JsApiConenctWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramc.M(paramInt, j("fail:not invoke startWifi", paramJSONObject));
      AppMethodBeat.o(94371);
    }
    while (true)
    {
      return;
      if ((paramJSONObject == null) || (!paramJSONObject.has("SSID")))
      {
        ab.e("MicroMsg.JsApiConenctWifi", "params is invalid");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12010));
        paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
        AppMethodBeat.o(94371);
      }
      else
      {
        Object localObject1 = paramc.getContext();
        if (localObject1 == null)
        {
          ab.e("MicroMsg.JsApiConenctWifi", "mContext is null, invoke fail!");
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(12010));
          paramc.M(paramInt, j("fail:context is null", paramJSONObject));
          AppMethodBeat.o(94371);
        }
        else
        {
          com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cP((Context)localObject1);
          if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled())
          {
            ab.e("MicroMsg.JsApiConenctWifi", "wifi is disable");
            paramJSONObject = new HashMap();
            paramJSONObject.put("errCode", Integer.valueOf(12005));
            paramc.M(paramInt, j("fail:wifi is disable", paramJSONObject));
            AppMethodBeat.o(94371);
          }
          else if (paramc.asD() != b.gWt)
          {
            ab.e("MicroMsg.JsApiConenctWifi", "current state :%s isn't foreground", new Object[] { paramc.asD() });
            paramJSONObject = new HashMap();
            paramJSONObject.put("errCode", Integer.valueOf(12011));
            paramc.M(paramInt, j("fail:weapp in background", paramJSONObject));
            AppMethodBeat.o(94371);
          }
          else
          {
            Object localObject2 = (com.tencent.luggage.c.a.a)e.B(com.tencent.luggage.c.a.a.class);
            localObject1 = ((com.tencent.luggage.c.a.a)localObject2).av((Context)localObject1);
            al.d(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(94367);
                paramc.asF().b(this.ida);
                AppMethodBeat.o(94367);
              }
            });
            com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(new a.2(this, (j)localObject1, (com.tencent.luggage.c.a.a)localObject2, paramc, paramInt));
            localObject2 = new a.3(this, paramc);
            g.a(paramc.getAppId(), (g.c)localObject2);
            localObject2 = paramJSONObject.optString("SSID");
            localObject1 = paramJSONObject.optString("BSSID");
            paramJSONObject = paramJSONObject.optString("password");
            if (((String)localObject2).equals(""))
            {
              ab.e("MicroMsg.JsApiConenctWifi", "params is invalid");
              paramJSONObject = new HashMap();
              paramJSONObject.put("errCode", Integer.valueOf(12008));
              paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
              AppMethodBeat.o(94371);
            }
            else
            {
              ab.i("MicroMsg.JsApiConenctWifi", "ssid:%s, bSsid:%s is connecting", new Object[] { localObject2, localObject1 });
              com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.D((String)localObject2, (String)localObject1, paramJSONObject);
              AppMethodBeat.o(94371);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.a
 * JD-Core Version:    0.6.2
 */