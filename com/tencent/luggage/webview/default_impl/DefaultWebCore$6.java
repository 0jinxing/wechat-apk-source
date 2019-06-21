package com.tencent.luggage.webview.default_impl;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

class DefaultWebCore$6 extends WebChromeClient
{
  DefaultWebCore$6(a parama, a.a parama1)
  {
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    AppMethodBeat.i(90929);
    paramWebView = this.bRL.bH(paramString2);
    boolean bool;
    if (paramWebView == null)
    {
      bool = false;
      AppMethodBeat.o(90929);
    }
    while (true)
    {
      return bool;
      paramJsPromptResult.confirm(paramWebView);
      bool = true;
      AppMethodBeat.o(90929);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.webview.default_impl.DefaultWebCore.6
 * JD-Core Version:    0.6.2
 */