package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;

public class WebChromeClient
{
  public Bitmap getDefaultVideoPoster()
  {
    return null;
  }

  public View getVideoLoadingProgressView()
  {
    return null;
  }

  public void getVisitedHistory(ValueCallback<String[]> paramValueCallback)
  {
  }

  public void onCloseWindow(WebView paramWebView)
  {
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }

  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    return false;
  }

  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    AppMethodBeat.i(64689);
    paramQuotaUpdater.updateQuota(paramLong2);
    AppMethodBeat.o(64689);
  }

  public void onGeolocationPermissionsHidePrompt()
  {
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    AppMethodBeat.i(64690);
    paramGeolocationPermissionsCallback.invoke(paramString, true, true);
    AppMethodBeat.o(64690);
  }

  public void onHideCustomView()
  {
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }

  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }

  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return false;
  }

  public boolean onJsTimeout()
  {
    return true;
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
  }

  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    AppMethodBeat.i(64691);
    paramQuotaUpdater.updateQuota(paramLong2);
    AppMethodBeat.o(64691);
  }

  public void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap)
  {
  }

  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
  }

  public void onReceivedTouchIconUrl(WebView paramWebView, String paramString, boolean paramBoolean)
  {
  }

  public void onRequestFocus(WebView paramWebView)
  {
  }

  public void onShowCustomView(View paramView, int paramInt, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
  }

  public boolean onShowFileChooser(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    return false;
  }

  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64692);
    paramValueCallback.onReceiveValue(null);
    AppMethodBeat.o(64692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebChromeClient
 * JD-Core Version:    0.6.2
 */