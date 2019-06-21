package com.tencent.mm.plugin.game.luggage.d;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.DownloadChecker;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.f;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.n;
import com.tencent.xweb.o;

public final class d$b extends f
{
  public d$b(d paramd)
  {
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(135941);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramn.getUrl().toString() });
    if (paramn.getUrl().toString().equals("https://game.weixin.qq.com/favicon.ico"))
    {
      paramWebView = new o("img/png", null, null);
      AppMethodBeat.o(135941);
    }
    while (true)
    {
      return paramWebView;
      o localo = d.h(this.mUS).ahA(paramn.getUrl().toString());
      if (localo != null)
      {
        com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        AppMethodBeat.o(135941);
        paramWebView = localo;
      }
      else
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(135941);
      }
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(135942);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramn.getUrl().toString() });
    if (paramn.getUrl().toString().equals("https://game.weixin.qq.com/favicon.ico"))
    {
      paramWebView = new o("img/png", null, null);
      AppMethodBeat.o(135942);
    }
    while (true)
    {
      return paramWebView;
      o localo = d.h(this.mUS).ahA(paramn.getUrl().toString());
      if (localo != null)
      {
        com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        AppMethodBeat.o(135942);
        paramWebView = localo;
      }
      else
      {
        paramWebView = super.a(paramWebView, paramn, paramBundle);
        AppMethodBeat.o(135942);
      }
    }
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(135943);
    super.a(paramWebView, paramInt, paramString1, paramString2);
    com.tencent.luggage.g.d.e("MicroMsg.GameWebCoreImpl", "onReceivedError, desc: %s, url: %s", new Object[] { paramString1, paramString2 });
    h.pYm.k(949L, 1L, 1L);
    AppMethodBeat.o(135943);
  }

  public final void a(WebView paramWebView, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(135944);
    super.a(paramWebView, paramj, paramSslError);
    com.tencent.luggage.g.d.e("MicroMsg.GameWebCoreImpl", "onReceivedSslError， error: ".concat(String.valueOf(paramSslError)));
    h.pYm.k(949L, 2L, 1L);
    AppMethodBeat.o(135944);
  }

  public final void a(WebView paramWebView, n paramn, o paramo)
  {
    AppMethodBeat.i(135945);
    super.a(paramWebView, paramn, paramo);
    com.tencent.luggage.g.d.e("MicroMsg.GameWebCoreImpl", "onReceivedHttpError， errorCode: %d", new Object[] { Integer.valueOf(paramo.mStatusCode) });
    h.pYm.k(949L, 3L, 1L);
    AppMethodBeat.o(135945);
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(135939);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldOverrideUrlLoading, url: %s", new Object[] { paramString });
    if (DownloadChecker.a(paramString, d.i(this.mUS), paramWebView))
    {
      ab.i("MicroMsg.GameWebCoreImpl", "use the downloader to download");
      AppMethodBeat.o(135939);
    }
    while (true)
    {
      return bool;
      bool = super.a(paramWebView, paramString);
      AppMethodBeat.o(135939);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(135937);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPageFinished, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    d.h(this.mUS).k(paramWebView, paramString);
    super.b(paramWebView, paramString);
    this.mUS.b(paramWebView, paramString);
    AppMethodBeat.o(135937);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(135936);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPageStarted, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    d.h(this.mUS).j(paramWebView, paramString);
    super.b(paramWebView, paramString, paramBitmap);
    this.mUS.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(135936);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(135940);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", new Object[] { paramString });
    if (paramString.equals("https://game.weixin.qq.com/favicon.ico"))
    {
      paramWebView = new o("img/png", null, null);
      AppMethodBeat.o(135940);
    }
    while (true)
    {
      return paramWebView;
      o localo = d.h(this.mUS).ahA(paramString);
      if (localo != null)
      {
        com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        AppMethodBeat.o(135940);
        paramWebView = localo;
      }
      else
      {
        paramWebView = super.c(paramWebView, paramString);
        AppMethodBeat.o(135940);
      }
    }
  }

  public final void h(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(135938);
    super.h(paramWebView, paramString);
    com.tencent.luggage.g.d.d("MicroMsg.GameWebCoreImpl", "onLoadResource, url: %s", new Object[] { paramString });
    AppMethodBeat.o(135938);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d.b
 * JD-Core Version:    0.6.2
 */