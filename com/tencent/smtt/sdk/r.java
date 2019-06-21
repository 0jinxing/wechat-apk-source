package com.tencent.smtt.sdk;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.WebViewTransport;

class r
  implements Runnable
{
  r(q paramq, WebView.WebViewTransport paramWebViewTransport, Message paramMessage)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64080);
    WebView localWebView = this.a.getWebView();
    if (localWebView != null)
      ((IX5WebViewBase.WebViewTransport)this.b.obj).setWebView(localWebView.c());
    this.b.sendToTarget();
    AppMethodBeat.o(64080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.r
 * JD-Core Version:    0.6.2
 */