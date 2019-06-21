package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static f Hl(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(88876);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardMallItemParser", "parseCardMallItem jsonContent is null");
      AppMethodBeat.o(88876);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new com/tencent/mm/plugin/card/model/f;
        paramString.<init>();
        paramString.kdj = localJSONObject.optString("empty_tips");
        paramString.kdk = localJSONObject.optString("shoppingmall_title");
        paramString.kdl = localJSONObject.optString("shoppingmall_url");
        if (localJSONObject.optInt("is_show") == 0);
        for (boolean bool = false; ; bool = true)
        {
          paramString.kdm = bool;
          AppMethodBeat.o(88876);
          break;
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardMallItemParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88876);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.i
 * JD-Core Version:    0.6.2
 */