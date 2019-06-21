package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  private static final int CTRL_INDEX = 367;
  public static final String NAME = "operateLivePlayer";

  public final boolean aCE()
  {
    return true;
  }

  public final boolean b(e parame, int paramInt, View paramView, JSONObject paramJSONObject, g paramg)
  {
    int i = 1;
    int j = 0;
    boolean bool = false;
    AppMethodBeat.i(96111);
    ab.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96111);
    }
    Object localObject2;
    while (true)
    {
      return bool;
      localObject1 = (View)((CoverViewContainer)paramView).ah(View.class);
      if (!(localObject1 instanceof AppBrandLivePlayerView))
      {
        ab.e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
        AppMethodBeat.o(96111);
      }
      else
      {
        localObject1 = (AppBrandLivePlayerView)localObject1;
        localObject2 = paramJSONObject.optString("type");
        ab.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView operateType=%s", new Object[] { localObject2 });
        if (!((String)localObject2).equalsIgnoreCase("snapshot"))
          break;
        ((AppBrandLivePlayerView)localObject1).setSnapshotListener(new c.1(this, paramg, parame));
        if (!((AppBrandLivePlayerView)localObject1).Bc("snapshot"))
          paramg.AR(j("fail:snapshot error", null));
        bool = super.b(parame, paramInt, paramView, paramJSONObject, paramg);
        AppMethodBeat.o(96111);
      }
    }
    if (((String)localObject2).equalsIgnoreCase("requestFullScreen"))
    {
      localObject2 = paramJSONObject.optJSONArray("data");
      if ((localObject2 == null) || (((JSONArray)localObject2).length() == 0))
      {
        ab.w("MicroMsg.JsApiOperateLivePlayer", "onOperateView directionArr nil");
        j = 0;
        label245: ab.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", new Object[] { Integer.valueOf(j) });
        if (((AppBrandLivePlayerView)localObject1).hLc != null)
          break label318;
        ab.w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
        j = 0;
        label282: if (j == 0)
          break label377;
      }
      label318: label377: for (localObject1 = "ok"; ; localObject1 = "fail")
      {
        paramg.AR(j((String)localObject1, null));
        break;
        j = ((JSONArray)localObject2).optInt(0, 0);
        break label245;
        if (((AppBrandLivePlayerView)localObject1).hLc.isFullScreen())
        {
          ab.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
          j = i;
          break label282;
        }
        ((AppBrandLivePlayerView)localObject1).hLc.on(j);
        ((AppBrandLivePlayerView)localObject1).hLe = j;
        ((AppBrandLivePlayerView)localObject1).dZ(true);
        j = i;
        break label282;
      }
    }
    if (((String)localObject2).equalsIgnoreCase("exitFullScreen"))
    {
      ab.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
      if (((AppBrandLivePlayerView)localObject1).hLc == null)
      {
        ab.w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
        label416: if (j == 0)
          break label482;
      }
      label482: for (localObject1 = "ok"; ; localObject1 = "fail")
      {
        paramg.AR(j((String)localObject1, null));
        break;
        if (!((AppBrandLivePlayerView)localObject1).hLc.isFullScreen())
        {
          ab.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
          j = 1;
          break label416;
        }
        ((AppBrandLivePlayerView)localObject1).hLc.aDF();
        j = 1;
        break label416;
      }
    }
    if (((AppBrandLivePlayerView)localObject1).Bc((String)localObject2));
    for (Object localObject1 = "ok"; ; localObject1 = "fail")
    {
      paramg.AR(j((String)localObject1, null));
      break;
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96110);
    int i = paramJSONObject.optInt("livePlayerId");
    AppMethodBeat.o(96110);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.c
 * JD-Core Version:    0.6.2
 */