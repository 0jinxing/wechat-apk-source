package com.tencent.mm.plugin.webview.luggage;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.g;
import com.tencent.xweb.h;
import com.tencent.xweb.l;
import com.tencent.xweb.l.a;

public class c extends l
{
  private l uhP;

  public c()
  {
    AppMethodBeat.i(5989);
    this.uhP = new l();
    AppMethodBeat.o(5989);
  }

  public final void a(WebView paramWebView, int paramInt)
  {
    AppMethodBeat.i(5999);
    this.uhP.a(paramWebView, paramInt);
    AppMethodBeat.o(5999);
  }

  public final void a(l paraml)
  {
    if (paraml != null)
      this.uhP = paraml;
  }

  public final boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, l.a parama)
  {
    AppMethodBeat.i(5998);
    boolean bool = this.uhP.a(paramWebView, paramValueCallback, parama);
    AppMethodBeat.o(5998);
    return bool;
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(5993);
    boolean bool = this.uhP.a(paramWebView, paramString1, paramString2, paramh);
    AppMethodBeat.o(5993);
    return bool;
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, g paramg)
  {
    AppMethodBeat.i(5995);
    boolean bool = this.uhP.a(paramWebView, paramString1, paramString2, paramString3, paramg);
    AppMethodBeat.o(5995);
    return bool;
  }

  public final boolean b(WebView paramWebView, String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(5994);
    boolean bool = this.uhP.b(paramWebView, paramString1, paramString2, paramh);
    AppMethodBeat.o(5994);
    return bool;
  }

  public void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(6000);
    this.uhP.d(paramWebView, paramString);
    AppMethodBeat.o(6000);
  }

  public final View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(5996);
    View localView = this.uhP.getVideoLoadingProgressView();
    AppMethodBeat.o(5996);
    return localView;
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(5990);
    boolean bool = this.uhP.onConsoleMessage(paramConsoleMessage);
    AppMethodBeat.o(5990);
    return bool;
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AppMethodBeat.i(5991);
    this.uhP.onGeolocationPermissionsShowPrompt(paramString, paramCallback);
    AppMethodBeat.o(5991);
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(5992);
    this.uhP.onHideCustomView();
    AppMethodBeat.o(5992);
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(6001);
    this.uhP.onShowCustomView(paramView, paramCustomViewCallback);
    AppMethodBeat.o(6001);
  }

  public final void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(5997);
    this.uhP.openFileChooser(paramValueCallback, paramString1, paramString2);
    AppMethodBeat.o(5997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.c
 * JD-Core Version:    0.6.2
 */