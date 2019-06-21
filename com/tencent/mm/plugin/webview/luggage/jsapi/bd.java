package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class bd<T extends d> extends bc<T>
{
  public final void a(a<T>.a parama)
  {
    JSONObject localJSONObject = parama.bPa.bOf;
    String str = ((d)parama.bOZ).getUrl();
    Object localObject1 = ((d)parama.bOZ).cWM();
    if (localObject1 != null);
    label140: Object localObject2;
    for (localObject1 = ((LuggageGetA8Key)localObject1).aek(str); ; localObject2 = null)
    {
      if (bo.isNullOrNil((String)localObject1))
        localObject1 = str;
      while (true)
      {
        GameWebPerformanceInfo.kU(((d)parama.bOZ).cWL()).eBQ = 1;
        try
        {
          localJSONObject.put("currentUrl", str);
          localJSONObject.put("shareUrl", localObject1);
          localJSONObject.put("preVerifyAppId", ((d)parama.bOZ).uij.getAppId());
          if (getClass().getName().equals(ap.class.getName()))
          {
            localJSONObject.put("sendAppMessageScene", ap.cXn());
            ap.cXo();
          }
          super.a(parama);
          return;
        }
        catch (JSONException localJSONException)
        {
          break label140;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.bd
 * JD-Core Version:    0.6.2
 */