package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewSearchContentInputFooter$3
  implements View.OnClickListener
{
  WebViewSearchContentInputFooter$3(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(10060);
    if (WebViewSearchContentInputFooter.c(this.uKl) != null)
      WebViewSearchContentInputFooter.c(this.uKl).cWX();
    AppMethodBeat.o(10060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.3
 * JD-Core Version:    0.6.2
 */