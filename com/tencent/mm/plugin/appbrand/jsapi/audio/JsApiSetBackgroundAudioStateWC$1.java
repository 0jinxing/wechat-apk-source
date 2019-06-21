package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ui.banner.f;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class JsApiSetBackgroundAudioStateWC$1
  implements f
{
  JsApiSetBackgroundAudioStateWC$1(JsApiSetBackgroundAudioStateWC paramJsApiSetBackgroundAudioStateWC, v.b paramb)
  {
  }

  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(130761);
    String str = this.hAt.getString("appId", "");
    int i = this.hAt.getInt("pkgType", 0);
    if (((!str.equals(paramString)) || (i != paramInt)) && (this.hAt.nX("setBackgroundAudioState#isPlaying")) && (g.wW(str) != g.b.gNh))
    {
      ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onStickyBannerChanged, pause the music");
      paramString = new JSONObject();
    }
    try
    {
      paramString.put("operationType", "pause");
      label89: JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask localSetBackgroundAudioStateTask = this.hBc.b(this.hBc, this.hBc.hAp.hxS, this.hBc.hAp.hwi);
      localSetBackgroundAudioStateTask.hAs = paramString.toString();
      localSetBackgroundAudioStateTask.appId = str;
      AppBrandMainProcessService.a(localSetBackgroundAudioStateTask);
      AppMethodBeat.o(130761);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label89;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.1
 * JD-Core Version:    0.6.2
 */