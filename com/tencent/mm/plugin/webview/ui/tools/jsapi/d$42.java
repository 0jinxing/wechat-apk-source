package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class d$42
  implements Runnable
{
  d$42(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8906);
    try
    {
      MMWebView localMMWebView = d.d(this.uFI);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
      String str = this.itc + ")";
      localObject = new com/tencent/mm/plugin/webview/ui/tools/jsapi/d$42$1;
      ((d.42.1)localObject).<init>(this);
      localMMWebView.evaluateJavascript(str, (ValueCallback)localObject);
      AppMethodBeat.o(8906);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8906);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.42
 * JD-Core Version:    0.6.2
 */