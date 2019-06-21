package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

public class JsApiGetMusicPlayerState extends a<c>
{
  public static final int CTRL_INDEX = 46;
  public static final String NAME = "getMusicPlayerState";
  private JsApiGetMusicPlayerState.GetMusicPlayerState hAi;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137744);
    this.hAi = new JsApiGetMusicPlayerState.GetMusicPlayerState(this, paramc, paramInt);
    this.hAi.hAj = paramc.getAppId();
    AppBrandMainProcessService.a(this.hAi);
    AppMethodBeat.o(137744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState
 * JD-Core Version:    0.6.2
 */