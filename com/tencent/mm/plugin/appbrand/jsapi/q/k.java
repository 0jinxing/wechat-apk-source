package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class k extends a
{
  public static final int CTRL_INDEX = 229;
  public static final String NAME = "setScreenBrightness";
  float hXJ = (0.0F / 0.0F);
  float hXK;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126432);
    ab.d("MicroMsg.JsApiSetScreenBrightness", "JsApiSetScreenBrightness!");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiSetScreenBrightness", "data is null");
      AppMethodBeat.o(126432);
    }
    while (true)
    {
      return;
      if (!(paramc.getContext() instanceof Activity))
      {
        ab.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
        paramc.M(paramInt, j("fail:context is not activity", null));
        AppMethodBeat.o(126432);
      }
      else
      {
        al.d(new k.1(this, paramJSONObject, paramc, paramInt));
        AppMethodBeat.o(126432);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.k
 * JD-Core Version:    0.6.2
 */