package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class k$a extends JSONObject
{
  public k$a(Object paramObject)
  {
    AppMethodBeat.i(8202);
    if ((paramObject instanceof String))
    {
      put("type", 1);
      put("val", paramObject);
      AppMethodBeat.o(8202);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        put("type", 2);
        put("val", paramObject);
        AppMethodBeat.o(8202);
      }
      else if ((paramObject instanceof Long))
      {
        put("type", 3);
        put("val", paramObject);
        AppMethodBeat.o(8202);
      }
      else if ((paramObject instanceof Boolean))
      {
        put("type", 4);
        put("val", paramObject);
        AppMethodBeat.o(8202);
      }
      else
      {
        ab.w("MicroMsg.WebViewBagIntentLogic", "put not support type;class:%s", new Object[] { paramObject.getClass() });
        put("type", 0);
        put("val", paramObject);
        AppMethodBeat.o(8202);
      }
    }
  }

  static void a(Bundle paramBundle, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(8203);
    try
    {
      int i = paramJSONObject.getInt("type");
      ab.i("MicroMsg.WebViewBagIntentLogic", "restoreToBundle key:%s type：%d", new Object[] { paramString, Integer.valueOf(i) });
      switch (i)
      {
      default:
        ab.w("MicroMsg.WebViewBagIntentLogic", "not support type");
        AppMethodBeat.o(8203);
      case 1:
        while (true)
        {
          return;
          paramBundle.putString(paramString, paramJSONObject.getString("val"));
          AppMethodBeat.o(8203);
        }
      case 2:
      case 3:
      case 4:
      }
    }
    catch (JSONException paramBundle)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewBagIntentLogic", "restoreToBundle e:%s", new Object[] { paramBundle });
        AppMethodBeat.o(8203);
        continue;
        paramBundle.putInt(paramString, paramJSONObject.getInt("val"));
        AppMethodBeat.o(8203);
        continue;
        paramBundle.putLong(paramString, paramJSONObject.getLong("val"));
        AppMethodBeat.o(8203);
        continue;
        paramBundle.putBoolean(paramString, paramJSONObject.getBoolean("val"));
        AppMethodBeat.o(8203);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.k.a
 * JD-Core Version:    0.6.2
 */