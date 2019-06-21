package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.i;

final class WebViewUI$10
  implements View.OnClickListener
{
  WebViewUI$10(WebViewUI paramWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7817);
    this.uxp.as(WebViewUI.d(this.uxp), true);
    paramView = this.uxp.ulI.cYb();
    paramView.une = new Object[] { this.uxp.cOG, Integer.valueOf(4) };
    paramView.b(this.uxp.icy);
    AppMethodBeat.o(7817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.10
 * JD-Core Version:    0.6.2
 */