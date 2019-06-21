package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Bundle;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class g<CONTEXT extends c> extends a<CONTEXT>
{
  public static final int CTRL_INDEX = 37;
  public static final String NAME = "getLocation";

  protected void aDD()
  {
  }

  public final void c(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93825);
    String str = paramJSONObject.optString("type", "wgs84");
    if (bo.isNullOrNil(str))
      str = "wgs84";
    while (true)
    {
      boolean bool = paramJSONObject.optBoolean("altitude", false);
      ab.v("MicroMsg.JsApiGetLocation", "doGeoLocation, geoType = %s, needAltitude = %b", new Object[] { str, Boolean.valueOf(bool) });
      if ((!"wgs84".equals(str)) && (!"gcj02".equals(str)))
      {
        ab.e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", new Object[] { str });
        paramJSONObject = new HashMap(1);
        paramJSONObject.put("errCode", Integer.valueOf(-1));
        paramCONTEXT.M(paramInt, j("fail:invalid data", paramJSONObject));
        AppMethodBeat.o(93825);
      }
      while (true)
      {
        return;
        if (!o(paramCONTEXT))
        {
          paramJSONObject = new HashMap(1);
          paramJSONObject.put("errCode", Integer.valueOf(-2));
          paramCONTEXT.M(paramInt, j("fail:system permission denied", paramJSONObject));
          AppMethodBeat.o(93825);
        }
        else
        {
          p(paramCONTEXT);
          paramJSONObject = e(paramCONTEXT, paramJSONObject);
          ((com.tencent.mm.plugin.appbrand.s.b.a)e.B(com.tencent.mm.plugin.appbrand.s.b.a.class)).a(str, new g.1(this, paramCONTEXT, bool, paramInt), paramJSONObject);
          AppMethodBeat.o(93825);
        }
      }
    }
  }

  protected Bundle e(CONTEXT paramCONTEXT, JSONObject paramJSONObject)
  {
    return null;
  }

  protected void p(CONTEXT paramCONTEXT)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.g
 * JD-Core Version:    0.6.2
 */