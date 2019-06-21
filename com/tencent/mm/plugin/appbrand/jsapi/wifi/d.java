package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a
{
  public static final int CTRL_INDEX = 314;
  public static final String NAME = "startWifi";
  public static boolean ide = false;
  public static BroadcastReceiver idf = null;

  public final void a(final c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94376);
    ab.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
    paramJSONObject = paramc.getContext();
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiStartWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramc.M(paramInt, j("fail:context is null", paramJSONObject));
      AppMethodBeat.o(94376);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cP(paramJSONObject);
      if (!ide)
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
        localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        localIntentFilter.setPriority(2147483647);
        idf = new BroadcastReceiver()
        {
          public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
          {
            AppMethodBeat.i(94374);
            if (paramAnonymousIntent == null)
              AppMethodBeat.o(94374);
            while (true)
            {
              return;
              paramAnonymousContext = paramAnonymousIntent.getAction();
              if (TextUtils.isEmpty(paramAnonymousContext))
              {
                AppMethodBeat.o(94374);
              }
              else
              {
                ab.i("MicroMsg.JsApiStartWifi", "actiong:%s", new Object[] { paramAnonymousContext });
                int i;
                if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousContext))
                {
                  i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
                  ab.i("MicroMsg.JsApiStartWifi", "wifiState".concat(String.valueOf(i)));
                }
                label100: int j;
                switch (i)
                {
                default:
                  if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousContext))
                    break label306;
                  paramAnonymousContext = paramAnonymousIntent.getParcelableExtra("networkInfo");
                  if (paramAnonymousContext == null)
                    break label306;
                  paramAnonymousContext = (NetworkInfo)paramAnonymousContext;
                  if (paramAnonymousContext.getState() == NetworkInfo.State.CONNECTED)
                  {
                    i = 1;
                    label137: if (paramAnonymousContext.getType() != 1)
                      break label213;
                    j = 1;
                  }
                  break;
                case 1:
                }
                while (true)
                {
                  while (true)
                  {
                    if ((i == 0) || (j == 0))
                      break label299;
                    b localb = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.aGy();
                    ab.i("MicroMsg.JsApiStartWifi", "[mWiFiEventReceiver]currentWifi:%s", new Object[] { localb });
                    if (localb == null)
                    {
                      ab.e("MicroMsg.JsApiStartWifi", "[CONNECTIVITY_ACTION]currentWIfi is null");
                      AppMethodBeat.o(94374);
                      break;
                      d.x(paramc);
                      break label100;
                      i = 0;
                      break label137;
                      label213: j = 0;
                      continue;
                    }
                    try
                    {
                      paramAnonymousIntent = new com/tencent/mm/plugin/appbrand/jsapi/wifi/a$a;
                      paramAnonymousIntent.<init>();
                      paramAnonymousContext = new java/util/HashMap;
                      paramAnonymousContext.<init>();
                      paramAnonymousContext.put("wifi", localb.toJSONObject());
                      paramAnonymousIntent.b(paramc, 0).t(paramAnonymousContext).aCj();
                      AppMethodBeat.o(94374);
                    }
                    catch (JSONException paramAnonymousContext)
                    {
                      ab.e("MicroMsg.JsApiStartWifi", "IConnectWiFiCallback is error");
                      ab.printErrStackTrace("MicroMsg.JsApiStartWifi", paramAnonymousContext, "", new Object[0]);
                      AppMethodBeat.o(94374);
                    }
                  }
                  break;
                }
                label299: d.x(paramc);
                label306: AppMethodBeat.o(94374);
              }
            }
          }
        };
        paramJSONObject.registerReceiver(idf, localIntentFilter);
        ide = true;
      }
      paramJSONObject = new d.2(this, paramJSONObject, paramc);
      g.a(paramc.getAppId(), paramJSONObject);
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(0));
      paramc.M(paramInt, j("ok", paramJSONObject));
      AppMethodBeat.o(94376);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.d
 * JD-Core Version:    0.6.2
 */