package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class e extends b
{
  private static final int CTRL_INDEX = 366;
  public static final String NAME = "removeLivePlayer";

  public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96117);
    super.b(parame, paramInt, paramView, paramJSONObject);
    ab.i("MicroMsg.JsApiRemoveLivePlayer", "onRemoveView livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiRemoveLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96117);
      bool = false;
    }
    while (true)
    {
      return bool;
      parame = (View)((CoverViewContainer)paramView).ah(View.class);
      if (!(parame instanceof AppBrandLivePlayerView))
      {
        ab.e("MicroMsg.JsApiRemoveLivePlayer", "targetView not AppBrandLivePlayerView");
        AppMethodBeat.o(96117);
        bool = false;
      }
      else
      {
        ((AppBrandLivePlayerView)parame).onExit();
        AppMethodBeat.o(96117);
        bool = true;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96116);
    int i = paramJSONObject.optInt("livePlayerId");
    AppMethodBeat.o(96116);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.e
 * JD-Core Version:    0.6.2
 */