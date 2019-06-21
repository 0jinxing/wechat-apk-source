package com.tencent.mm.plugin.webview.ui.tools;

import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.a;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$16
  implements WebViewSearchContentInputFooter.a
{
  WebViewUI$16(WebViewUI paramWebViewUI)
  {
  }

  public final void a(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
    AppMethodBeat.i(7831);
    if (paramWebViewSearchContentInputFooter.getVisibility() == 0)
      b(paramWebViewSearchContentInputFooter);
    AppMethodBeat.o(7831);
  }

  public final void b(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
    AppMethodBeat.i(7834);
    this.uxp.pzf.clearMatches();
    paramWebViewSearchContentInputFooter.reset();
    this.uxp.uvj.t(0, 0, true);
    WebViewUI.a(this.uxp, false);
    this.uxp.pzf.findAllAsync(paramWebViewSearchContentInputFooter.getSearchContent());
    AppMethodBeat.o(7834);
  }

  public final boolean c(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(7835);
    if ((paramInt == 67) && (paramKeyEvent.getAction() == 0))
      h.pYm.a(480L, 6L, 1L, false);
    AppMethodBeat.o(7835);
    return false;
  }

  public final void cWV()
  {
    AppMethodBeat.i(7830);
    WebViewUI.b(this.uxp, 0);
    this.uxp.pzf.clearMatches();
    this.uxp.uvj.dcX();
    AppMethodBeat.o(7830);
  }

  public final void cWW()
  {
    AppMethodBeat.i(7832);
    h.pYm.a(480L, 5L, 1L, false);
    this.uxp.pzf.findNext(false);
    AppMethodBeat.o(7832);
  }

  public final void cWX()
  {
    AppMethodBeat.i(7833);
    h.pYm.a(480L, 4L, 1L, false);
    this.uxp.pzf.findNext(true);
    AppMethodBeat.o(7833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.16
 * JD-Core Version:    0.6.2
 */