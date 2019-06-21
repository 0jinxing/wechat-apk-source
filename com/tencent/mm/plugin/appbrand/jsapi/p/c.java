package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import com.tencent.mm.plugin.appbrand.s.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 94;
  public static final String NAME = "enableCompass";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126374);
    l locall = new l();
    paramJSONObject = locall.a(paramc, paramJSONObject, new c.1(this, paramc, paramc, locall), "JsApi#SensorMagneticField" + paramc.hashCode(), new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(1) })));
    paramc.M(paramInt, j(paramJSONObject.aIm, paramJSONObject.values));
    AppMethodBeat.o(126374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.c
 * JD-Core Version:    0.6.2
 */