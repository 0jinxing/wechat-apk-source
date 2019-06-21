package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.b.a;

final class g$94
  implements Runnable
{
  g$94(g paramg, WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9162);
    fk localfk = new fk();
    localfk.czf.op = 2;
    localfk.czf.fileName = this.uId.fileName;
    a.xxA.m(localfk);
    AppMethodBeat.o(9162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.94
 * JD-Core Version:    0.6.2
 */