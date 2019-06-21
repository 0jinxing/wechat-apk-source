package com.tencent.mm.d.a;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class t$1
  implements h
{
  t$1(t paramt, l paraml)
  {
  }

  public final void C(String paramString1, String paramString2)
  {
    AppMethodBeat.i(113891);
    ab.e("MicroMsg.V8EngineWorkerManager", "handleException(%s), stackTrace : %s", new Object[] { paramString1, paramString2 });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("message", paramString1);
      localJSONObject.put("stack", paramString2);
      this.ciI.a(String.format("WeixinWorker.errorHandler(%s)", new Object[] { localJSONObject }), null);
      AppMethodBeat.o(113891);
      return;
    }
    catch (JSONException paramString1)
    {
      while (true)
        ab.e("MicroMsg.V8EngineWorkerManager", Log.getStackTraceString(paramString1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.t.1
 * JD-Core Version:    0.6.2
 */