package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.b;

final class WebViewUI$15
  implements WebViewInputFooter.b
{
  WebViewUI$15(WebViewUI paramWebViewUI)
  {
  }

  public final void cWT()
  {
    AppMethodBeat.i(7828);
    WebViewUI.a(this.uxp, 0);
    AppMethodBeat.o(7828);
  }

  public final void cWU()
  {
    AppMethodBeat.i(7829);
    WebViewKeyboardLinearLayout localWebViewKeyboardLinearLayout = (WebViewKeyboardLinearLayout)this.uxp.findViewById(2131823600);
    if ((localWebViewKeyboardLinearLayout != null) && (localWebViewKeyboardLinearLayout.getKeyBoardHeight() > 0))
      WebViewUI.a(this.uxp, localWebViewKeyboardLinearLayout.getKeyBoardHeight());
    AppMethodBeat.o(7829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.15
 * JD-Core Version:    0.6.2
 */