package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.h;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class m extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 173;
  private static final String NAME = "openBluetoothAdapter";

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94203);
    c.kT(0);
    paramJSONObject = paramc.getAppId();
    ab.i("MicroMsg.JsApiOpenBluetoothAdapter", "appid:%s openBluetoothAdapter!", new Object[] { paramJSONObject });
    paramJSONObject = a.a(paramJSONObject, new b.a()
    {
      public final void dV(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(94194);
        m.c.a(paramc, paramAnonymousBoolean, false);
        AppMethodBeat.o(94194);
      }
    }
    , new h()
    {
      public final void ag(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(94195);
        m.b.a(paramc, paramAnonymousString, paramAnonymousBoolean);
        AppMethodBeat.o(94195);
      }
    }
    , new m.3(this, paramc));
    HashMap localHashMap = new HashMap();
    switch (paramJSONObject.errCode)
    {
    default:
      localHashMap.put("errCode", Integer.valueOf(paramJSONObject.errCode));
      paramc.M(paramInt, j(paramJSONObject.aIm, localHashMap));
      c.kT(2);
      AppMethodBeat.o(94203);
    case 0:
    case 10009:
    case 10001:
    }
    while (true)
    {
      return;
      paramc.M(paramInt, j("ok", localHashMap));
      c.kT(1);
      AppMethodBeat.o(94203);
      continue;
      localHashMap.put("errCode", Integer.valueOf(10009));
      paramc.M(paramInt, j("fail:system not support", localHashMap));
      c.cZ(2, 8);
      AppMethodBeat.o(94203);
      continue;
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramc.M(paramInt, j("fail:not available", localHashMap));
      c.cZ(2, 7);
      AppMethodBeat.o(94203);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m
 * JD-Core Version:    0.6.2
 */