package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

public final class d$35
  implements Runnable
{
  public d$35(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8898);
    try
    {
      ab.d("MicroMsg.JsApiHandler", "onSearchHistoryReady %s", new Object[] { this.itc });
      MMWebView localMMWebView = d.d(this.uFI);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      localMMWebView.evaluateJavascript(this.itc + ")", null);
      AppMethodBeat.o(8898);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8898);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.35
 * JD-Core Version:    0.6.2
 */