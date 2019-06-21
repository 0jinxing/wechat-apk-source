package com.tencent.xweb.sys;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.extension.video.b;
import com.tencent.xweb.l;
import com.tencent.xweb.util.f;
import org.xwalk.core.Log;

class SysWebView$1 extends WebChromeClient
{
  SysWebView$1(e parame)
  {
  }

  public View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(84685);
    View localView;
    if (this.AQc.APV != null)
    {
      localView = this.AQc.APV.getVideoLoadingProgressView();
      AppMethodBeat.o(84685);
    }
    while (true)
    {
      return localView;
      localView = LayoutInflater.from(this.AQc.APS.getContext()).inflate(2130970993, null);
      AppMethodBeat.o(84685);
    }
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(84680);
    Log.i("SysWebView", "onConsoleMessage " + paramConsoleMessage.message());
    boolean bool;
    if (this.AQc.APV != null)
    {
      bool = this.AQc.APV.onConsoleMessage(paramConsoleMessage);
      AppMethodBeat.o(84680);
    }
    while (true)
    {
      return bool;
      bool = super.onConsoleMessage(paramConsoleMessage);
      AppMethodBeat.o(84680);
    }
  }

  public void onGeolocationPermissionsHidePrompt()
  {
    AppMethodBeat.i(84679);
    Log.i("SysWebView", "onGeolocationPermissionsHidePrompt");
    if (this.AQc.APV == null)
      super.onGeolocationPermissionsHidePrompt();
    AppMethodBeat.o(84679);
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AppMethodBeat.i(84678);
    Log.i("SysWebView", "onGeolocationPermissionsShowPrompt");
    if (this.AQc.APV != null)
    {
      this.AQc.APV.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
      AppMethodBeat.o(84678);
    }
    while (true)
    {
      return;
      super.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
      AppMethodBeat.o(84678);
    }
  }

  public void onHideCustomView()
  {
    AppMethodBeat.i(84674);
    Log.i("SysWebView", "onHideCustomView");
    if (this.AQc.APV != null)
      this.AQc.APV.aDI();
    if (this.AQc.APZ != null)
    {
      this.AQc.APZ.onHideCustomView();
      AppMethodBeat.o(84674);
    }
    while (true)
    {
      return;
      if (this.AQc.APV != null)
      {
        this.AQc.APV.onHideCustomView();
        AppMethodBeat.o(84674);
      }
      else
      {
        super.onHideCustomView();
        AppMethodBeat.o(84674);
      }
    }
  }

  public boolean onJsAlert(android.webkit.WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(84675);
    Log.i("SysWebView", "onJsAlert");
    boolean bool;
    if (this.AQc.APV != null)
    {
      bool = this.AQc.APV.a(this.AQc.APS, paramString1, paramString2, new c.d(paramJsResult));
      AppMethodBeat.o(84675);
    }
    while (true)
    {
      return bool;
      bool = super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
      AppMethodBeat.o(84675);
    }
  }

  public boolean onJsConfirm(android.webkit.WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(84676);
    Log.i("SysWebView", "onJsConfirm");
    boolean bool;
    if (this.AQc.APV != null)
    {
      bool = this.AQc.APV.b(this.AQc.APS, paramString1, paramString2, new c.d(paramJsResult));
      AppMethodBeat.o(84676);
    }
    while (true)
    {
      return bool;
      bool = super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
      AppMethodBeat.o(84676);
    }
  }

  public boolean onJsPrompt(android.webkit.WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    AppMethodBeat.i(84677);
    Log.i("SysWebView", "onJsPrompt");
    boolean bool;
    if (this.AQc.APV != null)
    {
      bool = this.AQc.APV.a(this.AQc.APS, paramString1, paramString2, paramString3, new c.c(paramJsPromptResult));
      AppMethodBeat.o(84677);
    }
    while (true)
    {
      return bool;
      bool = super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
      AppMethodBeat.o(84677);
    }
  }

  public void onProgressChanged(android.webkit.WebView paramWebView, int paramInt)
  {
    AppMethodBeat.i(84671);
    if (this.AQc.APV != null)
    {
      this.AQc.APV.a(this.AQc.APS, paramInt);
      AppMethodBeat.o(84671);
    }
    while (true)
    {
      return;
      super.onProgressChanged(paramWebView, paramInt);
      AppMethodBeat.o(84671);
    }
  }

  public void onReceivedTitle(android.webkit.WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84672);
    Log.i("SysWebView", "onReceivedTitle: ".concat(String.valueOf(paramString)));
    boolean bool;
    if (this.AQc.APZ != null)
    {
      b localb = this.AQc.APZ;
      if (this.AQc.APS.getFullscreenVideoKind() == WebView.a.AMY)
      {
        bool = true;
        localb.am(true, bool);
      }
    }
    else
    {
      if (this.AQc.APV == null)
        break label105;
      this.AQc.APV.d(this.AQc.APS, paramString);
      AppMethodBeat.o(84672);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label105: super.onReceivedTitle(paramWebView, paramString);
      AppMethodBeat.o(84672);
    }
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(84673);
    Log.i("SysWebView", "onShowCustomView");
    if (this.AQc.APV != null)
      this.AQc.APV.aJY();
    f.dUW();
    if (this.AQc.APZ != null)
    {
      this.AQc.APZ.onShowCustomView(paramView, paramCustomViewCallback);
      AppMethodBeat.o(84673);
    }
    while (true)
    {
      return;
      if (this.AQc.APV != null)
      {
        this.AQc.APV.onShowCustomView(paramView, paramCustomViewCallback);
        AppMethodBeat.o(84673);
      }
      else
      {
        super.onShowCustomView(paramView, paramCustomViewCallback);
        AppMethodBeat.o(84673);
      }
    }
  }

  public boolean onShowFileChooser(android.webkit.WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    AppMethodBeat.i(84684);
    Log.i("SysWebView", "onShowFileChooser last method");
    boolean bool;
    if (this.AQc.APV != null)
    {
      bool = this.AQc.APV.a(this.AQc.APS, paramValueCallback, new c.b(paramFileChooserParams));
      AppMethodBeat.o(84684);
    }
    while (true)
    {
      return bool;
      bool = super.onShowFileChooser(paramWebView, paramValueCallback, paramFileChooserParams);
      AppMethodBeat.o(84684);
    }
  }

  public void openFileChooser(ValueCallback<Uri> paramValueCallback)
  {
    AppMethodBeat.i(84681);
    Log.i("SysWebView", "openFileChooser with one param");
    if (this.AQc.APV != null)
    {
      this.AQc.APV.openFileChooser(paramValueCallback, null, null);
      AppMethodBeat.o(84681);
    }
    while (true)
    {
      return;
      paramValueCallback.onReceiveValue(null);
      AppMethodBeat.o(84681);
    }
  }

  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString)
  {
    AppMethodBeat.i(84682);
    Log.i("SysWebView", "openFileChooser with two param");
    if (this.AQc.APV != null)
    {
      this.AQc.APV.openFileChooser(paramValueCallback, paramString, null);
      AppMethodBeat.o(84682);
    }
    while (true)
    {
      return;
      paramValueCallback.onReceiveValue(null);
      AppMethodBeat.o(84682);
    }
  }

  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(84683);
    Log.i("SysWebView", "openFileChooser with three param");
    if (this.AQc.APV != null)
    {
      this.AQc.APV.openFileChooser(paramValueCallback, paramString1, paramString2);
      AppMethodBeat.o(84683);
    }
    while (true)
    {
      return;
      paramValueCallback.onReceiveValue(null);
      AppMethodBeat.o(84683);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.SysWebView.1
 * JD-Core Version:    0.6.2
 */