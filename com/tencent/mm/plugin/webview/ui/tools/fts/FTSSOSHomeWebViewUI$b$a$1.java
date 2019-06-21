package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.38;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class FTSSOSHomeWebViewUI$b$a$1
  implements Runnable
{
  FTSSOSHomeWebViewUI$b$a$1(FTSSOSHomeWebViewUI.b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8458);
    d locald = this.uBU.uBT.uBG.getJsapi();
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onFocusSearchInput fail, not ready");
      AppMethodBeat.o(8458);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onFocusSearchInput success, ready");
      al.d(new d.38(locald, i.a.b("onFocusSearchInput", null, locald.uFv, locald.uFw)));
      AppMethodBeat.o(8458);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.b.a.1
 * JD-Core Version:    0.6.2
 */