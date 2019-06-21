package com.tencent.xweb.sys;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.a.a;
import com.tencent.xweb.c.j;
import com.tencent.xweb.extension.video.b;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import com.tencent.xweb.util.f;
import org.xwalk.core.Log;

final class e$1 extends WebViewClient
{
  e$1(e parame)
  {
  }

  public final void doUpdateVisitedHistory(android.webkit.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(84693);
    if (this.AQc.APU != null)
    {
      this.AQc.APU.a(this.AQc.APS, paramString, paramBoolean);
      AppMethodBeat.o(84693);
    }
    while (true)
    {
      return;
      super.doUpdateVisitedHistory(paramWebView, paramString, paramBoolean);
      AppMethodBeat.o(84693);
    }
  }

  public final void onLoadResource(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84689);
    if (this.AQc.APU != null)
    {
      this.AQc.APU.h(this.AQc.APS, paramString);
      AppMethodBeat.o(84689);
    }
    while (true)
    {
      return;
      super.onLoadResource(paramWebView, paramString);
      AppMethodBeat.o(84689);
    }
  }

  public final void onPageFinished(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84688);
    Log.i("SysWebView", "onPageFinished ".concat(String.valueOf(paramString)));
    boolean bool;
    if (this.AQc.APZ != null)
    {
      b localb = this.AQc.APZ;
      if (this.AQc.APS.getFullscreenVideoKind() == WebView.a.AMY)
      {
        bool = true;
        localb.am(false, bool);
      }
    }
    else
    {
      if (this.AQc.APU == null)
        break label139;
      this.AQc.APU.b(this.AQc.APS, paramString);
    }
    while (true)
    {
      f.nJ(System.currentTimeMillis() - this.AQc.APY);
      f.nK(System.currentTimeMillis() - this.AQc.APY);
      j.dUB().dUH();
      AppMethodBeat.o(84688);
      return;
      bool = false;
      break;
      label139: super.onPageFinished(paramWebView, paramString);
    }
  }

  public final void onPageStarted(android.webkit.WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(84687);
    Log.i("SysWebView", "onPageStarted ".concat(String.valueOf(paramString)));
    if (this.AQc.APU != null)
    {
      this.AQc.APU.b(this.AQc.APS, paramString, paramBitmap);
      this.AQc.APY = System.currentTimeMillis();
      f.avo(paramString);
      f.dUO();
      if (this.AQc.APZ != null)
      {
        paramWebView = this.AQc.APZ;
        if (this.AQc.APS.getFullscreenVideoKind() != WebView.a.AMY)
          break label127;
      }
    }
    label127: for (boolean bool = true; ; bool = false)
    {
      paramWebView.am(true, bool);
      AppMethodBeat.o(84687);
      return;
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      break;
    }
  }

  public final void onReceivedError(android.webkit.WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(84694);
    if (this.AQc.APU != null)
      this.AQc.APU.a(this.AQc.APS, paramInt, paramString1, paramString2);
    while (true)
    {
      f.dUN();
      f.dUP();
      j.dUB().dUI();
      AppMethodBeat.o(84694);
      return;
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    }
  }

  public final void onReceivedHttpError(android.webkit.WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    AppMethodBeat.i(84696);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = String.valueOf(paramWebResourceResponse.getStatusCode());
      Log.i("SysWebView", "onReceivedHttpError code:".concat(String.valueOf(localObject)));
      if (this.AQc.APU == null)
        break label168;
      localObject = this.AQc.APU;
      com.tencent.xweb.WebView localWebView = this.AQc.APS;
      paramWebResourceRequest = new c.e(paramWebResourceRequest);
      if (paramWebResourceResponse != null)
        break label102;
      paramWebView = null;
      label80: ((s)localObject).a(localWebView, paramWebResourceRequest, paramWebView);
      AppMethodBeat.o(84696);
    }
    while (true)
    {
      return;
      localObject = "Invalid";
      break;
      label102: if (Build.VERSION.SDK_INT >= 21)
      {
        paramWebView = new o(paramWebResourceResponse.getMimeType(), paramWebResourceResponse.getEncoding(), paramWebResourceResponse.getStatusCode(), paramWebResourceResponse.getReasonPhrase(), paramWebResourceResponse.getResponseHeaders(), paramWebResourceResponse.getData());
        break label80;
      }
      paramWebView = new o(paramWebResourceResponse.getMimeType(), paramWebResourceResponse.getEncoding(), paramWebResourceResponse.getData());
      break label80;
      label168: super.onReceivedHttpError(paramWebView, paramWebResourceRequest, paramWebResourceResponse);
      AppMethodBeat.o(84696);
    }
  }

  public final void onReceivedSslError(android.webkit.WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    AppMethodBeat.i(84695);
    Log.i("SysWebView", "onReceivedSslError " + paramSslError.getPrimaryError());
    if (this.AQc.APU != null)
    {
      this.AQc.APU.a(this.AQc.APS, new c.a(paramSslErrorHandler), paramSslError);
      AppMethodBeat.o(84695);
    }
    while (true)
    {
      return;
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      AppMethodBeat.o(84695);
    }
  }

  public final void onScaleChanged(android.webkit.WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(84692);
    if (this.AQc.APU != null)
    {
      this.AQc.APU.a(this.AQc.APS, paramFloat1, paramFloat2);
      AppMethodBeat.o(84692);
    }
    while (true)
    {
      return;
      super.onScaleChanged(paramWebView, paramFloat1, paramFloat2);
      AppMethodBeat.o(84692);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    Object localObject = null;
    AppMethodBeat.i(84691);
    c.e locale;
    if (this.AQc.APU != null)
    {
      locale = new c.e(paramWebResourceRequest);
      if (locale.APN == null)
      {
        paramWebResourceRequest = null;
        paramWebView = localObject;
        if (paramWebResourceRequest != null)
          paramWebView = this.AQc.APU.a(this.AQc.APS, locale, paramWebResourceRequest);
        paramWebResourceRequest = paramWebView;
        if (paramWebView == null)
          paramWebResourceRequest = this.AQc.APU.a(this.AQc.APS, locale);
        paramWebView = c.a(paramWebResourceRequest);
        AppMethodBeat.o(84691);
      }
    }
    while (true)
    {
      return paramWebView;
      paramWebResourceRequest = locale.APN.getBundle();
      break;
      paramWebView = super.shouldInterceptRequest(paramWebView, paramWebResourceRequest);
      AppMethodBeat.o(84691);
    }
  }

  public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84690);
    if (this.AQc.APU != null)
    {
      paramWebView = c.a(this.AQc.APU.c(this.AQc.APS, paramString));
      AppMethodBeat.o(84690);
    }
    while (true)
    {
      return paramWebView;
      paramWebView = super.shouldInterceptRequest(paramWebView, paramString);
      AppMethodBeat.o(84690);
    }
  }

  public final boolean shouldOverrideUrlLoading(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84686);
    Log.i("SysWebView", "shouldOverrideUrlLoading ".concat(String.valueOf(paramString)));
    boolean bool;
    if (this.AQc.APU != null)
    {
      bool = this.AQc.APU.a(this.AQc.APS, paramString);
      AppMethodBeat.o(84686);
    }
    while (true)
    {
      return bool;
      bool = super.shouldOverrideUrlLoading(paramWebView, paramString);
      AppMethodBeat.o(84686);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.e.1
 * JD-Core Version:    0.6.2
 */