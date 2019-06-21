package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lw;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public class k extends bc<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135879);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int i = localJSONObject.optInt("jumpView");
      int j = localJSONObject.optInt("jumpType");
      ab.i("MicroMsg.JsApiOpenGameCenter", "jumpView = %d, jumpType = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      localJSONObject = localJSONObject.optJSONObject("extInfo");
      paramString = new lw();
      paramString.cHK.cHL = i;
      paramString.cHK.jumpType = j;
      if (localJSONObject != null)
        paramString.cHK.extraInfo = localJSONObject.toString();
      paramString.cHK.context = paramContext;
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      parama.d(null, null);
      AppMethodBeat.o(135879);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiOpenGameCenter", "json parse exception");
        parama.d("fail", null);
        AppMethodBeat.o(135879);
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<e>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "openGameCenter";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.k
 * JD-Core Version:    0.6.2
 */