package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.b.a;

final class g$95
  implements Runnable
{
  g$95(g paramg, WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9163);
    fk localfk = new fk();
    localfk.czf.op = 4;
    localfk.czf.fileName = this.uId.fileName;
    a.xxA.m(localfk);
    AppMethodBeat.o(9163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.95
 * JD-Core Version:    0.6.2
 */