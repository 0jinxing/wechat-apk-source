package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class JsApiSetBackgroundAudioState extends a
{
  public static final int CTRL_INDEX = 160;
  public static final String NAME = "setBackgroundAudioState";
  protected JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask hAp;

  protected JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask a(a parama, c paramc, int paramInt)
  {
    AppMethodBeat.i(137793);
    parama = new JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask(this, paramc, paramInt);
    AppMethodBeat.o(137793);
    return parama;
  }

  protected String a(JSONObject paramJSONObject, c paramc)
  {
    AppMethodBeat.i(137791);
    paramJSONObject = paramJSONObject.optString("src");
    AppMethodBeat.o(137791);
    return paramJSONObject;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137790);
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState data is null");
      AppMethodBeat.o(137790);
    }
    while (true)
    {
      return;
      String str = paramc.getAppId();
      ab.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState appId:%s ,data:%s", new Object[] { str, paramJSONObject.toString() });
      if (this.hAp == null)
        this.hAp = a(this, paramc, paramInt);
      this.hAp.hwi = paramInt;
      this.hAp.appId = str;
      JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask.a(this.hAp);
      ??? = v.nW("AppBrandService#" + paramc.hashCode());
      a((String)???, paramc);
      synchronized (v.Zp().y((String)???, true))
      {
        if ((g.c)((v.b)???).get("AppBrandLifeCycle.Listener", null) == null)
        {
          JsApiSetBackgroundAudioState.1 local1 = new com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiSetBackgroundAudioState$1;
          local1.<init>(this, (v.b)???, paramc, paramInt);
          ((v.b)???).j("AppBrandLifeCycle.Listener", local1);
          this.hAp.huj = local1;
        }
        AppBrandMainProcessService.a(this.hAp);
        ??? = b(this, paramc, paramInt);
        ((JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask)???).hwi = paramInt;
        ((JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask)???).appId = str;
        ((JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask)???).hAs = paramJSONObject.toString();
        ((JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask)???).cHg = a(paramJSONObject, paramc);
        AppBrandMainProcessService.a((MainProcessTask)???);
        AppMethodBeat.o(137790);
      }
    }
  }

  protected void a(String paramString, c paramc)
  {
  }

  protected JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask b(a parama, c paramc, int paramInt)
  {
    AppMethodBeat.i(137792);
    parama = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(this, paramc, paramInt);
    AppMethodBeat.o(137792);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState
 * JD-Core Version:    0.6.2
 */