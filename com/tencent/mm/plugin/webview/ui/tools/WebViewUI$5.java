package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.57;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class WebViewUI$5
  implements l.a
{
  WebViewUI$5(WebViewUI paramWebViewUI)
  {
  }

  public final void cZV()
  {
    AppMethodBeat.i(7812);
    ab.d("MicroMsg.WebViewUI", "onPullDownRefresh, start");
    d locald;
    if (this.uxp.uhz != null)
    {
      locald = this.uxp.uhz;
      if (!locald.ready)
      {
        ab.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, not ready");
        AppMethodBeat.o(7812);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onPullDownRefresh success, ready");
      al.d(new d.57(locald, d.agr(i.a.b("onPullDownRefresh", null, locald.uFv, locald.uFw))));
      AppMethodBeat.o(7812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.5
 * JD-Core Version:    0.6.2
 */