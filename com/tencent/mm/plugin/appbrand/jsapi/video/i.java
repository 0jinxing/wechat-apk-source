package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class i extends b
{
  private static final int CTRL_INDEX = 7;
  public static final String NAME = "removeVideoPlayer";

  public final boolean b(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126567);
    ab.i("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiRemoveVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126567);
      bool = false;
    }
    while (true)
    {
      return bool;
      AppBrandVideoView localAppBrandVideoView = (AppBrandVideoView)((CoverViewContainer)paramView).ah(AppBrandVideoView.class);
      if (localAppBrandVideoView == null)
      {
        ab.w("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView not AppBrandVideoView");
        AppMethodBeat.o(126567);
        bool = false;
      }
      else
      {
        al.d(new i.1(this, localAppBrandVideoView));
        super.b(parame, paramInt, paramView, paramJSONObject);
        AppMethodBeat.o(126567);
        bool = true;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126566);
    int i = paramJSONObject.optInt("videoPlayerId", 0);
    AppMethodBeat.o(126566);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.i
 * JD-Core Version:    0.6.2
 */