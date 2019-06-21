package com.tencent.mm.plugin.appbrand.jsapi.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.appbrand.s.a.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class b extends u
{
  public static final int CTRL_INDEX = 425;
  public static final String NAME = "getBatteryInfo";

  public final String b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126405);
    paramJSONObject = a.iRU.aOb();
    paramc = new HashMap();
    paramc.put("level", Integer.valueOf(paramJSONObject.iSe));
    paramc.put("isCharging", Boolean.valueOf(paramJSONObject.iSd));
    paramc = j("ok", paramc);
    AppMethodBeat.o(126405);
    return paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.b
 * JD-Core Version:    0.6.2
 */