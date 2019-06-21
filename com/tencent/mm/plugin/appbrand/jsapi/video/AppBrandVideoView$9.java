package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class AppBrandVideoView$9
  implements d.f
{
  AppBrandVideoView$9(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void es(boolean paramBoolean)
  {
    AppMethodBeat.i(126451);
    k localk;
    int i;
    if (paramBoolean)
      if (AppBrandVideoView.b(this.hZx).isPlaying())
      {
        AppBrandVideoView.c(this.hZx).show();
        if (AppBrandVideoView.d(this.hZx) == null)
          break label171;
        localk = AppBrandVideoView.d(this.hZx);
        i = AppBrandVideoView.e(this.hZx);
      }
    while (true)
    {
      try
      {
        ab.i("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", new Object[] { Boolean.valueOf(paramBoolean) });
        JSONObject localJSONObject = localk.aFV();
        localJSONObject.put("showDanmu", paramBoolean);
        localJSONObject.put("videoPlayerId", i);
        k.b localb = new com/tencent/mm/plugin/appbrand/jsapi/video/k$b;
        localb.<init>((byte)0);
        localk.a(localb, localJSONObject);
        AppMethodBeat.o(126451);
        return;
        AppBrandVideoView.c(this.hZx).pause();
        break;
        AppBrandVideoView.c(this.hZx).hide();
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", new Object[] { localJSONException });
      }
      label171: AppMethodBeat.o(126451);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.9
 * JD-Core Version:    0.6.2
 */