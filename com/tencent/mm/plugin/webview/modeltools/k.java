package com.tencent.mm.plugin.webview.modeltools;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.net.URL;
import java.util.HashMap;

public final class k
{
  public static boolean a(d paramd, MMWebView paramMMWebView)
  {
    boolean bool1 = false;
    AppMethodBeat.i(7030);
    if (paramd == null)
    {
      ab.w("MicroMsg.WebViewReportOnLeaveHelper", "handler is null");
      AppMethodBeat.o(7030);
    }
    while (true)
    {
      return bool1;
      String str = paramMMWebView.getUrl();
      if (!bo.isNullOrNil(str))
        try
        {
          localObject = new java/net/URL;
          ((URL)localObject).<init>(str);
          boolean bool2 = ((URL)localObject).getHost().equals("mp.weixin.qq.com");
          if (bool2)
            break;
          AppMethodBeat.o(7030);
        }
        catch (Exception paramd)
        {
          ab.e("MicroMsg.WebViewReportOnLeaveHelper", "create url fail : " + paramd.getLocalizedMessage());
          AppMethodBeat.o(7030);
        }
      else
        AppMethodBeat.o(7030);
    }
    Object localObject = new k.1(paramMMWebView);
    if (!paramd.ready)
      ((ValueCallback)localObject).onReceiveValue(null);
    while (true)
    {
      bool1 = true;
      AppMethodBeat.o(7030);
      break;
      paramMMWebView = i.a.b("reportOnLeaveForMP", new HashMap(), paramd.uFv, paramd.uFw);
      paramd.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramMMWebView + ")", (ValueCallback)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.k
 * JD-Core Version:    0.6.2
 */