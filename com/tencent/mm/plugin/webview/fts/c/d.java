package com.tencent.mm.plugin.webview.fts.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements b.a
{
  public ap ias;
  public int iat;
  FtsWebVideoView uhG;
  private b.b uhv;
  private com.tencent.mm.plugin.webview.ui.tools.jsapi.d uhz;

  public d(FtsWebVideoView paramFtsWebVideoView, b.b paramb, com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
  {
    AppMethodBeat.i(5952);
    this.uhG = paramFtsWebVideoView;
    this.uhv = paramb;
    this.uhv.a(this);
    this.uhz = paramd;
    AppMethodBeat.o(5952);
  }

  private JSONObject cWC()
  {
    AppMethodBeat.i(5959);
    JSONObject localJSONObject = aFV();
    localJSONObject.put("currentTime", this.uhG.getCurrPosSec());
    AppMethodBeat.o(5959);
    return localJSONObject;
  }

  private JSONObject u(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(5957);
    JSONObject localJSONObject = aFV();
    localJSONObject.put("fullScreen", paramBoolean);
    localJSONObject.put("direction", paramString);
    AppMethodBeat.o(5957);
    return localJSONObject;
  }

  public final JSONObject a(int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(5962);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("playerId", this.uhG.getmVideoPlayerId());
    localJSONObject.put("event", paramInt);
    if (paramJSONObject != null)
      localJSONObject.put("detail", paramJSONObject);
    AppMethodBeat.o(5962);
    return localJSONObject;
  }

  public final void aDI()
  {
  }

  final JSONObject aFV()
  {
    AppMethodBeat.i(5958);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.uhG.getCookieData());
    AppMethodBeat.o(5958);
    return localJSONObject;
  }

  public final void aFW()
  {
    AppMethodBeat.i(5960);
    if (this.ias != null)
      this.ias.stopTimer();
    AppMethodBeat.o(5960);
  }

  public final void aM(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(5954);
    this.uhz.a("onVideoPlayerCallback", null, paramJSONObject);
    AppMethodBeat.o(5954);
  }

  public final void b(int paramInt, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(5955);
    try
    {
      ab.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), paramString });
      aM(a(5, u(paramBoolean, paramString)));
      AppMethodBeat.o(5955);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", new Object[] { paramString });
        AppMethodBeat.o(5955);
      }
    }
  }

  public final void cWB()
  {
    AppMethodBeat.i(5956);
    try
    {
      aM(a(6, cWC()));
      AppMethodBeat.o(5956);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.JsApiVideoCallback", localJSONException, null, new Object[0]);
        AppMethodBeat.o(5956);
      }
    }
  }

  public final void cWy()
  {
  }

  public final void cWz()
  {
  }

  public final void clean()
  {
    AppMethodBeat.i(5953);
    ab.i("MicroMsg.JsApiVideoCallback", "clean %s", new Object[] { toString() });
    aFW();
    AppMethodBeat.o(5953);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(5961);
    ab.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.uhG.setCallback(null);
    AppMethodBeat.o(5961);
  }

  public final void wU()
  {
  }

  public final void wW()
  {
  }

  public final boolean wY()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.d
 * JD-Core Version:    0.6.2
 */