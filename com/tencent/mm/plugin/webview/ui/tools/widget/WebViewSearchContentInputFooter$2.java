package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewSearchContentInputFooter$2
  implements View.OnClickListener
{
  WebViewSearchContentInputFooter$2(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(10059);
    if (WebViewSearchContentInputFooter.c(this.uKl) != null)
      WebViewSearchContentInputFooter.c(this.uKl).cWW();
    AppMethodBeat.o(10059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.2
 * JD-Core Version:    0.6.2
 */