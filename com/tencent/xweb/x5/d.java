package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.xweb.c.b.a;
import org.xwalk.core.Log;

public final class d
  implements b.a
{
  CookieManager AQr;

  public d()
  {
    AppMethodBeat.i(84799);
    this.AQr = CookieManager.getInstance();
    AppMethodBeat.o(84799);
  }

  public final void dTS()
  {
    AppMethodBeat.i(84800);
    this.AQr.setAcceptCookie(true);
    AppMethodBeat.o(84800);
  }

  public final void f(com.tencent.xweb.WebView paramWebView)
  {
    AppMethodBeat.i(84801);
    if (paramWebView == null)
    {
      Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is null");
      AppMethodBeat.o(84801);
    }
    while (true)
    {
      return;
      paramWebView = paramWebView.getWebViewUI();
      if (!(paramWebView instanceof com.tencent.smtt.sdk.WebView))
      {
        Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is not x5 webview");
        AppMethodBeat.o(84801);
      }
      else
      {
        this.AQr.setAcceptThirdPartyCookies((com.tencent.smtt.sdk.WebView)paramWebView, true);
        AppMethodBeat.o(84801);
      }
    }
  }

  public final String getCookie(String paramString)
  {
    AppMethodBeat.i(84803);
    paramString = this.AQr.getCookie(paramString);
    AppMethodBeat.o(84803);
    return paramString;
  }

  public final void removeAllCookie()
  {
    AppMethodBeat.i(84802);
    this.AQr.removeAllCookie();
    AppMethodBeat.o(84802);
  }

  public final void removeSessionCookie()
  {
    AppMethodBeat.i(84805);
    this.AQr.removeSessionCookie();
    AppMethodBeat.o(84805);
  }

  public final void setCookie(String paramString1, String paramString2)
  {
    AppMethodBeat.i(84804);
    this.AQr.setCookie(paramString1, paramString2);
    AppMethodBeat.o(84804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.d
 * JD-Core Version:    0.6.2
 */