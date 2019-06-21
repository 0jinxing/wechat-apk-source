package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  implements f.c
{
  ap hZL;
  AppBrandVideoView iaq;
  private e iar;
  ap ias;
  int iat;
  int iau;

  public k(AppBrandVideoView paramAppBrandVideoView, e parame)
  {
    AppMethodBeat.i(126572);
    this.iau = 0;
    this.iaq = paramAppBrandVideoView;
    this.iar = parame;
    this.iar.a(this);
    AppMethodBeat.o(126572);
  }

  final void a(ah paramah, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126576);
    if ((!(paramah instanceof k.l)) && (!(paramah instanceof k.i)))
      ab.i("MicroMsg.JsApiVideoCallback", "dispatchEvent event %s", new Object[] { paramah.getName() });
    this.iar.b(paramah.AM(paramJSONObject.toString()));
    AppMethodBeat.o(126576);
  }

  final JSONObject aFV()
  {
    AppMethodBeat.i(126577);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.iaq.getCookieData());
    AppMethodBeat.o(126577);
    return localJSONObject;
  }

  final void aFW()
  {
    AppMethodBeat.i(126578);
    if (this.ias != null)
      this.ias.stopTimer();
    AppMethodBeat.o(126578);
  }

  final void aFX()
  {
    AppMethodBeat.i(126579);
    if (this.hZL != null)
      this.hZL.stopTimer();
    AppMethodBeat.o(126579);
  }

  public final void c(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(126575);
    try
    {
      ab.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
      JSONObject localJSONObject = aFV();
      localJSONObject.put("fullScreen", paramBoolean);
      localJSONObject.put("videoPlayerId", paramInt1);
      localJSONObject.put("direction", paramInt2);
      k.e locale = new com/tencent/mm/plugin/appbrand/jsapi/video/k$e;
      locale.<init>((byte)0);
      a(locale, localJSONObject);
      AppMethodBeat.o(126575);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", new Object[] { localJSONException });
        AppMethodBeat.o(126575);
      }
    }
  }

  public final void clean()
  {
    AppMethodBeat.i(126574);
    this.iar.b(this);
    aFW();
    aFX();
    AppMethodBeat.o(126574);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126573);
    ab.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.iaq.setCallback(null);
    AppMethodBeat.o(126573);
  }

  static final class m extends ah
  {
    private static final int CTRL_INDEX = 350;
    private static final String NAME = "onVideoWaiting";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.k
 * JD-Core Version:    0.6.2
 */