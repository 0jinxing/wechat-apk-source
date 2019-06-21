package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.b.a;

final class g$93
  implements Runnable
{
  g$93(g paramg, WebViewJSSDKFileItem paramWebViewJSSDKFileItem, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9161);
    fk localfk = new fk();
    localfk.czf.op = 1;
    localfk.czf.fileName = this.uId.fileName;
    localfk.czf.com = true;
    localfk.czf.czi = new g.93.1(this);
    localfk.czf.czj = new g.93.2(this);
    a.xxA.m(localfk);
    AppMethodBeat.o(9161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.93
 * JD-Core Version:    0.6.2
 */