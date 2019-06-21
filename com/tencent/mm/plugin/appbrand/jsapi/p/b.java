package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

public final class b extends a
{
  public static final int CTRL_INDEX = 92;
  public static final String NAME = "enableAccelerometer";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126371);
    l locall = new l();
    paramJSONObject = locall.a(paramc, paramJSONObject, new b.1(this, paramc, paramc, locall), "JsApi#SensorAccelerometer" + paramc.hashCode(), new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1) })));
    paramc.M(paramInt, j(paramJSONObject.aIm, paramJSONObject.values));
    AppMethodBeat.o(126371);
  }

  public static final class a extends ah
  {
    private static final int CTRL_INDEX = 93;
    private static final String NAME = "onAccelerometerChange";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.b
 * JD-Core Version:    0.6.2
 */