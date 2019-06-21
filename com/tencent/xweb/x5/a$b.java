package com.tencent.xweb.x5;

import android.webkit.WebView.FindListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;

public final class a$b
  implements IX5WebViewBase.FindListener
{
  WebView.FindListener AQm;

  public a$b(WebView.FindListener paramFindListener)
  {
    this.AQm = paramFindListener;
  }

  public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(84778);
    if (this.AQm != null)
      this.AQm.onFindResultReceived(paramInt1, paramInt2, paramBoolean);
    AppMethodBeat.o(84778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a.b
 * JD-Core Version:    0.6.2
 */