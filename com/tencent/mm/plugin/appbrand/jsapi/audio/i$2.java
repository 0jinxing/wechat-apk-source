package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class i$2 extends g.c
{
  i$2(i parami, v.b paramb)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(130712);
    String str = this.hAt.getString("appId", "");
    ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", new Object[] { str });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("operationType", "stop");
      label49: JsApiOperateBackgroundAudio.OperateBackgroundAudioTask localOperateBackgroundAudioTask = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(this.hAu, this.hAu.hAp.hxS, this.hAu.hAp.hwi);
      localOperateBackgroundAudioTask.hAs = localJSONObject.toString();
      localOperateBackgroundAudioTask.appId = str;
      AppBrandMainProcessService.b(localOperateBackgroundAudioTask);
      AppMethodBeat.o(130712);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label49;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.i.2
 * JD-Core Version:    0.6.2
 */