package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class d extends c
{
  private static final int CTRL_INDEX = 363;
  public static final String NAME = "operateLivePusher";

  public final boolean aCE()
  {
    return true;
  }

  public final boolean b(e parame, int paramInt, View paramView, JSONObject paramJSONObject, g paramg)
  {
    AppMethodBeat.i(96115);
    ab.i("MicroMsg.JsApiOperateLivePusher", "onOperateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96115);
    }
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      localObject = (View)((CoverViewContainer)paramView).ah(View.class);
      if ((localObject instanceof AppBrandLivePusherView))
        break;
      ab.e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
      AppMethodBeat.o(96115);
    }
    Object localObject = (AppBrandLivePusherView)localObject;
    String str = paramJSONObject.optString("type");
    ab.i("MicroMsg.JsApiOperateLivePusher", "onOperateView operateType=%s", new Object[] { str });
    if (str.equalsIgnoreCase("snapshot"))
    {
      ((AppBrandLivePusherView)localObject).setSnapshotListener(new d.2(this, paramg, parame));
      if (!((AppBrandLivePusherView)localObject).b("snapshot", null))
        paramg.AR(j("fail:snapshot error", null));
    }
    while (true)
    {
      bool = super.b(parame, paramInt, paramView, paramJSONObject, paramg);
      AppMethodBeat.o(96115);
      break;
      if (str.equalsIgnoreCase("playBGM"))
      {
        str = paramJSONObject.optString("url");
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, url is nil");
          paramg.AR(j("fail:url is nil", null));
        }
        else
        {
          b.a(parame, str, null, new d.1(this, (AppBrandLivePusherView)localObject, str));
          paramg.AR(j("ok", null));
        }
      }
      else if (((AppBrandLivePusherView)localObject).b(str, paramJSONObject))
      {
        paramg.AR(j("ok", null));
      }
      else
      {
        paramg.AR(j("fail", null));
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96114);
    int i = paramJSONObject.optInt("livePusherId");
    AppMethodBeat.o(96114);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.d
 * JD-Core Version:    0.6.2
 */