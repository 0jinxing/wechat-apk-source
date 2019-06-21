package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class e extends a
{
  public static final int CTRL_INDEX = 290;
  public static final String NAME = "destroyAudioInstance";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137725);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance fail, data is null");
      paramc.M(paramInt, j("fail:data is null", null));
      AppMethodBeat.o(137725);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance data:%s", new Object[] { paramJSONObject.toString() });
      paramJSONObject = paramJSONObject.optString("audioId");
      if (TextUtils.isEmpty(paramJSONObject))
      {
        ab.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "audioId is empty");
        paramc.M(paramInt, j("fail:audioId is empty", null));
        AppMethodBeat.o(137725);
      }
      else
      {
        e.a locala = new e.a(this, paramc, paramInt);
        locala.appId = paramc.getAppId();
        locala.ckD = paramJSONObject;
        locala.aCr();
        AppMethodBeat.o(137725);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.e
 * JD-Core Version:    0.6.2
 */