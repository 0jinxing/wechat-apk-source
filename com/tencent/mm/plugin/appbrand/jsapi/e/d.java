package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

public class d<CONTEXT extends c> extends a<CONTEXT>
{
  private static final int CTRL_INDEX = 340;
  private static final String NAME = "enableLocationUpdate";
  protected volatile l hKK;

  public void c(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(93822);
    com.tencent.luggage.g.d.i("MicroMsg.AppBrand.JsApiEnableLocationUpdate", "enableLocationUpdate:%s", new Object[] { paramJSONObject });
    while (true)
    {
      boolean bool;
      try
      {
        if (this.hKK == null)
        {
          l locall = new com/tencent/mm/plugin/appbrand/jsapi/e/l;
          locall.<init>(paramCONTEXT);
          this.hKK = locall;
          this.hKK.start();
        }
        bool = paramJSONObject.optBoolean("enable");
        if ((!bool) && (!o(paramCONTEXT)))
        {
          paramCONTEXT.M(paramInt, j("ok", null));
          AppMethodBeat.o(93822);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(93822);
      }
      this.hKK.fPq = e(paramCONTEXT, paramJSONObject);
      if (!bool)
        break label182;
      if (o(paramCONTEXT))
        break;
      paramCONTEXT.M(paramInt, j("fail:system permission denied", null));
      AppMethodBeat.o(93822);
    }
    this.hKK.sendMessage(1);
    while (true)
    {
      paramCONTEXT.M(paramInt, j("ok", null));
      AppMethodBeat.o(93822);
      break;
      label182: this.hKK.sendMessage(2);
    }
  }

  protected Bundle e(CONTEXT paramCONTEXT, JSONObject paramJSONObject)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.d
 * JD-Core Version:    0.6.2
 */