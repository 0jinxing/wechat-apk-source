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
import org.json.JSONObject;

public class q extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135888);
    ab.i("MicroMsg.JsApiSetGameData", "invokeInMM");
    JSONObject localJSONObject = i.bQ(paramString);
    if (localJSONObject == null)
    {
      ab.e("MicroMsg.JsApiSetGameData", "data is null");
      parama.d("null_data", null);
      AppMethodBeat.o(135888);
    }
    while (true)
    {
      return;
      String str1 = localJSONObject.optString("preVerifyAppId");
      if (bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.JsApiSetGameData", "appId is null");
        parama.d("appid_null", null);
        AppMethodBeat.o(135888);
      }
      else
      {
        String str2 = localJSONObject.optString("key");
        paramContext = localJSONObject.optString("value");
        paramString = localJSONObject.optString("weight", "1");
        String str3 = localJSONObject.optString("expireTime");
        boolean bool = localJSONObject.optBoolean("autoClean", true);
        if ((bo.isNullOrNil(str2)) || (bo.isNullOrNil(paramContext)))
        {
          ab.i("MicroMsg.JsApiSetGameData", "key or value is null");
          parama.d("null_key", null);
          AppMethodBeat.o(135888);
        }
        else if (b.cWi().a(str1, str2, paramContext, paramString, str3, bool))
        {
          parama.d(null, null);
          AppMethodBeat.o(135888);
        }
        else
        {
          parama.d("exceed_size", null);
          AppMethodBeat.o(135888);
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
    return "setGameData";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.q
 * JD-Core Version:    0.6.2
 */