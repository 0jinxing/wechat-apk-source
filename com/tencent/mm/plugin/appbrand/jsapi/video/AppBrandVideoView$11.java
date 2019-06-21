package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import org.json.JSONException;
import org.json.JSONObject;

final class AppBrandVideoView$11
  implements d.b
{
  AppBrandVideoView$11(AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void H(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126465);
    ab.i("MicroMsg.AppBrandVideoView", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    k localk;
    if (AppBrandVideoView.d(this.hZx) != null)
    {
      localk = AppBrandVideoView.d(this.hZx);
      localk.clean();
    }
    while (true)
    {
      try
      {
        JSONObject localJSONObject = localk.aFV();
        localJSONObject.put("errMsg", paramString);
        paramString = new com/tencent/mm/plugin/appbrand/jsapi/video/k$d;
        paramString.<init>((byte)0);
        localk.a(paramString, localJSONObject);
        AppMethodBeat.o(126465);
        return;
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "onError e=%s", new Object[] { paramString });
      }
      AppMethodBeat.o(126465);
    }
  }

  public final void aFq()
  {
    AppMethodBeat.i(126466);
    ab.i("MicroMsg.AppBrandVideoView", "onPrepared");
    AppBrandVideoView.t(this.hZx).aFY();
    AppMethodBeat.o(126466);
  }

  public final void aFr()
  {
    AppMethodBeat.i(126467);
    ab.i("MicroMsg.AppBrandVideoView", "onVideoEnded");
    AppBrandVideoView.m(this.hZx).setVisibility(8);
    AppBrandVideoView.g(this.hZx).setVisibility(0);
    if (AppBrandVideoView.h(this.hZx).aFF())
      AppBrandVideoView.h(this.hZx).hide();
    if (AppBrandVideoView.u(this.hZx).getVisibility() == 0)
      AppBrandVideoView.u(this.hZx).setVisibility(8);
    if ((AppBrandVideoView.v(this.hZx)) || (!AppBrandVideoView.w(this.hZx)))
      AppBrandVideoView.x(this.hZx).setVisibility(8);
    while (true)
    {
      k localk;
      if (AppBrandVideoView.d(this.hZx) != null)
        localk = AppBrandVideoView.d(this.hZx);
      try
      {
        k.c localc = new com/tencent/mm/plugin/appbrand/jsapi/video/k$c;
        localc.<init>((byte)0);
        localk.a(localc, localk.aFV());
        localk.aFW();
        localk.aFX();
        if (AppBrandVideoView.A(this.hZx))
          this.hZx.d(0.0D, true);
        AppMethodBeat.o(126467);
        return;
        if (AppBrandVideoView.y(this.hZx) <= 0)
          AppBrandVideoView.z(this.hZx).setText(AppBrandVideoView.oz(AppBrandVideoView.b(this.hZx).getVideoDurationSec()));
        AppBrandVideoView.x(this.hZx).setVisibility(0);
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ab.e("MicroMsg.JsApiVideoCallback", "OnVideoEnded e=%s", new Object[] { localJSONException });
      }
    }
  }

  public final void aFs()
  {
    AppMethodBeat.i(126469);
    ab.i("MicroMsg.AppBrandVideoView", "onVideoPause");
    k localk;
    if (AppBrandVideoView.d(this.hZx) != null)
      localk = AppBrandVideoView.d(this.hZx);
    try
    {
      k.g localg = new com/tencent/mm/plugin/appbrand/jsapi/video/k$g;
      localg.<init>((byte)0);
      localk.a(localg, localk.aFV());
      localk.aFW();
      AppMethodBeat.o(126469);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiVideoCallback", "OnVideoPause e=%s", new Object[] { localJSONException });
    }
  }

  public final void aFt()
  {
    AppMethodBeat.i(126470);
    ab.i("MicroMsg.AppBrandVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(AppBrandVideoView.v(this.hZx)) });
    if ((AppBrandVideoView.y(this.hZx) <= 0) && (!AppBrandVideoView.v(this.hZx)))
      AppBrandVideoView.z(this.hZx).setText(AppBrandVideoView.oz(AppBrandVideoView.b(this.hZx).getVideoDurationSec()));
    AppBrandVideoView.a(this.hZx, AppBrandVideoView.v(this.hZx));
    if (AppBrandVideoView.f(this.hZx))
      AppBrandVideoView.C(this.hZx);
    k localk;
    if (AppBrandVideoView.d(this.hZx) != null)
      localk = AppBrandVideoView.d(this.hZx);
    while (true)
    {
      try
      {
        localk.iat = 0;
        Object localObject1 = localk.aFV();
        ((JSONObject)localObject1).put("timeStamp", System.currentTimeMillis());
        Object localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/video/k$h;
        ((k.h)localObject2).<init>((byte)0);
        localk.a((ah)localObject2, (JSONObject)localObject1);
        if (localk.ias == null)
        {
          localObject1 = new com/tencent/mm/sdk/platformtools/ap;
          localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/video/k$1;
          ((k.1)localObject2).<init>(localk);
          ((ap)localObject1).<init>((ap.a)localObject2, true);
          localk.ias = ((ap)localObject1);
        }
        localk.ias.ae(250L, 250L);
        if (localk.hZL == null)
        {
          localObject1 = new com/tencent/mm/sdk/platformtools/ap;
          localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/video/k$2;
          ((k.2)localObject2).<init>(localk);
          ((ap)localObject1).<init>((ap.a)localObject2, true);
          localk.hZL = ((ap)localObject1);
        }
        localk.hZL.ae(500L, 500L);
        AppMethodBeat.o(126470);
        return;
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "OnVideoPlay e=%s", new Object[] { localJSONException });
      }
      AppMethodBeat.o(126470);
    }
  }

  public final void aFu()
  {
    AppMethodBeat.i(126471);
    ab.i("MicroMsg.AppBrandVideoView", "onVideoWaiting");
    k localk;
    if (AppBrandVideoView.d(this.hZx) != null)
      localk = AppBrandVideoView.d(this.hZx);
    try
    {
      JSONObject localJSONObject = localk.aFV();
      localJSONObject.put("timeStamp", System.currentTimeMillis());
      k.m localm = new com/tencent/mm/plugin/appbrand/jsapi/video/k$m;
      localm.<init>((byte)0);
      localk.a(localm, localJSONObject);
      AppBrandVideoView.b(this.hZx, true);
      AppBrandVideoView.j(this.hZx);
      AppMethodBeat.o(126471);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoWaiting e=%s", new Object[] { localJSONException });
    }
  }

  public final void aFv()
  {
    AppMethodBeat.i(126472);
    AppBrandVideoView.b(this.hZx, false);
    AppBrandVideoView.n(this.hZx);
    AppMethodBeat.o(126472);
  }

  public final void de(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126468);
    ab.i("MicroMsg.AppBrandVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject;
    int i;
    if (AppBrandVideoView.B(this.hZx) == -1)
    {
      localObject = this.hZx;
      if (paramInt1 < paramInt2)
      {
        i = 0;
        AppBrandVideoView.a((AppBrandVideoView)localObject, i);
        ab.i("MicroMsg.AppBrandVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { Integer.valueOf(AppBrandVideoView.B(this.hZx)) });
      }
    }
    else
    {
      if (AppBrandVideoView.d(this.hZx) == null)
        break label243;
      localObject = AppBrandVideoView.d(this.hZx);
      i = this.hZx.getDuration();
    }
    while (true)
    {
      try
      {
        ab.i("MicroMsg.JsApiVideoCallback", "onVideoLoadedMetaData, width:%d, height:%d, duration:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        JSONObject localJSONObject = ((k)localObject).aFV();
        localJSONObject.put("width", paramInt1);
        localJSONObject.put("height", paramInt2);
        localJSONObject.put("duration", i * 1.0D / 1000.0D);
        k.f localf = new com/tencent/mm/plugin/appbrand/jsapi/video/k$f;
        localf.<init>((byte)0);
        ((k)localObject).a(localf, localJSONObject);
        AppMethodBeat.o(126468);
        return;
        i = 90;
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoLoadedMetaData e=%s", new Object[] { localJSONException });
      }
      label243: AppMethodBeat.o(126468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.11
 * JD-Core Version:    0.6.2
 */