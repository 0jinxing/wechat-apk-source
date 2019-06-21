package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.ui.banner.f;
import org.json.JSONException;
import org.json.JSONObject;

final class JsApiOperateMusicPlayer$1
  implements f
{
  JsApiOperateMusicPlayer$1(JsApiOperateMusicPlayer paramJsApiOperateMusicPlayer, v.b paramb, s params)
  {
  }

  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(130715);
    String str = this.hAt.getString("appId", "");
    int i = this.hAt.getInt("pkgType", 0);
    if (((!str.equals(paramString)) || (i != paramInt)) && (this.hAt.nX("Music#isPlaying")) && (g.wW(str) != g.b.gNh))
      paramString = new JSONObject();
    try
    {
      paramString.put("operationType", "pause");
      label82: JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(this.hAw, this.hsj, JsApiOperateMusicPlayer.OperateMusicPlayer.a(this.hAw.hAv));
      localOperateMusicPlayer.jsonString = paramString.toString();
      localOperateMusicPlayer.csB = str;
      localOperateMusicPlayer.hAx = this.hAt;
      AppBrandMainProcessService.a(localOperateMusicPlayer);
      AppMethodBeat.o(130715);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label82;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.1
 * JD-Core Version:    0.6.2
 */