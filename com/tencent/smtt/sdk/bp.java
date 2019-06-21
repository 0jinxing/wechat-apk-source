package com.tencent.smtt.sdk;

import android.webkit.WebView.FindListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;

class bp
  implements WebView.FindListener
{
  bp(WebView paramWebView, IX5WebViewBase.FindListener paramFindListener)
  {
  }

  public void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(64834);
    this.a.onFindResultReceived(paramInt1, paramInt2, paramBoolean);
    AppMethodBeat.o(64834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bp
 * JD-Core Version:    0.6.2
 */