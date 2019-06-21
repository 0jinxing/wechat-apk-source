package com.tencent.luggage.bridge.impl;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.tencent.luggage.bridge.o;
import com.tencent.luggage.bridge.p;
import com.tencent.matrix.trace.core.AppMethodBeat;

class BridgedAndroidWebView$2 extends WebChromeClient
{
  BridgedAndroidWebView$2(BridgedAndroidWebView paramBridgedAndroidWebView)
  {
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    AppMethodBeat.i(90751);
    paramWebView = BridgedAndroidWebView.a(this.bOS).bOI.bx(paramString2);
    boolean bool;
    if (paramWebView != null)
    {
      paramJsPromptResult.confirm(paramWebView);
      bool = true;
      AppMethodBeat.o(90751);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90751);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.BridgedAndroidWebView.2
 * JD-Core Version:    0.6.2
 */