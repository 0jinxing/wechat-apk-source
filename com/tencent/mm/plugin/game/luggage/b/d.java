package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.b.b;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

public class d extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135869);
    ab.i("MicroMsg.JsApiClearGameData", "invokeInMM");
    paramContext = i.bQ(paramString);
    if (paramContext == null)
    {
      ab.e("MicroMsg.JsApiClearGameData", "data is null");
      parama.d("null_data", null);
      AppMethodBeat.o(135869);
    }
    while (true)
    {
      return;
      paramString = paramContext.optString("preVerifyAppId");
      if (bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.JsApiClearGameData", "appId is null");
        parama.d("appid_null", null);
        AppMethodBeat.o(135869);
      }
      else
      {
        JSONArray localJSONArray = paramContext.optJSONArray("keys");
        boolean bool = paramContext.optBoolean("clearAllData", false);
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          b.cWi().b(paramString, localJSONArray);
          parama.d(null, null);
          AppMethodBeat.o(135869);
        }
        else if (bool)
        {
          b.cWi().adY(paramString);
          parama.d(null, null);
          AppMethodBeat.o(135869);
        }
        else
        {
          ab.i("MicroMsg.JsApiClearGameData", "keys is null");
          parama.d("fail", null);
          AppMethodBeat.o(135869);
        }
      }
    }
  }

  public final void b(a<e>.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "clearGameData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.d
 * JD-Core Version:    0.6.2
 */