package com.tencent.mm.plugin.game.luggage.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.wepkg.model.g.a;
import org.json.JSONException;
import org.json.JSONObject;

final class h$1$1
  implements g.a
{
  h$1$1(h.1 param1)
  {
  }

  public final void U(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(135873);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("wepkg_info", paramJSONObject);
      label21: this.mUd.kOx.d(null, localJSONObject);
      AppMethodBeat.o(135873);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      break label21;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.h.1.1
 * JD-Core Version:    0.6.2
 */