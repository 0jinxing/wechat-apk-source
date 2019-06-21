package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

final class j$1 extends g.c
{
  j$1(j paramj, String paramString, q paramq, int paramInt)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(130741);
    ab.i("MicroMsg.Record.JsApiOperateRecorder", "onPause, appId:%s", new Object[] { this.val$appId });
    paramd = new JSONObject();
    try
    {
      paramd.put("operationType", "pause");
      if (j.a(this.hAL) == null)
        j.a(this.hAL, new j.b(this.hAL, this.hsD, this.eIl));
      j.a(this.hAL).hAP = paramd.toString();
      j.a(this.hAL).appId = this.val$appId;
      j.a(this.hAL).action = -1;
      j.a(this.hAL).aCr();
      AppMethodBeat.o(130741);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", localJSONException, "", new Object[0]);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(130742);
    ab.i("MicroMsg.Record.JsApiOperateRecorder", "onDestroy, appId:%s", new Object[] { this.val$appId });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("operationType", "stop");
      if (j.a(this.hAL) == null)
        j.a(this.hAL, new j.b(this.hAL, this.hsD, this.eIl));
      j.a(this.hAL).hAP = localJSONObject.toString();
      j.a(this.hAL).appId = this.val$appId;
      j.a(this.hAL).action = -1;
      j.a(this.hAL).aCs();
      g.b(this.val$appId, this);
      j.aCv().remove(this.val$appId);
      AppMethodBeat.o(130742);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", localJSONException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.j.1
 * JD-Core Version:    0.6.2
 */