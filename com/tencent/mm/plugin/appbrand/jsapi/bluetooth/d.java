package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 181;
  private static final String NAME = "closeBLEConnection";

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, final int paramInt)
  {
    AppMethodBeat.i(94182);
    c.kT(91);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiCloseBLEConnection", "JsApiCloseBLEConnection data is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10013));
      paramc.M(paramInt, j("fail:invalid data", paramJSONObject));
      c.cZ(93, 94);
      AppMethodBeat.o(94182);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiCloseBLEConnection", "appId:%s closeBLEConnection data %s", new Object[] { paramc.getAppId(), paramJSONObject.toString() });
      b localb = a.AT(paramc.getAppId());
      if (localb == null)
      {
        ab.e("MicroMsg.JsApiCloseBLEConnection", "bleWorker is null, may not open ble");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10000));
        paramc.M(paramInt, j("fail:not init", paramJSONObject));
        c.cZ(93, 96);
        AppMethodBeat.o(94182);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        ab.e("MicroMsg.JsApiCloseBLEConnection", "adapter is null or not enabled!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10001));
        paramc.M(paramInt, j("fail:not available", paramJSONObject));
        c.cZ(93, 98);
        AppMethodBeat.o(94182);
      }
      else
      {
        String str = paramJSONObject.optString("deviceId");
        boolean bool1 = paramJSONObject.optBoolean("debug", false);
        boolean bool2 = paramJSONObject.optBoolean("mainThread", true);
        boolean bool3 = paramJSONObject.optBoolean("serial", true);
        paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.a();
        paramJSONObject.aJe = bool1;
        paramJSONObject.hDP = bool2;
        paramJSONObject.hDR = bool3;
        localb.a(str, paramJSONObject, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b()
        {
          public final void a(j paramAnonymousj)
          {
            AppMethodBeat.i(94181);
            switch (paramAnonymousj.errCode)
            {
            default:
              HashMap localHashMap = new HashMap();
              localHashMap.put("errCode", Integer.valueOf(paramAnonymousj.errCode));
              paramc.M(paramInt, d.this.j(paramAnonymousj.aIm, localHashMap));
              c.kT(93);
              AppMethodBeat.o(94181);
            case 0:
            }
            while (true)
            {
              return;
              paramAnonymousj = new HashMap();
              paramAnonymousj.put("errCode", Integer.valueOf(0));
              paramc.M(paramInt, d.this.j("ok", paramAnonymousj));
              c.kT(92);
              AppMethodBeat.o(94181);
            }
          }
        });
        AppMethodBeat.o(94182);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d
 * JD-Core Version:    0.6.2
 */