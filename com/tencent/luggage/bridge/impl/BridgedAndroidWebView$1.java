package com.tencent.luggage.bridge.impl;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.bridge.p;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BridgedAndroidWebView$1 extends WebViewClient
{
  BridgedAndroidWebView$1(BridgedAndroidWebView paramBridgedAndroidWebView)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(90750);
    BridgedAndroidWebView.a(this.bOS).bOI.onReady();
    AppMethodBeat.o(90750);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(90749);
    BridgedAndroidWebView.a(this.bOS).bOI.wO();
    AppMethodBeat.o(90749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.BridgedAndroidWebView.1
 * JD-Core Version:    0.6.2
 */