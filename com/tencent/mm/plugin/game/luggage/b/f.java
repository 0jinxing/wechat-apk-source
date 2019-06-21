package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.b;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public class f extends bc<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135871);
    ab.i("MicroMsg.JsApiGetGameCommInfo", "invoke");
    paramString = i.bQ(paramString);
    if (paramString == null)
    {
      ab.e("MicroMsg.JsApiGetGameCommInfo", "data is null");
      parama.d("invalid_data", null);
      AppMethodBeat.o(135871);
    }
    while (true)
    {
      return;
      int i = paramString.optInt("cmd", 0);
      String str = paramString.optString("param");
      if (i == 10002)
        paramContext = new JSONObject();
      try
      {
        paramContext.put("webpageCount", 1);
        label82: parama.d(null, paramContext);
        AppMethodBeat.o(135871);
        continue;
        paramString = new gu();
        paramString.cBw.Cn = i;
        paramString.cBw.cBy = str;
        paramString.cBw.context = paramContext;
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        try
        {
          paramContext = new org/json/JSONObject;
          paramContext.<init>(paramString.cBx.result);
          parama.d(null, paramContext);
          AppMethodBeat.o(135871);
        }
        catch (JSONException paramContext)
        {
          parama.d(null, null);
          AppMethodBeat.o(135871);
        }
      }
      catch (JSONException paramString)
      {
        break label82;
      }
    }
  }

  public final void b(com.tencent.luggage.d.a<e>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "getGameCommInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.f
 * JD-Core Version:    0.6.2
 */