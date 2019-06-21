package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import org.json.JSONException;
import org.json.JSONObject;

final class a$7
  implements AppBrandLivePlayerView.c
{
  a$7(a parama, int paramInt, e parame)
  {
  }

  public final void i(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(96078);
    a.a locala = new a.a((byte)0);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fullScreen", paramBoolean);
      localJSONObject.put("direction", paramInt);
      localJSONObject.put("livePlayerId", this.hCN);
      label53: this.hCK.b(locala.AM(localJSONObject.toString()));
      AppMethodBeat.o(96078);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label53;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.7
 * JD-Core Version:    0.6.2
 */