package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.b.a;

final class g$91
  implements Runnable
{
  g$91(g paramg, WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9157);
    fn localfn = new fn();
    localfn.czm.op = 2;
    localfn.czm.filePath = this.uId.heo;
    a.xxA.m(localfn);
    g.G(this.uHd);
    AppMethodBeat.o(9157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.91
 * JD-Core Version:    0.6.2
 */