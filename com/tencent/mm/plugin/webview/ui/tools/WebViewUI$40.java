package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

final class WebViewUI$40
  implements View.OnClickListener
{
  WebViewUI$40(WebViewUI paramWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7863);
    if (this.uxp.pzf != null)
      this.uxp.pzf.reload();
    AppMethodBeat.o(7863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.40
 * JD-Core Version:    0.6.2
 */