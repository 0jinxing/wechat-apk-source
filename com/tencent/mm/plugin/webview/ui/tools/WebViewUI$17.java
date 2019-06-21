package com.tencent.mm.plugin.webview.ui.tools;

import android.webkit.WebView.FindListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$17
  implements WebView.FindListener
{
  WebViewUI$17(WebViewUI paramWebViewUI)
  {
  }

  public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(7836);
    if ((paramBoolean) && (!WebViewUI.e(this.uxp)) && (!bo.isNullOrNil(this.uxp.uvj.getSearchContent())))
    {
      if (paramInt2 != 0)
        break label83;
      h.pYm.a(480L, 3L, 1L, false);
    }
    while (true)
    {
      WebViewUI.a(this.uxp, true);
      this.uxp.uvj.t(paramInt1, paramInt2, paramBoolean);
      AppMethodBeat.o(7836);
      return;
      label83: h.pYm.a(480L, 2L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.17
 * JD-Core Version:    0.6.2
 */