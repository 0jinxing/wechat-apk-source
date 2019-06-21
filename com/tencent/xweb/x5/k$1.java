package com.tencent.xweb.x5;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage.MessageLevel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient.FileChooserParams;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.l;
import org.xwalk.core.Log;

final class k$1 extends b
{
  k$1(k paramk)
  {
  }

  public final View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(84895);
    View localView;
    if (this.AQS.APV != null)
    {
      localView = this.AQS.APV.getVideoLoadingProgressView();
      AppMethodBeat.o(84895);
    }
    while (true)
    {
      return localView;
      localView = super.getVideoLoadingProgressView();
      AppMethodBeat.o(84895);
    }
  }

  public final boolean onConsoleMessage(com.tencent.smtt.export.external.interfaces.ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(84892);
    Log.i("X5WebView", "onConsoleMessage " + paramConsoleMessage.message());
    boolean bool;
    if (this.AQS.APV != null)
    {
      l locall = this.AQS.APV;
      if (paramConsoleMessage == null)
      {
        paramConsoleMessage = null;
        bool = locall.onConsoleMessage(paramConsoleMessage);
        AppMethodBeat.o(84892);
      }
    }
    while (true)
    {
      return bool;
      ConsoleMessage.MessageLevel localMessageLevel = ConsoleMessage.MessageLevel.DEBUG;
      switch (g.1.AQu[paramConsoleMessage.messageLevel().ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        paramConsoleMessage = new android.webkit.ConsoleMessage(paramConsoleMessage.message(), paramConsoleMessage.sourceId(), paramConsoleMessage.lineNumber(), localMessageLevel);
        break;
        localMessageLevel = ConsoleMessage.MessageLevel.DEBUG;
        continue;
        localMessageLevel = ConsoleMessage.MessageLevel.ERROR;
        continue;
        localMessageLevel = ConsoleMessage.MessageLevel.LOG;
        continue;
        localMessageLevel = ConsoleMessage.MessageLevel.TIP;
        continue;
        localMessageLevel = ConsoleMessage.MessageLevel.WARNING;
      }
      bool = super.onConsoleMessage(paramConsoleMessage);
      AppMethodBeat.o(84892);
    }
  }

  public final void onGeolocationPermissionsHidePrompt()
  {
    AppMethodBeat.i(84891);
    Log.i("X5WebView", "onGeolocationPermissionsHidePrompt");
    if (this.AQS.APV == null)
      super.onGeolocationPermissionsHidePrompt();
    AppMethodBeat.o(84891);
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    AppMethodBeat.i(84890);
    Log.i("X5WebView", "onGeolocationPermissionsShowPrompt");
    if (this.AQS.APV != null)
    {
      this.AQS.APV.onGeolocationPermissionsShowPrompt(paramString, new g.e(paramGeolocationPermissionsCallback));
      AppMethodBeat.o(84890);
    }
    while (true)
    {
      return;
      super.onGeolocationPermissionsShowPrompt(paramString, paramGeolocationPermissionsCallback);
      AppMethodBeat.o(84890);
    }
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(84886);
    Log.i("X5WebView", "onHideCustomView");
    if (this.AQS.APV != null)
    {
      this.AQS.APV.onHideCustomView();
      AppMethodBeat.o(84886);
    }
    while (true)
    {
      return;
      super.onHideCustomView();
      AppMethodBeat.o(84886);
    }
  }

  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(84887);
    Log.i("X5WebView", "onJsAlert");
    boolean bool;
    if (this.AQS.APV != null)
    {
      bool = this.AQS.APV.a(this.AQS.APS, paramString1, paramString2, new g.f(paramJsResult));
      AppMethodBeat.o(84887);
    }
    while (true)
    {
      return bool;
      bool = super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
      AppMethodBeat.o(84887);
    }
  }

  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AppMethodBeat.i(84888);
    Log.i("X5WebView", "onJsConfirm");
    boolean bool;
    if (this.AQS.APV != null)
    {
      bool = this.AQS.APV.b(this.AQS.APS, paramString1, paramString2, new g.f(paramJsResult));
      AppMethodBeat.o(84888);
    }
    while (true)
    {
      return bool;
      bool = super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
      AppMethodBeat.o(84888);
    }
  }

  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    AppMethodBeat.i(84889);
    Log.i("X5WebView", "onJsPrompt");
    boolean bool;
    if (this.AQS.APV != null)
    {
      bool = this.AQS.APV.a(this.AQS.APS, paramString1, paramString2, paramString3, new g.g(paramJsPromptResult));
      AppMethodBeat.o(84889);
    }
    while (true)
    {
      return bool;
      bool = super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
      AppMethodBeat.o(84889);
    }
  }

  public final void onProgressChanged(WebView paramWebView, int paramInt)
  {
    AppMethodBeat.i(84883);
    if (this.AQS.APV != null)
    {
      this.AQS.APV.a(this.AQS.APS, paramInt);
      AppMethodBeat.o(84883);
    }
    while (true)
    {
      return;
      super.onProgressChanged(paramWebView, paramInt);
      AppMethodBeat.o(84883);
    }
  }

  public final void onReceivedTitle(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(84884);
    Log.i("X5WebView", "onReceivedTitle: ".concat(String.valueOf(paramString)));
    if (this.AQS.APV != null)
    {
      this.AQS.APV.d(this.AQS.APS, paramString);
      AppMethodBeat.o(84884);
    }
    while (true)
    {
      return;
      super.onReceivedTitle(paramWebView, paramString);
      AppMethodBeat.o(84884);
    }
  }

  public final void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(84885);
    Log.i("X5WebView", "onShowCustomView");
    if (this.AQS.APV != null)
    {
      this.AQS.APV.onShowCustomView(paramView, new g.c(paramCustomViewCallback));
      AppMethodBeat.o(84885);
    }
    while (true)
    {
      return;
      super.onShowCustomView(paramView, paramCustomViewCallback);
      AppMethodBeat.o(84885);
    }
  }

  public final boolean onShowFileChooser(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    AppMethodBeat.i(84894);
    Log.i("X5WebView", "onShowFileChooser last method");
    boolean bool;
    if (this.AQS.APV != null)
    {
      bool = this.AQS.APV.a(this.AQS.APS, paramValueCallback, new g.d(paramFileChooserParams));
      AppMethodBeat.o(84894);
    }
    while (true)
    {
      return bool;
      bool = super.onShowFileChooser(paramWebView, new a.d(paramValueCallback), paramFileChooserParams);
      AppMethodBeat.o(84894);
    }
  }

  public final void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(84893);
    Log.i("X5WebView", "openFileChooser with three param");
    if (this.AQS.APV != null)
    {
      this.AQS.APV.openFileChooser(paramValueCallback, paramString1, paramString2);
      AppMethodBeat.o(84893);
    }
    while (true)
    {
      return;
      paramValueCallback.onReceiveValue(null);
      AppMethodBeat.o(84893);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.k.1
 * JD-Core Version:    0.6.2
 */