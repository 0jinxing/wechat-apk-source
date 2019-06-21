package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class b$10
  implements AppBrandLivePusherView.b
{
  b$10(b paramb, int paramInt, e parame)
  {
  }

  public final void a(int paramInt, String paramString, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(96101);
    ab.i("MicroMsg.JsApiInsertLivePusher", "onError, error:%s", new Object[] { Integer.valueOf(paramInt) });
    b.d locald = new b.d((byte)0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("errCode", paramInt);
      localJSONObject.put("errMsg", bo.nullAsNil(paramString));
      localJSONObject.put("livePusherId", this.hCN);
      if ((paramHashMap != null) && (!paramHashMap.isEmpty()))
      {
        paramString = new org/json/JSONObject;
        paramString.<init>(paramHashMap);
        localJSONObject.put("data", paramString);
      }
      this.hCK.b(locald.AM(localJSONObject.toString()));
      AppMethodBeat.o(96101);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertLivePusher", "onError fail", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.10
 * JD-Core Version:    0.6.2
 */