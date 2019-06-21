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

final class i$1
  implements f
{
  i$1(i parami, v.b paramb)
  {
  }

  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(130711);
    String str = this.hAt.getString("appId", "");
    int i = this.hAt.getInt("pkgType", 0);
    if (((!str.equals(paramString)) || (i != paramInt)) && (this.hAt.nX("operateBackgroundAudio#isPlaying")) && (g.wW(str) != g.b.gNh))
    {
      ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onStickyBannerChanged, pause the music");
      paramString = new JSONObject();
    }
    try
    {
      paramString.put("operationType", "pause");
      label89: JsApiOperateBackgroundAudio.OperateBackgroundAudioTask localOperateBackgroundAudioTask = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(this.hAu, this.hAu.hAp.hxS, this.hAu.hAp.hwi);
      localOperateBackgroundAudioTask.hAs = paramString.toString();
      localOperateBackgroundAudioTask.appId = str;
      AppBrandMainProcessService.a(localOperateBackgroundAudioTask);
      AppMethodBeat.o(130711);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label89;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.i.1
 * JD-Core Version:    0.6.2
 */