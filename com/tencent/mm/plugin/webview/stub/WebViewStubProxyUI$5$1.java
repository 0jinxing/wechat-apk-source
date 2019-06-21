package com.tencent.mm.plugin.webview.stub;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewStubProxyUI$5$1
  implements Runnable
{
  WebViewStubProxyUI$5$1(WebViewStubProxyUI.5 param5, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7073);
    h.JR(WebViewStubProxyUI.b(this.uqt.uqn)).a(null, null, null);
    this.uqt.uqn.finish();
    try
    {
      WebViewStubProxyUI.a(this.uqt.uqn).a(this.uqp, this.uqq, this.uqr, this.uqs);
      AppMethodBeat.o(7073);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.callbackerWrapper", "wrapper onHandleEnd, ex = " + localException.getMessage());
        AppMethodBeat.o(7073);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.5.1
 * JD-Core Version:    0.6.2
 */