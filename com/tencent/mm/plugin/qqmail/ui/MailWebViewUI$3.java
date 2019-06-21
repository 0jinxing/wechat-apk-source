package com.tencent.mm.plugin.qqmail.ui;

import android.webkit.WebSettings.LayoutAlgorithm;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import com.tencent.xweb.s;

final class MailWebViewUI$3 extends s
{
  MailWebViewUI$3(MailWebViewUI paramMailWebViewUI)
  {
  }

  public final void a(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(68395);
    MailWebViewUI.c(this.pzh).getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
    AppMethodBeat.o(68395);
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(68396);
    if (paramString.startsWith("weixin://private/getcontentwidth/"))
    {
      ab.d("MicroMsg.QQMail.WebViewUI", "shouldOverride, url is getContentWidth scheme, url = ".concat(String.valueOf(paramString)));
      MailWebViewUI.b(this.pzh, paramString);
      AppMethodBeat.o(68396);
    }
    while (true)
    {
      return true;
      paramWebView.loadUrl(paramString);
      AppMethodBeat.o(68396);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(68397);
    super.b(paramWebView, paramString);
    u.a(paramWebView, "weixin://private/getcontentwidth/", "document.getElementsByTagName('html')[0].scrollWidth;");
    AppMethodBeat.o(68397);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.3
 * JD-Core Version:    0.6.2
 */