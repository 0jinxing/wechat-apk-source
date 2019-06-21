package com.tencent.xweb;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.e;

public class l
{
  e AMp;

  public void a(WebView paramWebView, int paramInt)
  {
  }

  public boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, l.a parama)
  {
    return false;
  }

  public boolean a(WebView paramWebView, String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(3820);
    boolean bool;
    if (this.AMp != null)
    {
      bool = this.AMp.a(paramString1, paramString2, paramh);
      AppMethodBeat.o(3820);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3820);
    }
  }

  public boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, g paramg)
  {
    AppMethodBeat.i(3822);
    boolean bool;
    if (this.AMp != null)
    {
      bool = this.AMp.a(paramString1, paramString2, paramString3, paramg);
      AppMethodBeat.o(3822);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3822);
    }
  }

  public void aDI()
  {
  }

  public void aJY()
  {
  }

  public boolean b(WebView paramWebView, String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(3821);
    boolean bool;
    if (this.AMp != null)
    {
      bool = this.AMp.b(paramString1, paramString2, paramh);
      AppMethodBeat.o(3821);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3821);
    }
  }

  public void d(WebView paramWebView, String paramString)
  {
  }

  public View getVideoLoadingProgressView()
  {
    return null;
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AppMethodBeat.i(3818);
    paramCallback.invoke(paramString, true, true);
    AppMethodBeat.o(3818);
  }

  public void onHideCustomView()
  {
    AppMethodBeat.i(3819);
    if (this.AMp != null)
      this.AMp.onHideCustomView();
    AppMethodBeat.o(3819);
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(3824);
    if (this.AMp != null)
      this.AMp.onShowCustomView(paramView, paramCustomViewCallback);
    AppMethodBeat.o(3824);
  }

  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    AppMethodBeat.i(3823);
    paramValueCallback.onReceiveValue(null);
    AppMethodBeat.o(3823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.l
 * JD-Core Version:    0.6.2
 */