package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class ag$3 extends WebViewClient
{
  ag$3(ag paramag)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(87317);
    ag.a(this.iuS).hTn.aJM();
    AppMethodBeat.o(87317);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(87316);
    ag.a(this.iuS);
    AppMethodBeat.o(87316);
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    AppMethodBeat.i(87318);
    if (paramSslError.getPrimaryError() == 3)
      if (ag.a(this.iuS).a(paramSslError.getCertificate()))
      {
        paramSslErrorHandler.proceed();
        AppMethodBeat.o(87318);
      }
    while (true)
    {
      return;
      paramSslErrorHandler.cancel();
      AppMethodBeat.o(87318);
      continue;
      paramSslErrorHandler.cancel();
      AppMethodBeat.o(87318);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    paramWebView = null;
    AppMethodBeat.i(87320);
    if (Build.VERSION.SDK_INT < 21)
      AppMethodBeat.o(87320);
    while (true)
    {
      return paramWebView;
      if ((paramWebResourceRequest == null) || (paramWebResourceRequest.getUrl() == null) || (bo.isNullOrNil(paramWebResourceRequest.getUrl().toString())))
      {
        AppMethodBeat.o(87320);
      }
      else
      {
        paramWebView = paramWebResourceRequest.getUrl().toString();
        paramWebView = ag.a(this.iuS).Dj(paramWebView);
        AppMethodBeat.o(87320);
      }
    }
  }

  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(87319);
    if (bo.isNullOrNil(paramString))
    {
      paramWebView = null;
      AppMethodBeat.o(87319);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = ag.a(this.iuS).Dj(paramString);
      AppMethodBeat.o(87319);
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ag.3
 * JD-Core Version:    0.6.2
 */