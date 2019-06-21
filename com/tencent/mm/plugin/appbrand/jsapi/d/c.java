package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.r.m;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 70;
  public static final String NAME = "hideKeyboard";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(123527);
    Object localObject = null;
    try
    {
      int i = paramJSONObject.getInt("inputId");
      paramJSONObject = Integer.valueOf(i);
      m.runOnUiThread(new c.1(this, paramc, paramJSONObject, paramInt));
      AppMethodBeat.o(123527);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
        paramJSONObject = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.c
 * JD-Core Version:    0.6.2
 */