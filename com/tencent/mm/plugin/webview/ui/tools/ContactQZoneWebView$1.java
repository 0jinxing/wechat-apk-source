package com.tencent.mm.plugin.webview.ui.tools;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;

final class ContactQZoneWebView$1 extends s
{
  ContactQZoneWebView$1(ContactQZoneWebView paramContactQZoneWebView)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(7348);
    if (paramString.startsWith("weixin://viewimage/"))
    {
      this.urc.afr(paramString);
      paramWebView.stopLoading();
    }
    while (true)
    {
      AppMethodBeat.o(7348);
      while (true)
      {
        return true;
        if ((!paramString.startsWith("weixinping://iframe")) && (!paramString.startsWith("weixinpreinject://iframe")))
          break;
        AppMethodBeat.o(7348);
      }
      paramWebView.loadUrl(paramString);
    }
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(7349);
    if (paramString.startsWith("weixin://viewimage/"))
    {
      this.urc.afr(paramString);
      paramWebView.stopLoading();
      AppMethodBeat.o(7349);
    }
    while (true)
    {
      return;
      if (paramString.equals(ContactQZoneWebView.a(this.urc)))
      {
        bo.M(this.urc, paramString);
        paramWebView.stopLoading();
        AppMethodBeat.o(7349);
      }
      else
      {
        super.b(paramWebView, paramString, paramBitmap);
        AppMethodBeat.o(7349);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView.1
 * JD-Core Version:    0.6.2
 */