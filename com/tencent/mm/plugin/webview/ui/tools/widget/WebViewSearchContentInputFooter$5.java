package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class WebViewSearchContentInputFooter$5
  implements View.OnFocusChangeListener
{
  WebViewSearchContentInputFooter$5(WebViewSearchContentInputFooter paramWebViewSearchContentInputFooter)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(10062);
    if ((!paramBoolean) && (WebViewSearchContentInputFooter.c(this.uKl) != null))
    {
      paramView = paramView.getContext();
      if ((paramView instanceof MMActivity))
        ((MMActivity)paramView).hideVKB(WebViewSearchContentInputFooter.d(this.uKl));
    }
    WebViewSearchContentInputFooter.e(this.uKl).setSelected(paramBoolean);
    AppMethodBeat.o(10062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter.5
 * JD-Core Version:    0.6.2
 */