package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.b.b;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135872);
    ab.i("MicroMsg.JsApiGetGameData", "invokeInMM");
    paramString = i.bQ(paramString);
    if (paramString == null)
    {
      ab.e("MicroMsg.JsApiGetGameData", "data is null");
      parama.d("null_data", null);
      AppMethodBeat.o(135872);
    }
    while (true)
    {
      return;
      paramContext = paramString.optString("preVerifyAppId");
      if (bo.isNullOrNil(paramContext))
      {
        ab.i("MicroMsg.JsApiGetGameData", "appId is null");
        parama.d("appid_null", null);
        AppMethodBeat.o(135872);
        continue;
      }
      paramString = paramString.optString("key");
      if (bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.JsApiGetGameData", "key is null");
        parama.d("null_key", null);
        AppMethodBeat.o(135872);
        continue;
      }
      paramString = b.cWi().gV(paramContext, paramString);
      if (!bo.isNullOrNil(paramString.field_value))
        paramContext = new JSONObject();
      try
      {
        paramContext.put("value", paramString.field_value);
        paramContext.put("weight", paramString.field_weight);
        paramContext.put("expireTime", paramString.field_expireTime - System.currentTimeMillis() / 1000L);
        label181: parama.d(null, paramContext);
        AppMethodBeat.o(135872);
        continue;
        parama.d(null, null);
        AppMethodBeat.o(135872);
      }
      catch (JSONException paramString)
      {
        break label181;
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
    return "getGameData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.g
 * JD-Core Version:    0.6.2
 */