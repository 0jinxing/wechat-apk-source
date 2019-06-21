package com.tencent.smtt.sdk;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class z
  implements Runnable
{
  z(SystemWebChromeClient paramSystemWebChromeClient, WebView.WebViewTransport paramWebViewTransport, Message paramMessage)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64151);
    WebView localWebView = this.a.getWebView();
    if (localWebView != null)
      ((android.webkit.WebView.WebViewTransport)this.b.obj).setWebView(localWebView.b());
    this.b.sendToTarget();
    AppMethodBeat.o(64151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.z
 * JD-Core Version:    0.6.2
 */