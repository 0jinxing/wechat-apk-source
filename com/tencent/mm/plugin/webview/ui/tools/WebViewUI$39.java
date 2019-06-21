package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$39
  implements View.OnClickListener
{
  WebViewUI$39(WebViewUI paramWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7862);
    if (this.uxp.pzf != null)
    {
      this.uxp.uvo = System.currentTimeMillis();
      this.uxp.pzf.goBack();
      WebViewUI.p(this.uxp);
    }
    AppMethodBeat.o(7862);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.39
 * JD-Core Version:    0.6.2
 */