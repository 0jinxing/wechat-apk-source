package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class WebViewSearchContentInputFooter$7
  implements Runnable
{
  WebViewSearchContentInputFooter$7(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10064);
    MMActivity.showVKB((Activity)this.uKl.getContext());
    AppMethodBeat.o(10064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.7
 * JD-Core Version:    0.6.2
 */