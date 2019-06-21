package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.FileChooserParams;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;
import com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient;

class q extends X5ProxyWebChromeClient
{
  private WebView a;
  private WebChromeClient b;

  public q(IX5WebChromeClient paramIX5WebChromeClient, WebView paramWebView, WebChromeClient paramWebChromeClient)
  {
    super(paramIX5WebChromeClient);
    this.a = paramWebView;
    this.b = paramWebChromeClient;
  }

  public Bitmap getDefaultVideoPoster()
  {
    AppMethodBeat.i(64093);
    Bitmap localBitmap = this.b.getDefaultVideoPoster();
    AppMethodBeat.o(64093);
    return localBitmap;
  }

  public void getVisitedHistory(ValueCallback<String[]> paramValueCallback)
  {
  }

  public void onCloseWindow(IX5WebViewBase paramIX5WebViewBase)
  {
    AppMethodBeat.i(64094);
    this.a.a(paramIX5WebViewBase);
    this.b.onCloseWindow(this.a);
    AppMethodBeat.o(64094);
  }

  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(64095);
    boolean bool = this.b.onConsoleMessage(paramConsoleMessage);
    AppMethodBeat.o(64095);
    return bool;
  }

  public boolean onCreateWindow(IX5WebViewBase paramIX5WebViewBase, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    AppMethodBeat.i(64096);
    paramIX5WebViewBase = this.a;
    paramIX5WebViewBase.getClass();
    paramIX5WebViewBase = new WebView.WebViewTransport(paramIX5WebViewBase);
    paramMessage = Message.obtain(paramMessage.getTarget(), new r(this, paramIX5WebViewBase, paramMessage));
    paramMessage.obj = paramIX5WebViewBase;
    paramBoolean1 = this.b.onCreateWindow(this.a, paramBoolean1, paramBoolean2, paramMessage);
    AppMethodBeat.o(64096);
    return paramBoolean1;
  }

  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, QuotaUpdater paramQuotaUpdater)
  {
    AppMethodBeat.i(64092);
    this.b.onExceededDatabaseQuota(paramString1, paramString2, paramLong1, paramLong2, paramLong3, new q.a(this, paramQuotaUpdater));
    AppMethodBeat.o(64092);
  }

  public void onGeolocationPermissionsHidePrompt()
  {
    AppMethodBeat.i(64097);
    this.b.onGeolocationPermissionsHidePrompt();
    AppMethodBeat.o(64097);
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    AppMethodBeat.i(64098);
    this.b.onGeolocationPermissionsShowPrompt(paramString, paramGeolocationPermissionsCallback);
    AppMethodBeat.o(64098);
  }

  public void onHideCustomView()
  {
    AppMethodBeat.i(64099);
    this.b.onHideCustomView();
    AppMethodBeat.o(64099);
  }

  public boolean onJsAlert(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(64100);
    this.a.a(paramIX5WebViewBase);
    boolean bool = this.b.onJsAlert(this.a, paramString1, paramString2, paramJsResult);
    AppMethodBeat.o(64100);
    return bool;
  }

  public boolean onJsBeforeUnload(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(64103);
    this.a.a(paramIX5WebViewBase);
    boolean bool = this.b.onJsBeforeUnload(this.a, paramString1, paramString2, paramJsResult);
    AppMethodBeat.o(64103);
    return bool;
  }

  public boolean onJsConfirm(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(64101);
    this.a.a(paramIX5WebViewBase);
    boolean bool = this.b.onJsConfirm(this.a, paramString1, paramString2, paramJsResult);
    AppMethodBeat.o(64101);
    return bool;
  }

  public boolean onJsPrompt(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    AppMethodBeat.i(64102);
    this.a.a(paramIX5WebViewBase);
    boolean bool = this.b.onJsPrompt(this.a, paramString1, paramString2, paramString3, paramJsPromptResult);
    AppMethodBeat.o(64102);
    return bool;
  }

  public boolean onJsTimeout()
  {
    AppMethodBeat.i(64104);
    boolean bool = this.b.onJsTimeout();
    AppMethodBeat.o(64104);
    return bool;
  }

  public void onProgressChanged(IX5WebViewBase paramIX5WebViewBase, int paramInt)
  {
    AppMethodBeat.i(64105);
    this.a.a(paramIX5WebViewBase);
    this.b.onProgressChanged(this.a, paramInt);
    AppMethodBeat.o(64105);
  }

  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, QuotaUpdater paramQuotaUpdater)
  {
    AppMethodBeat.i(64106);
    this.b.onReachedMaxAppCacheSize(paramLong1, paramLong2, new q.a(this, paramQuotaUpdater));
    AppMethodBeat.o(64106);
  }

  public void onReceivedIcon(IX5WebViewBase paramIX5WebViewBase, Bitmap paramBitmap)
  {
    AppMethodBeat.i(64107);
    this.a.a(paramIX5WebViewBase);
    this.b.onReceivedIcon(this.a, paramBitmap);
    AppMethodBeat.o(64107);
  }

  public void onReceivedTitle(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    AppMethodBeat.i(64109);
    this.a.a(paramIX5WebViewBase);
    this.b.onReceivedTitle(this.a, paramString);
    AppMethodBeat.o(64109);
  }

  public void onReceivedTouchIconUrl(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(64108);
    this.a.a(paramIX5WebViewBase);
    this.b.onReceivedTouchIconUrl(this.a, paramString, paramBoolean);
    AppMethodBeat.o(64108);
  }

  public void onRequestFocus(IX5WebViewBase paramIX5WebViewBase)
  {
    AppMethodBeat.i(64110);
    this.a.a(paramIX5WebViewBase);
    this.b.onRequestFocus(this.a);
    AppMethodBeat.o(64110);
  }

  public void onShowCustomView(View paramView, int paramInt, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(64112);
    this.b.onShowCustomView(paramView, paramInt, paramCustomViewCallback);
    AppMethodBeat.o(64112);
  }

  public void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(64111);
    this.b.onShowCustomView(paramView, paramCustomViewCallback);
    AppMethodBeat.o(64111);
  }

  public boolean onShowFileChooser(IX5WebViewBase paramIX5WebViewBase, ValueCallback<Uri[]> paramValueCallback, IX5WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    AppMethodBeat.i(64114);
    paramValueCallback = new t(this, paramValueCallback);
    paramFileChooserParams = new u(this, paramFileChooserParams);
    this.a.a(paramIX5WebViewBase);
    boolean bool = this.b.onShowFileChooser(this.a, paramValueCallback, paramFileChooserParams);
    AppMethodBeat.o(64114);
    return bool;
  }

  public void openFileChooser(ValueCallback<Uri[]> paramValueCallback, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(64113);
    this.b.openFileChooser(new s(this, paramValueCallback), paramString1, paramString2);
    AppMethodBeat.o(64113);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.q
 * JD-Core Version:    0.6.2
 */