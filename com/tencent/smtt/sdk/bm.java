package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;

class bm extends X5ProxyWebViewClientExtension
{
  bm(WebView paramWebView, IX5WebViewClientExtension paramIX5WebViewClientExtension)
  {
    super(paramIX5WebViewClientExtension);
  }

  public void invalidate()
  {
  }

  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(64831);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    WebView.a(this.a, paramInt3, paramInt4, paramInt1, paramInt2);
    AppMethodBeat.o(64831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bm
 * JD-Core Version:    0.6.2
 */