package com.tencent.mm.plugin.appbrand.jsapi.offlinevoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class b extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 635;
  public static final String NAME = "loadPaySpeechDialectConfig";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131372);
    ab.i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "invoke JsApiLoadPaySpeechDialectConfig!");
    if (paramc == null)
    {
      ab.e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:component is null");
      AppMethodBeat.o(131372);
    }
    while (true)
    {
      return;
      if (paramc.getContext() == null)
      {
        ab.e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:context is null");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(131372);
      }
      else
      {
        f.a("com.tencent.mm", null, a.class, new b.1(this, paramc, paramInt));
        AppMethodBeat.o(131372);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b
 * JD-Core Version:    0.6.2
 */