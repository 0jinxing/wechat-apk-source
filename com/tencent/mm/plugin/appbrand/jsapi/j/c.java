package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.a;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends d
{
  public static final int CTRL_INDEX = 521;
  public static final String NAME = "updateVoIPChatMuteConfig";
  boolean hTk = false;
  boolean hTl = false;

  public final void b(q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131397);
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject("muteConfig");
      boolean bool1 = paramJSONObject.getBoolean("muteMicrophone");
      boolean bool2 = paramJSONObject.getBoolean("muteEarphone");
      com.tencent.luggage.g.d.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: muteMicroPhone:%b, muteEarPhone:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      paramJSONObject = j.kzW;
      Object localObject = new com/tencent/mm/plugin/appbrand/jsapi/j/c$1;
      ((c.1)localObject).<init>(this, paramq, paramInt);
      paramJSONObject.a(bool2, (a)localObject);
      localObject = j.kzW;
      paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/j/c$2;
      paramJSONObject.<init>(this, bool1, paramq, paramInt);
      ((j)localObject).b(bool1, paramJSONObject);
      AppMethodBeat.o(131397);
      return;
    }
    catch (JSONException paramq)
    {
      while (true)
      {
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", paramq, "", new Object[0]);
        AppMethodBeat.o(131397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.j.c
 * JD-Core Version:    0.6.2
 */