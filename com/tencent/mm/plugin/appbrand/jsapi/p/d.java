package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

public final class d extends a
{
  public static final int CTRL_INDEX = 491;
  public static final String NAME = "enableDeviceMotionChangeListening";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126377);
    l locall = new l();
    paramJSONObject = locall.a(paramc, paramJSONObject, new d.1(this, paramc, paramc, locall), "JsApi#SensorDeviceMotion" + paramc.hashCode(), new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(3) })));
    paramc.M(paramInt, j(paramJSONObject.aIm, paramJSONObject.values));
    AppMethodBeat.o(126377);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.d
 * JD-Core Version:    0.6.2
 */