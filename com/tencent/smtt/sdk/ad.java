package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.r;
import com.tencent.smtt.utils.w;
import java.io.InputStream;
import java.util.Map;

@SuppressLint({"NewApi", "Override"})
class ad extends android.webkit.WebViewClient
{
  private static String c = null;
  private WebViewClient a;
  private WebView b;

  ad(WebView paramWebView, WebViewClient paramWebViewClient)
  {
    this.b = paramWebView;
    this.a = paramWebViewClient;
  }

  public void doUpdateVisitedHistory(android.webkit.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(64248);
    this.b.a(paramWebView);
    this.a.doUpdateVisitedHistory(this.b, paramString, paramBoolean);
    AppMethodBeat.o(64248);
  }

  public void onFormResubmission(android.webkit.WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    AppMethodBeat.i(64241);
    this.b.a(paramWebView);
    this.a.onFormResubmission(this.b, paramMessage1, paramMessage2);
    AppMethodBeat.o(64241);
  }

  public void onLoadResource(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(64236);
    this.b.a(paramWebView);
    this.a.onLoadResource(this.b, paramString);
    AppMethodBeat.o(64236);
  }

  public void onPageFinished(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(64242);
    if (c == null)
    {
      localObject = w.a();
      if (localObject != null)
      {
        ((w)localObject).a(true);
        c = Boolean.toString(true);
      }
    }
    this.b.a(paramWebView);
    Object localObject = this.b;
    ((WebView)localObject).a += 1;
    this.a.onPageFinished(this.b, paramString);
    if ("com.qzone".equals(paramWebView.getContext().getApplicationInfo().packageName))
      this.b.a(paramWebView.getContext());
    TbsLog.app_extra("SystemWebViewClient", paramWebView.getContext());
    WebView.d();
    if ((!TbsShareManager.mHasQueryed) && (this.b.getContext() != null) && (TbsShareManager.isThirdPartyApp(this.b.getContext())))
    {
      TbsShareManager.mHasQueryed = true;
      new Thread(new ae(this)).start();
    }
    if ((this.b.getContext() != null) && (!TbsLogReport.getInstance(this.b.getContext()).getShouldUploadEventReport()))
    {
      TbsLogReport.getInstance(this.b.getContext()).setShouldUploadEventReport(true);
      TbsLogReport.getInstance(this.b.getContext()).dailyReport();
    }
    AppMethodBeat.o(64242);
  }

