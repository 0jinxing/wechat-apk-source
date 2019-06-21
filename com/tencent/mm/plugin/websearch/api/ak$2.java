package com.tencent.mm.plugin.websearch.api;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;

final class ak$2 extends s
{
  ak$2(ak paramak, MMWebView paramMMWebView)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(124192);
    if (!u.t(paramString, "weixin://private/setresult/"))
      AppMethodBeat.o(124192);
    while (true)
    {
      return bool;
      ab.i(this.uaN.TAG, "handleUrl %s ,view %s", new Object[] { paramString, paramWebView.toString() });
      this.uaO.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", null);
      AppMethodBeat.o(124192);
      bool = true;
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(124190);
    ab.i(this.uaN.TAG, "onPageFinished, view %s", new Object[] { paramWebView.toString() });
    this.uaN.b(this.uaO);
    AppMethodBeat.o(124190);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(124191);
    super.b(paramWebView, paramString, paramBitmap);
    ab.i(this.uaN.TAG, "onPageStarted, view %s", new Object[] { paramWebView.toString() });
    u.d(this.uaO);
    AppMethodBeat.o(124191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ak.2
 * JD-Core Version:    0.6.2
 */