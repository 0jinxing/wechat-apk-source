package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.h;
import org.json.JSONException;
import org.json.JSONObject;

public class i extends a<h>
{
  private static final int CTRL_INDEX = 112;
  private static final String NAME = "updateInput";

  public void a(u paramu, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(123562);
    h localh = new h();
    if (!a(localh, paramJSONObject, paramu, paramInt))
      AppMethodBeat.o(123562);
    while (true)
    {
      return;
      try
      {
        int i = paramJSONObject.getInt("inputId");
        if ((localh.jjp != null) && (localh.jjp.intValue() < 0))
          localh.jjp = Integer.valueOf(0);
        if ((localh.jjq != null) && (localh.jjq.intValue() < 0))
          localh.jjq = Integer.valueOf(0);
        paramJSONObject = paramJSONObject.optString("data", null);
        if (paramJSONObject != null)
          S(i, paramJSONObject);
        com.tencent.mm.plugin.appbrand.r.m.runOnUiThread(new i.1(this, paramu, i, localh, paramInt));
        AppMethodBeat.o(123562);
      }
      catch (JSONException paramJSONObject)
      {
        paramu.M(paramInt, j("fail:invalid data", null));
        AppMethodBeat.o(123562);
      }
    }
  }

  protected final boolean aDx()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.i
 * JD-Core Version:    0.6.2
 */