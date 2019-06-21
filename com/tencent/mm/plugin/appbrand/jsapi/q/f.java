package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f extends a
{
  public static final int CTRL_INDEX = 232;
  public static final String NAME = "getScreenBrightness";

  private static float cL(Context paramContext)
  {
    AppMethodBeat.i(126414);
    paramContext = paramContext.getContentResolver();
    float f = 0.0F;
    try
    {
      int i = Settings.System.getInt(paramContext, "screen_brightness");
      f = i / 255.0F;
      AppMethodBeat.o(126414);
      return f;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      while (true)
        ab.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", new Object[] { paramContext.getMessage() });
    }
    catch (IllegalArgumentException paramContext)
    {
      while (true)
        ab.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent IllegalArgumentException: %s", new Object[] { paramContext.getMessage() });
    }
    catch (Exception paramContext)
    {
      while (true)
        ab.e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", new Object[] { paramContext.getMessage() });
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126413);
    ab.d("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness!");
    Context localContext = paramc.getContext();
    if (localContext == null)
    {
      paramc.M(paramInt, j("fail", null));
      ab.e("MicroMsg.JsApiGetScreenBrightness", "context is null, invoke fail!");
      AppMethodBeat.o(126413);
    }
    while (true)
    {
      return;
      if (!(localContext instanceof Activity))
      {
        paramc.M(paramInt, j("fail", null));
        ab.e("MicroMsg.JsApiGetScreenBrightness", "context is not Activity, invoke fail!");
        AppMethodBeat.o(126413);
      }
      else
      {
        paramJSONObject = ((Activity)localContext).getWindow().getAttributes();
        float f1 = paramJSONObject.screenBrightness;
        float f2 = f1;
        if (f1 < 0.0F)
          f2 = cL(localContext);
        ab.i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", new Object[] { Float.valueOf(f2), Float.valueOf(paramJSONObject.screenBrightness) });
        paramJSONObject = new HashMap();
        paramJSONObject.put("value", Float.valueOf(f2));
        paramc.M(paramInt, j("ok", paramJSONObject));
        AppMethodBeat.o(126413);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.f
 * JD-Core Version:    0.6.2
 */