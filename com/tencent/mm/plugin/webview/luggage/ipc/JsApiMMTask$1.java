package com.tencent.mm.plugin.webview.luggage.ipc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import org.json.JSONObject;

final class JsApiMMTask$1 extends bc.a
{
  JsApiMMTask$1(JsApiMMTask paramJsApiMMTask)
  {
  }

  public final void d(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(6255);
    this.ujN.aIm = paramString;
    if (paramJSONObject != null)
      this.ujN.ujM = paramJSONObject.toString();
    JsApiMMTask.a(this.ujN);
    AppMethodBeat.o(6255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask.1
 * JD-Core Version:    0.6.2
 */