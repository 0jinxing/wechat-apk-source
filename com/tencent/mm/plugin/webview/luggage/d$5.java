package com.tencent.mm.plugin.webview.luggage;

import android.webkit.WebView.FindListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;

final class d$5
  implements WebView.FindListener
{
  d$5(d paramd)
  {
  }

  public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(6012);
    d.d(this.uiy).t(paramInt1, paramInt2, paramBoolean);
    AppMethodBeat.o(6012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.5
 * JD-Core Version:    0.6.2
 */