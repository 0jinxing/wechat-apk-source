package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h extends a
{
  public static final int CTRL_INDEX = 535;
  public static final String NAME = "getVolume";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126417);
    ab.i("MicroMsg.JsApiGetVolume", "invoke JsApiGetVolume!");
    if (paramc == null)
    {
      ab.e("MicroMsg.JsApiGetVolume", "component is null");
      AppMethodBeat.o(126417);
    }
    while (true)
    {
      return;
      paramJSONObject = paramc.getContext();
      if (paramJSONObject == null)
      {
        ab.e("MicroMsg.JsApiGetVolume", "fail:context is null");
        paramc.M(paramInt, j("fail:context is null", null));
        AppMethodBeat.o(126417);
      }
      else if (!(paramJSONObject instanceof Activity))
      {
        ab.e("MicroMsg.JsApiGetVolume", "fail:context is not Activity");
        paramc.M(paramInt, j("fail:context is not Activity", null));
        AppMethodBeat.o(126417);
      }
      else
      {
        paramJSONObject = (AudioManager)paramJSONObject.getSystemService("audio");
        if (paramJSONObject == null)
        {
          ab.e("MicroMsg.JsApiGetVolume", "fail:manager is null");
          paramc.M(paramInt, j("fail:manager is null", null));
          AppMethodBeat.o(126417);
        }
        else
        {
          int i = paramJSONObject.getStreamVolume(3);
          int j = paramJSONObject.getStreamMaxVolume(3);
          ab.i("MicroMsg.JsApiGetVolume", "JsApiGetVolume %d/%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          paramJSONObject = new HashMap();
          paramJSONObject.put("currentVolume", Integer.valueOf(i));
          paramJSONObject.put("maxVolume", Integer.valueOf(j));
          paramc.M(paramInt, j("ok", paramJSONObject));
          AppMethodBeat.o(126417);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.h
 * JD-Core Version:    0.6.2
 */