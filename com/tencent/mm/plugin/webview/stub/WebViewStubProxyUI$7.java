package com.tencent.mm.plugin.webview.stub;

import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class WebViewStubProxyUI$7
  implements ap.a
{
  WebViewStubProxyUI$7(WebViewStubProxyUI paramWebViewStubProxyUI)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(7096);
    if ((this.uqn.getWindow() == null) || (this.uqn.getWindow().getDecorView() == null) || (this.uqn.getWindow().getDecorView().getWindowToken() == null))
      if (WebViewStubProxyUI.c(this.uqn) < 10)
      {
        WebViewStubProxyUI.d(this.uqn);
        bool = true;
        AppMethodBeat.o(7096);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.WebViewStubProxyUI", "timer reach max retry time, finish ProxyUI");
      this.uqn.finish();
      AppMethodBeat.o(7096);
      continue;
      WebViewStubProxyUI.e(this.uqn);
      WebViewStubProxyUI.f(this.uqn);
      AppMethodBeat.o(7096);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.7
 * JD-Core Version:    0.6.2
 */