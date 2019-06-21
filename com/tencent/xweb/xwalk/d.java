package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.c.b.a;
import org.xwalk.core.XWalkCookieManager;

public final class d
  implements b.a
{
  XWalkCookieManager ARR;

  public d()
  {
    AppMethodBeat.i(85208);
    this.ARR = new XWalkCookieManager();
    AppMethodBeat.o(85208);
  }

  public final void dTS()
  {
    AppMethodBeat.i(85209);
    this.ARR.setAcceptCookie(true);
    AppMethodBeat.o(85209);
  }

  public final void f(WebView paramWebView)
  {
  }

  public final String getCookie(String paramString)
  {
    AppMethodBeat.i(85211);
    paramString = this.ARR.getCookie(paramString);
    AppMethodBeat.o(85211);
    return paramString;
  }

  public final void removeAllCookie()
  {
    AppMethodBeat.i(85210);
    this.ARR.removeAllCookie();
    AppMethodBeat.o(85210);
  }

  public final void removeSessionCookie()
  {
    AppMethodBeat.i(85213);
    this.ARR.removeSessionCookie();
    AppMethodBeat.o(85213);
  }

  public final void setCookie(String paramString1, String paramString2)
  {
    AppMethodBeat.i(85212);
    this.ARR.setCookie(paramString1, paramString2);
    AppMethodBeat.o(85212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.d
 * JD-Core Version:    0.6.2
 */