  public void onPageStarted(android.webkit.WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64243);
    this.b.a(paramWebView);
    this.a.onPageStarted(this.b, paramString, paramBitmap);
    AppMethodBeat.o(64243);
  }

  public void onReceivedClientCertRequest(android.webkit.WebView paramWebView, ClientCertRequest paramClientCertRequest)
  {
    AppMethodBeat.i(64251);
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.b.a(paramWebView);
      paramWebView = new ad.a(paramClientCertRequest);
      this.a.onReceivedClientCertRequest(this.b, paramWebView);
    }
    AppMethodBeat.o(64251);
  }

  public void onReceivedError(android.webkit.WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64244);
    this.b.a(paramWebView);
    this.a.onReceivedError(this.b, paramInt, paramString1, paramString2);
    AppMethodBeat.o(64244);
  }

  public void onReceivedError(android.webkit.WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    Object localObject = null;
    AppMethodBeat.i(64245);
    this.b.a(paramWebView);
    if (paramWebResourceRequest != null);
    for (paramWebView = new ad.f(paramWebResourceRequest); ; paramWebView = null)
    {
      paramWebResourceRequest = localObject;
      if (paramWebResourceError != null)
        paramWebResourceRequest = new af(this, paramWebResourceError);
      this.a.onReceivedError(this.b, paramWebView, paramWebResourceRequest);
      AppMethodBeat.o(64245);
      return;
    }
  }

  public void onReceivedHttpAuthRequest(android.webkit.WebView paramWebView, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64247);
    this.b.a(paramWebView);
    this.a.onReceivedHttpAuthRequest(this.b, new ad.b(paramHttpAuthHandler), paramString1, paramString2);
    AppMethodBeat.o(64247);
  }

  public void onReceivedHttpError(android.webkit.WebView paramWebView, WebResourceRequest paramWebResourceRequest, android.webkit.WebResourceResponse paramWebResourceResponse)
  {
    AppMethodBeat.i(64246);
    this.b.a(paramWebView);
    paramWebView = new ad.f(paramWebResourceRequest);
    paramWebResourceRequest = new g(paramWebResourceResponse);
    this.a.onReceivedHttpError(this.b, paramWebView, paramWebResourceRequest);
    AppMethodBeat.o(64246);
  }

  @TargetApi(12)
  public void onReceivedLoginRequest(android.webkit.WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64249);
    if (Build.VERSION.SDK_INT >= 12)
    {
      this.b.a(paramWebView);
      this.a.onReceivedLoginRequest(this.b, paramString1, paramString2, paramString3);
    }
    AppMethodBeat.o(64249);
  }

  @TargetApi(8)
  public void onReceivedSslError(android.webkit.WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    AppMethodBeat.i(64250);
    if (Build.VERSION.SDK_INT >= 8)
    {
      this.b.a(paramWebView);
      this.a.onReceivedSslError(this.b, new ad.c(paramSslErrorHandler), new ad.d(paramSslError));
    }
    AppMethodBeat.o(64250);
  }

  public void onScaleChanged(android.webkit.WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(64252);
    this.b.a(paramWebView);
    this.a.onScaleChanged(this.b, paramFloat1, paramFloat2);
    AppMethodBeat.o(64252);
  }

  public void onTooManyRedirects(android.webkit.WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    AppMethodBeat.i(64253);
    this.b.a(paramWebView);
    this.a.onTooManyRedirects(this.b, paramMessage1, paramMessage2);
    AppMethodBeat.o(64253);
  }

  public void onUnhandledKeyEvent(android.webkit.WebView paramWebView, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(64254);
    this.b.a(paramWebView);
    this.a.onUnhandledKeyEvent(this.b, paramKeyEvent);
    AppMethodBeat.o(64254);
  }

  public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(64239);
    if (Build.VERSION.SDK_INT < 21)
    {
      AppMethodBeat.o(64239);
      paramWebView = null;
    }
    while (true)
    {
      return paramWebView;
      if (paramWebResourceRequest == null)
      {
        AppMethodBeat.o(64239);
        paramWebView = null;
      }
      else
      {
        boolean bool1 = false;
        boolean bool2 = bool1;
        if (Build.VERSION.SDK_INT >= 24)
        {
          paramWebView = r.a(paramWebResourceRequest, "isRedirect");
          bool2 = bool1;
          if ((paramWebView instanceof Boolean))
            bool2 = ((Boolean)paramWebView).booleanValue();
        }
        paramWebView = new ad.e(this, paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.isForMainFrame(), bool2, paramWebResourceRequest.hasGesture(), paramWebResourceRequest.getMethod(), paramWebResourceRequest.getRequestHeaders());
        paramWebResourceRequest = this.a.shouldInterceptRequest(this.b, paramWebView);
        if (paramWebResourceRequest == null)
        {
          AppMethodBeat.o(64239);
          paramWebView = null;
        }
        else
        {
          paramWebView = new android.webkit.WebResourceResponse(paramWebResourceRequest.getMimeType(), paramWebResourceRequest.getEncoding(), paramWebResourceRequest.getData());
          paramWebView.setResponseHeaders(paramWebResourceRequest.getResponseHeaders());
          int i = paramWebResourceRequest.getStatusCode();
          paramWebResourceRequest = paramWebResourceRequest.getReasonPhrase();
          if ((i != paramWebView.getStatusCode()) || ((paramWebResourceRequest != null) && (!paramWebResourceRequest.equals(paramWebView.getReasonPhrase()))))
            paramWebView.setStatusCodeAndReasonPhrase(i, paramWebResourceRequest);
          AppMethodBeat.o(64239);
        }
      }
    }
  }

  @TargetApi(11)
  public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, String paramString)
  {
    paramWebView = null;
    AppMethodBeat.i(64238);
    if (Build.VERSION.SDK_INT < 11)
      AppMethodBeat.o(64238);
    while (true)
    {
      return paramWebView;
      paramString = this.a.shouldInterceptRequest(this.b, paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(64238);
      }
      else
      {
        paramWebView = new android.webkit.WebResourceResponse(paramString.getMimeType(), paramString.getEncoding(), paramString.getData());
        AppMethodBeat.o(64238);
      }
    }
  }

  public boolean shouldOverrideKeyEvent(android.webkit.WebView paramWebView, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(64240);
    this.b.a(paramWebView);
    boolean bool = this.a.shouldOverrideKeyEvent(this.b, paramKeyEvent);
    AppMethodBeat.o(64240);
    return bool;
  }

  public boolean shouldOverrideUrlLoading(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(64237);
    boolean bool;
    if ((paramString == null) || (this.b.showDebugView(paramString)))
    {
      bool = true;
      AppMethodBeat.o(64237);
    }
    while (true)
    {
      return bool;
      this.b.a(paramWebView);
      bool = this.a.shouldOverrideUrlLoading(this.b, paramString);
      AppMethodBeat.o(64237);
    }
  }

  static class g extends com.tencent.smtt.export.external.interfaces.WebResourceResponse
  {
    android.webkit.WebResourceResponse a;

    public g(android.webkit.WebResourceResponse paramWebResourceResponse)
    {
      this.a = paramWebResourceResponse;
    }

    public InputStream getData()
    {
      AppMethodBeat.i(64225);
      InputStream localInputStream = this.a.getData();
      AppMethodBeat.o(64225);
      return localInputStream;
    }

    public String getEncoding()
    {
      AppMethodBeat.i(64226);
      String str = this.a.getEncoding();
      AppMethodBeat.o(64226);
      return str;
    }

    public String getMimeType()
    {
      AppMethodBeat.i(64227);
      String str = this.a.getMimeType();
      AppMethodBeat.o(64227);
      return str;
    }

    public String getReasonPhrase()
    {
      AppMethodBeat.i(64228);
      String str = this.a.getReasonPhrase();
      AppMethodBeat.o(64228);
      return str;
    }

    public Map<String, String> getResponseHeaders()
    {
      AppMethodBeat.i(64229);
      Map localMap = this.a.getResponseHeaders();
      AppMethodBeat.o(64229);
      return localMap;
    }

    public int getStatusCode()
    {
      AppMethodBeat.i(64230);
      int i = this.a.getStatusCode();
      AppMethodBeat.o(64230);
      return i;
    }

    public void setData(InputStream paramInputStream)
    {
      AppMethodBeat.i(64231);
      this.a.setData(paramInputStream);
      AppMethodBeat.o(64231);
    }

    public void setEncoding(String paramString)
    {
      AppMethodBeat.i(64232);
      this.a.setEncoding(paramString);
      AppMethodBeat.o(64232);
    }

    public void setMimeType(String paramString)
    {
      AppMethodBeat.i(64233);
      this.a.setMimeType(paramString);
      AppMethodBeat.o(64233);
    }

    public void setResponseHeaders(Map<String, String> paramMap)
    {
      AppMethodBeat.i(64234);
      this.a.setResponseHeaders(paramMap);
      AppMethodBeat.o(64234);
    }

    public void setStatusCodeAndReasonPhrase(int paramInt, String paramString)
    {
      AppMethodBeat.i(64235);
      this.a.setStatusCodeAndReasonPhrase(paramInt, paramString);
      AppMethodBeat.o(64235);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad
 * JD-Core Version:    0.6.2
 */