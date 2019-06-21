package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

public final class d$7
  implements Runnable
{
  public d$7(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8870);
    try
    {
      MMWebView localMMWebView = d.d(this.uFI);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      localMMWebView.evaluateJavascript(this.itc + ")", null);
      AppMethodBeat.o(8870);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange, %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8870);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.7
 * JD-Core Version:    0.6.2
 */