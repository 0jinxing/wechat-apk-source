package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePushListener;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class b$8
  implements ITXLivePushListener
{
  b$8(b paramb, int paramInt, e parame)
  {
  }

  public final void onNetStatus(Bundle paramBundle)
  {
    AppMethodBeat.i(96097);
    b.e locale = new b.e((byte)0);
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2;
    try
    {
      localJSONObject1.put("livePusherId", this.hCN);
      localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      if (paramBundle != null)
      {
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localJSONObject2.put(str, paramBundle.get(str));
        }
      }
    }
    catch (JSONException paramBundle)
    {
    }
    while (true)
    {
      this.hCK.b(locale.AM(localJSONObject1.toString()));
      AppMethodBeat.o(96097);
      return;
      localJSONObject1.put("info", localJSONObject2);
    }
  }

  public final void onPushEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(96096);
    ab.i("MicroMsg.JsApiInsertLivePusher", "onPushEvent errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    b.f localf = new b.f((byte)0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("errCode", paramInt);
      localJSONObject.put("errMsg", paramBundle.getString("EVT_MSG"));
      localJSONObject.put("livePusherId", this.hCN);
      label76: this.hCK.b(localf.AM(localJSONObject.toString()));
      AppMethodBeat.o(96096);
      return;
    }
    catch (JSONException paramBundle)
    {
      break label76;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.8
 * JD-Core Version:    0.6.2
 */