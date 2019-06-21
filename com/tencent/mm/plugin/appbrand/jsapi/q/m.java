package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.Context;
import android.os.Vibrator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class m extends a
{
  public static final int CTRL_INDEX = 231;
  public static final String NAME = "vibrateLong";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126434);
    ab.d("MicroMsg.JsApiVibrateLong", "JsApiVibrateLong!");
    paramJSONObject = (Vibrator)paramc.getContext().getSystemService("vibrator");
    if (paramJSONObject != null)
      paramJSONObject.vibrate(400L);
    paramc.M(paramInt, j("ok", null));
    AppMethodBeat.o(126434);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.m
 * JD-Core Version:    0.6.2
 */