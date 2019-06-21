package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class WebViewSearchContentInputFooter$4
  implements View.OnKeyListener
{
  WebViewSearchContentInputFooter$4(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(10061);
    if (WebViewSearchContentInputFooter.c(this.uKl) != null)
      WebViewSearchContentInputFooter.c(this.uKl).c(paramInt, paramKeyEvent);
    boolean bool;
    if ((paramInt == 66) && (WebViewSearchContentInputFooter.c(this.uKl) != null))
    {
      paramView = paramView.getContext();
      if ((paramView instanceof MMActivity))
        ((MMActivity)paramView).hideVKB(WebViewSearchContentInputFooter.d(this.uKl));
      WebViewSearchContentInputFooter.c(this.uKl).b(this.uKl);
      bool = true;
      AppMethodBeat.o(10061);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(10061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.4
 * JD-Core Version:    0.6.2
 */