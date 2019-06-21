package com.tencent.xweb.sys;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.e;
import com.tencent.xweb.g;
import com.tencent.xweb.h;

public final class d
  implements e
{
  WebViewClient APO;
  WebChromeClient APP;
  WebView APQ;

  public d(WebView paramWebView)
  {
    AppMethodBeat.i(84660);
    this.APQ = paramWebView;
    this.APO = new WebViewClient();
    this.APP = new WebChromeClient();
    AppMethodBeat.o(84660);
  }

  public final boolean a(String paramString1, String paramString2, h paramh)
  {
    return false;
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, g paramg)
  {
    return false;
  }

  public final boolean b(String paramString1, String paramString2, h paramh)
  {
    return false;
  }

  public final void onHideCustomView()
  {
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public final void w(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(84661);
    this.APO.onPageStarted(this.APQ, paramString, paramBitmap);
    AppMethodBeat.o(84661);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.d
 * JD-Core Version:    0.6.2
 */