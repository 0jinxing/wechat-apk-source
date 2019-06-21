package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePlayListener;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class a$8
  implements ITXLivePlayListener
{
  a$8(a parama, int paramInt, e parame)
  {
  }

  public final void onNetStatus(Bundle paramBundle)
  {
    AppMethodBeat.i(96080);
    a.b localb = new a.b((byte)0);
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2;
    try
    {
      localJSONObject1.put("livePlayerId", this.hCN);
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
      this.hCK.b(localb.AM(localJSONObject1.toString()));
      AppMethodBeat.o(96080);
      return;
      localJSONObject1.put("info", localJSONObject2);
    }
  }

  public final void onPlayEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(96079);
    ab.i("MicroMsg.JsApiInsertLivePlayer", "onPlayEvent errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    a.c localc = new a.c((byte)0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("errCode", paramInt);
      localJSONObject.put("errMsg", paramBundle.getString("EVT_MSG"));
      localJSONObject.put("livePlayerId", this.hCN);
      label76: this.hCK.b(localc.AM(localJSONObject.toString()));
      AppMethodBeat.o(96079);
      return;
    }
    catch (JSONException paramBundle)
    {
      break label76;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.8
 * JD-Core Version:    0.6.2
 */