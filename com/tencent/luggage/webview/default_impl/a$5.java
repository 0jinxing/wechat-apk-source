package com.tencent.luggage.webview.default_impl;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5 extends WebViewClient
{
  a$5(a parama, a.a parama1)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(90926);
    this.bRL.bF(paramString);
    AppMethodBeat.o(90926);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(90925);
    this.bRL.bE(paramString);
    AppMethodBeat.o(90925);
  }

  @TargetApi(21)
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(90927);
    paramWebView = this.bRL.bG(paramWebResourceRequest.getUrl().toString());
    AppMethodBeat.o(90927);
    return paramWebView;
  }

  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(90928);
    paramWebView = this.bRL.bG(paramString);
    AppMethodBeat.o(90928);
    return paramWebView;
  }

  @TargetApi(21)
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(90924);
    boolean bool = this.bRL.bD(paramWebResourceRequest.getUrl().toString());
    AppMethodBeat.o(90924);
    return bool;
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(90923);
    boolean bool = this.bRL.bD(paramString);
    AppMethodBeat.o(90923);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.default_impl.a.5
 * JD-Core Version:    0.6.2
 */