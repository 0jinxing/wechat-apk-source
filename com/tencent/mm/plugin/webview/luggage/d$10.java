package com.tencent.mm.plugin.webview.luggage;

import android.net.http.SslError;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.s;

final class d$10 extends s
{
  d$10(d paramd)
  {
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6019);
    ab.i("MicroMsg.LuggageMMWebPage", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    this.uiy.bDw();
    AppMethodBeat.o(6019);
  }

  public final void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(6020);
    if (d.f(this.uiy) == null)
      d.a(this.uiy, new com.tencent.mm.plugin.webview.ui.tools.d(this.uiy.mContext, paramWebView));
    d.f(this.uiy).a(this.uiy.getUrl(), paramj, paramSslError);
    AppMethodBeat.o(6020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.10
 * JD-Core Version:    0.6.2
 */