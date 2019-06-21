package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.35;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONException;
import org.json.JSONObject;

final class BaseSOSWebViewUI$5
  implements Runnable
{
  BaseSOSWebViewUI$5(BaseSOSWebViewUI paramBaseSOSWebViewUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8335);
    d locald;
    String str;
    if (this.uAz.getJsapi() != null)
    {
      locald = this.uAz.getJsapi();
      str = this.iIA;
      if (!locald.ready)
      {
        ab.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, not ready");
        AppMethodBeat.o(8335);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchHistoryReady success, ready");
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        str = i.a.a("onSearchHistoryReady", (JSONObject)localObject, locald.uFv, locald.uFw);
        localObject = new com/tencent/mm/plugin/webview/ui/tools/jsapi/d$35;
        ((d.35)localObject).<init>(locald, str);
        al.d((Runnable)localObject);
        AppMethodBeat.o(8335);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException, "", new Object[0]);
      }
      AppMethodBeat.o(8335);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.5
 * JD-Core Version:    0.6.2
 */