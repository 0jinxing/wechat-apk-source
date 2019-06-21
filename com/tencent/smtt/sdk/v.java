package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;
import com.tencent.smtt.utils.TbsLog;

class v extends X5ProxyWebViewClient
{
  private static String c = null;
  private WebViewClient a;
  private WebView b;

  public v(IX5WebViewClient paramIX5WebViewClient, WebView paramWebView, WebViewClient paramWebViewClient)
  {
    super(paramIX5WebViewClient);
    this.b = paramWebView;
    this.a = paramWebViewClient;
    this.a.a = this;
  }

  public void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64138);
    super.onPageStarted(this.b.c(), 0, 0, paramString, paramBitmap);
    AppMethodBeat.o(64138);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(64130);
    paramString = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
    paramString.addFlags(268435456);
    try
    {
      if (this.b.getContext() != null)
        this.b.getContext().startActivity(paramString);
      AppMethodBeat.o(64130);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(64130);
    }
  }

  public void countPVContentCacheCallBack(String paramString)
  {
    paramString = this.b;
    paramString.a += 1;
  }

  public void doUpdateVisitedHistory(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(64116);
    this.b.a(paramIX5WebViewBase);
    this.a.doUpdateVisitedHistory(this.b, paramString, paramBoolean);
    AppMethodBeat.o(64116);
  }

  public void onDetectedBlankScreen(IX5WebViewBase paramIX5WebViewBase, String paramString, int paramInt)
  {
    AppMethodBeat.i(64139);
    this.b.a(paramIX5WebViewBase);
    this.a.onDetectedBlankScreen(paramString, paramInt);
    AppMethodBeat.o(64139);
  }

  public void onFormResubmission(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    AppMethodBeat.i(64117);
    this.b.a(paramIX5WebViewBase);
    this.a.onFormResubmission(this.b, paramMessage1, paramMessage2);
    AppMethodBeat.o(64117);
  }

  public void onLoadResource(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    AppMethodBeat.i(64118);
    this.b.a(paramIX5WebViewBase);
    this.a.onLoadResource(this.b, paramString);
    AppMethodBeat.o(64118);
  }

  public void onPageFinished(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(64119);
    if (c == null)
    {
      localObject = com.tencent.smtt.utils.w.a();
      if (localObject != null)
      {
        ((com.tencent.smtt.utils.w)localObject).a(false);
        c = Boolean.toString(false);
      }
    }
    this.b.a(paramIX5WebViewBase);
    Object localObject = this.b;
    ((WebView)localObject).a += 1;
    this.a.onPageFinished(this.b, paramString);
    if ("com.qzone".equals(paramIX5WebViewBase.getView().getContext().getApplicationInfo().packageName))
      this.b.a(paramIX5WebViewBase.getView().getContext());
    TbsLog.app_extra("SmttWebViewClient", paramIX5WebViewBase.getView().getContext());
    try
    {
      super.onPageFinished(paramIX5WebViewBase, paramInt1, paramInt2, paramString);
      label135: WebView.d();
      if ((!TbsShareManager.mHasQueryed) && (this.b.getContext() != null) && (TbsShareManager.isThirdPartyApp(this.b.getContext())))
      {
        TbsShareManager.mHasQueryed = true;
        new Thread(new w(this)).start();
      }
      if ((this.b.getContext() != null) && (!TbsLogReport.getInstance(this.b.getContext()).getShouldUploadEventReport()))
      {
        TbsLogReport.getInstance(this.b.getContext()).setShouldUploadEventReport(true);
        TbsLogReport.getInstance(this.b.getContext()).dailyReport();
      }
      AppMethodBeat.o(64119);
      return;
    }
    catch (Exception paramIX5WebViewBase)
    {
      break label135;
    }
  }

  public void onPageFinished(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    AppMethodBeat.i(64140);
    onPageFinished(paramIX5WebViewBase, 0, 0, paramString);
    AppMethodBeat.o(64140);
  }

  public void onPageStarted(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64120);
    this.b.a(paramIX5WebViewBase);
    this.a.onPageStarted(this.b, paramString, paramBitmap);
    AppMethodBeat.o(64120);
  }

  public void onPageStarted(IX5WebViewBase paramIX5WebViewBase, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64141);
    onPageStarted(paramIX5WebViewBase, 0, 0, paramString, paramBitmap);
    AppMethodBeat.o(64141);
  }

  public void onReceivedClientCertRequest(IX5WebViewBase paramIX5WebViewBase, ClientCertRequest paramClientCertRequest)
  {
    AppMethodBeat.i(64126);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedClientCertRequest(this.b, paramClientCertRequest);
    AppMethodBeat.o(64126);
  }

  public void onReceivedError(IX5WebViewBase paramIX5WebViewBase, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64122);
    int i = paramInt;
    if (paramInt < -15)
    {
      if (paramInt == -17)
        i = -1;
    }
    else
    {
      this.b.a(paramIX5WebViewBase);
      this.a.onReceivedError(this.b, i, paramString1, paramString2);
      AppMethodBeat.o(64122);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(64122);
    }
  }

  public void onReceivedError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    AppMethodBeat.i(64121);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedError(this.b, paramWebResourceRequest, paramWebResourceError);
    AppMethodBeat.o(64121);
  }

  public void onReceivedHttpAuthRequest(IX5WebViewBase paramIX5WebViewBase, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64124);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedHttpAuthRequest(this.b, paramHttpAuthHandler, paramString1, paramString2);
    AppMethodBeat.o(64124);
  }

  public void onReceivedHttpError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    AppMethodBeat.i(64123);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedHttpError(this.b, paramWebResourceRequest, paramWebResourceResponse);
    AppMethodBeat.o(64123);
  }

  public void onReceivedLoginRequest(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(64137);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedLoginRequest(this.b, paramString1, paramString2, paramString3);
    AppMethodBeat.o(64137);
  }

  public void onReceivedSslError(IX5WebViewBase paramIX5WebViewBase, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    AppMethodBeat.i(64125);
    this.b.a(paramIX5WebViewBase);
    this.a.onReceivedSslError(this.b, paramSslErrorHandler, paramSslError);
    AppMethodBeat.o(64125);
  }

  public void onScaleChanged(IX5WebViewBase paramIX5WebViewBase, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(64127);
    this.b.a(paramIX5WebViewBase);
    this.a.onScaleChanged(this.b, paramFloat1, paramFloat2);
    AppMethodBeat.o(64127);
  }

  public void onTooManyRedirects(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    AppMethodBeat.i(64132);
    this.b.a(paramIX5WebViewBase);
    this.a.onTooManyRedirects(this.b, paramMessage1, paramMessage2);
    AppMethodBeat.o(64132);
  }

  public void onUnhandledKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(64128);
    this.b.a(paramIX5WebViewBase);
    this.a.onUnhandledKeyEvent(this.b, paramKeyEvent);
    AppMethodBeat.o(64128);
  }

  public WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(64135);
    this.b.a(paramIX5WebViewBase);
    paramIX5WebViewBase = this.a.shouldInterceptRequest(this.b, paramWebResourceRequest);
    AppMethodBeat.o(64135);
    return paramIX5WebViewBase;
  }

  public WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    AppMethodBeat.i(64136);
    this.b.a(paramIX5WebViewBase);
    paramIX5WebViewBase = this.a.shouldInterceptRequest(this.b, paramWebResourceRequest, paramBundle);
    AppMethodBeat.o(64136);
    return paramIX5WebViewBase;
  }

  public WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    AppMethodBeat.i(64134);
    this.b.a(paramIX5WebViewBase);
    paramIX5WebViewBase = this.a.shouldInterceptRequest(this.b, paramString);
    AppMethodBeat.o(64134);
    return paramIX5WebViewBase;
  }

  public boolean shouldOverrideKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(64129);
    this.b.a(paramIX5WebViewBase);
    boolean bool = this.a.shouldOverrideKeyEvent(this.b, paramKeyEvent);
    AppMethodBeat.o(64129);
    return bool;
  }

  public boolean shouldOverrideUrlLoading(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest)
  {
    boolean bool1 = true;
    AppMethodBeat.i(64133);
    if ((paramWebResourceRequest != null) && (paramWebResourceRequest.getUrl() != null));
    for (String str = paramWebResourceRequest.getUrl().toString(); ; str = null)
    {
      boolean bool2;
      if ((str == null) || (this.b.showDebugView(str)))
      {
        AppMethodBeat.o(64133);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        this.b.a(paramIX5WebViewBase);
        bool2 = this.a.shouldOverrideUrlLoading(this.b, paramWebResourceRequest);
        if (!bool2)
        {
          if (str.startsWith("wtai://wp/mc;"))
          {
            paramIX5WebViewBase = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + str.substring(13)));
            this.b.getContext().startActivity(paramIX5WebViewBase);
            AppMethodBeat.o(64133);
            bool2 = bool1;
          }
          else if (str.startsWith("tel:"))
          {
            a(str);
            AppMethodBeat.o(64133);
            bool2 = bool1;
          }
        }
        else
          AppMethodBeat.o(64133);
      }
    }
  }

  public boolean shouldOverrideUrlLoading(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(64131);
    if ((paramString == null) || (this.b.showDebugView(paramString)))
      AppMethodBeat.o(64131);
    while (true)
    {
      return bool1;
      this.b.a(paramIX5WebViewBase);
      boolean bool2 = this.a.shouldOverrideUrlLoading(this.b, paramString);
      if (!bool2)
      {
        if (paramString.startsWith("wtai://wp/mc;"))
        {
          paramIX5WebViewBase = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + paramString.substring(13)));
          this.b.getContext().startActivity(paramIX5WebViewBase);
          AppMethodBeat.o(64131);
        }
        else if (paramString.startsWith("tel:"))
        {
          a(paramString);
          AppMethodBeat.o(64131);
        }
      }
      else
      {
        AppMethodBeat.o(64131);
        bool1 = bool2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.v
 * JD-Core Version:    0.6.2
 */