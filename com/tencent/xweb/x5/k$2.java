package com.tencent.xweb.x5;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.xweb.c.j;
import com.tencent.xweb.s;
import com.tencent.xweb.util.f;
import org.xwalk.core.Log;

final class k$2 extends c
{
  k$2(k paramk)
  {
  }

  public final void doUpdateVisitedHistory(com.tencent.smtt.sdk.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(84904);
    if (this.AQS.APU != null)
    {
      this.AQS.APU.a(this.AQS.APS, paramString, paramBoolean);
      AppMethodBeat.o(84904);
    }
    while (true)
    {
      return;
      super.doUpdateVisitedHistory(paramWebView, paramString, paramBoolean);
      AppMethodBeat.o(84904);
    }
  }

  public final void onLoadResource(com.tencent.smtt.sdk.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84899);
    if (this.AQS.APU != null)
    {
      this.AQS.APU.h(this.AQS.APS, paramString);
      AppMethodBeat.o(84899);
    }
    while (true)
    {
      return;
      super.onLoadResource(paramWebView, paramString);
      AppMethodBeat.o(84899);
    }
  }

  public final void onPageFinished(com.tencent.smtt.sdk.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84898);
    Log.i("X5WebView", "onPageFinished ".concat(String.valueOf(paramString)));
    if (this.AQS.APU != null)
      this.AQS.APU.b(this.AQS.APS, paramString);
    while (true)
    {
      if ((this.AQS.AQP == null) || (!this.AQS.AQP.equals(paramString)))
        j.dUB().dUy();
      f.nJ(System.currentTimeMillis() - this.AQS.APY);
      f.nL(System.currentTimeMillis() - this.AQS.APY);
      AppMethodBeat.o(84898);
      return;
      super.onPageFinished(paramWebView, paramString);
    }
  }

  public final void onPageStarted(com.tencent.smtt.sdk.WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(84897);
    Log.i("X5WebView", "onPageStarted ".concat(String.valueOf(paramString)));
    if (this.AQS.APU != null)
      this.AQS.APU.b(this.AQS.APS, paramString, paramBitmap);
    while (true)
    {
      this.AQS.AQP = "";
      this.AQS.APY = System.currentTimeMillis();
      f.avo(paramString);
      f.dUQ();
      j.dUB().dUx();
      AppMethodBeat.o(84897);
      return;
      super.onPageStarted(paramWebView, paramString, paramBitmap);
    }
  }

  public final void onReceivedError(com.tencent.smtt.sdk.WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(84905);
    if (this.AQS.APU != null)
      this.AQS.APU.a(this.AQS.APS, paramInt, paramString1, paramString2);
    while (true)
    {
      this.AQS.AQP = paramString2;
      f.dUN();
      j.dUB().dUC();
      f.dUR();
      AppMethodBeat.o(84905);
      return;
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    }
  }

  public final void onReceivedHttpError(com.tencent.smtt.sdk.WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    AppMethodBeat.i(84907);
    Log.i("X5WebView", "onReceivedHttpError code:" + paramWebResourceResponse.getStatusCode());
    if (this.AQS.APU != null)
    {
      this.AQS.APU.a(this.AQS.APS, new g.b(paramWebResourceRequest), g.a(paramWebResourceResponse));
      AppMethodBeat.o(84907);
    }
    while (true)
    {
      return;
      super.onReceivedHttpError(paramWebView, paramWebResourceRequest, paramWebResourceResponse);
      AppMethodBeat.o(84907);
    }
  }

  public final void onReceivedSslError(com.tencent.smtt.sdk.WebView paramWebView, SslErrorHandler paramSslErrorHandler, com.tencent.smtt.export.external.interfaces.SslError paramSslError)
  {
    AppMethodBeat.i(84906);
    Log.i("X5WebView", "onReceivedSslError " + paramSslError.getPrimaryError());
    if (this.AQS.APU != null)
    {
      s locals = this.AQS.APU;
      com.tencent.xweb.WebView localWebView = this.AQS.APS;
      paramSslErrorHandler = new g.a(paramSslErrorHandler);
      if (paramSslError != null)
      {
        paramWebView = new android.net.http.SslError(paramSslError.getPrimaryError(), paramSslError.getCertificate());
        locals.a(localWebView, paramSslErrorHandler, paramWebView);
        AppMethodBeat.o(84906);
      }
    }
    while (true)
    {
      return;
      paramWebView = null;
      break;
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      AppMethodBeat.o(84906);
    }
  }

  public final void onScaleChanged(com.tencent.smtt.sdk.WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(84903);
    if (this.AQS.APU != null)
    {
      this.AQS.APU.a(this.AQS.APS, paramFloat1, paramFloat2);
      AppMethodBeat.o(84903);
    }
    while (true)
    {
      return;
      super.onScaleChanged(paramWebView, paramFloat1, paramFloat2);
      AppMethodBeat.o(84903);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(84901);
    if (this.AQS.APU != null)
    {
      paramWebView = new g.b(paramWebResourceRequest);
      paramWebView = a.b(this.AQS.APU.a(this.AQS.APS, paramWebView));
      AppMethodBeat.o(84901);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.shouldInterceptRequest(paramWebView, paramWebResourceRequest);
      AppMethodBeat.o(84901);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramWebView, WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(84902);
    if (this.AQS.APU != null)
    {
      paramWebView = new g.b(paramWebResourceRequest);
      paramWebView = a.b(this.AQS.APU.a(this.AQS.APS, paramWebView, paramBundle));
      AppMethodBeat.o(84902);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.shouldInterceptRequest(paramWebView, paramWebResourceRequest, paramBundle);
      AppMethodBeat.o(84902);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84900);
    if (this.AQS.APU != null)
    {
      paramWebView = a.b(this.AQS.APU.c(this.AQS.APS, paramString));
      AppMethodBeat.o(84900);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.shouldInterceptRequest(paramWebView, paramString);
      AppMethodBeat.o(84900);
    }
  }

  public final boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84896);
    Log.i("X5WebView", "shouldOverrideUrlLoading ".concat(String.valueOf(paramString)));
    boolean bool;
    if (this.AQS.APU != null)
    {
      bool = this.AQS.APU.a(this.AQS.APS, paramString);
      AppMethodBeat.o(84896);
    }
    while (true)
    {
      return bool;
      bool = super.shouldOverrideUrlLoading(paramWebView, paramString);
      AppMethodBeat.o(84896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.k.2
 * JD-Core Version:    0.6.2
 */