package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class d$13
  implements Runnable
{
  d$13(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8876);
    try
    {
      MMWebView localMMWebView = d.d(this.uFI);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      localMMWebView.evaluateJavascript(this.itc + ")", null);
      AppMethodBeat.o(8876);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onLocalImageUploadProgress fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8876);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.13
 * JD-Core Version:    0.6.2
 */