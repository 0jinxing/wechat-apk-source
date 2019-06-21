package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.Context;
import android.os.Vibrator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class n extends a
{
  public static final int CTRL_INDEX = 230;
  public static final String NAME = "vibrateShort";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126435);
    ab.d("MicroMsg.JsApiVibrateShort", "JsApiVibrateShort services!");
    paramJSONObject = paramc.getContext();
    try
    {
      paramJSONObject = (Vibrator)paramJSONObject.getSystemService("vibrator");
      if (paramJSONObject == null);
      while (true)
      {
        paramc.M(paramInt, j("ok", null));
        AppMethodBeat.o(126435);
        return;
        paramJSONObject.vibrate(15L);
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
        ab.w("MicroMsg.JsApiVibrateShort", "vibrateShort exception %s", new Object[] { paramJSONObject.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.n
 * JD-Core Version:    0.6.2
 */