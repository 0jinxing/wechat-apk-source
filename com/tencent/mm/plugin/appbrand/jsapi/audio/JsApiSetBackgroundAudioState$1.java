package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class JsApiSetBackgroundAudioState$1 extends g.c
{
  JsApiSetBackgroundAudioState$1(JsApiSetBackgroundAudioState paramJsApiSetBackgroundAudioState, v.b paramb, c paramc, int paramInt)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(137769);
    String str = this.hAt.getString("appId", "");
    ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", new Object[] { str });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("operationType", "stop");
      label49: JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask localSetBackgroundAudioStateTask = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(this.hAZ, this.hxc, this.eIl);
      localSetBackgroundAudioStateTask.hAs = localJSONObject.toString();
      localSetBackgroundAudioStateTask.appId = str;
      AppBrandMainProcessService.b(localSetBackgroundAudioStateTask);
      AppMethodBeat.o(137769);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label49;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState.1
 * JD-Core Version:    0.6.2
 */