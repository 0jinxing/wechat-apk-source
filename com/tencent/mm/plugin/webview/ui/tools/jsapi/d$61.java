package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

public final class d$61
  implements Runnable
{
  public d$61(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8925);
    try
    {
      MMWebView localMMWebView = d.d(this.uFI);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      localMMWebView.evaluateJavascript(this.itc + ")", null);
      AppMethodBeat.o(8925);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8925);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.61
 * JD-Core Version:    0.6.2
 */