package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class q extends b
{
  public static final int CTRL_INDEX = 3;
  public static final String NAME = "removeMap";

  public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93868);
    boolean bool;
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiRemoveMap", "data is null");
      bool = false;
      AppMethodBeat.o(93868);
      return bool;
    }
    com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(6);
    if (g.ck(parame.getAppId(), f.g(parame, paramJSONObject)))
      com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(7);
    while (true)
    {
      bool = true;
      AppMethodBeat.o(93868);
      break;
      com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(8);
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93867);
    int i = f.B(paramJSONObject);
    AppMethodBeat.o(93867);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.q
 * JD-Core Version:    0.6.2
 */