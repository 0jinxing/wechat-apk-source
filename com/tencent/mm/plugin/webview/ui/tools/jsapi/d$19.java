package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

public final class d$19
  implements Runnable
{
  public d$19(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8882);
    try
    {
      MMWebView localMMWebView = d.d(this.uFI);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      localMMWebView.evaluateJavascript(this.itc + ")", null);
      AppMethodBeat.o(8882);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onArticleReadingBtnClicked fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8882);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.19
 * JD-Core Version:    0.6.2
 */