package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class JsApiSetBackgroundAudioStateWC$2 extends g.c
{
  JsApiSetBackgroundAudioStateWC$2(JsApiSetBackgroundAudioStateWC paramJsApiSetBackgroundAudioStateWC, v.b paramb)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(130762);
    String str = this.hAt.getString("appId", "");
    ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", new Object[] { str });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("operationType", "stop");
      label49: JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask localSetBackgroundAudioStateTask = this.hBc.b(this.hBc, this.hBc.hAp.hxS, this.hBc.hAp.hwi);
      localSetBackgroundAudioStateTask.hAs = localJSONObject.toString();
      localSetBackgroundAudioStateTask.appId = str;
      AppBrandMainProcessService.b(localSetBackgroundAudioStateTask);
      AppMethodBeat.o(130762);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label49;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.2
 * JD-Core Version:    0.6.2
 */