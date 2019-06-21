package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;

final class WebViewInputFooter$1
  implements View.OnClickListener
{
  WebViewInputFooter$1(WebViewInputFooter paramWebViewInputFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(10075);
    if (WebViewInputFooter.a(this.uKx) == 0)
    {
      WebViewInputFooter.b(this.uKx).aqX();
      if (!WebViewInputFooter.c(this.uKx))
        WebViewInputFooter.d(this.uKx).requestFocus();
      WebViewInputFooter.e(this.uKx);
      WebViewInputFooter.f(this.uKx).setImageResource(2131231459);
      WebViewInputFooter.a(this.uKx, 1);
      WebViewInputFooter.g(this.uKx);
      AppMethodBeat.o(10075);
    }
    while (true)
    {
      return;
      WebViewInputFooter.g(this.uKx);
      WebViewInputFooter.d(this.uKx).requestFocus();
      WebViewInputFooter.b(this.uKx).showVKB();
      WebViewInputFooter.h(this.uKx);
      WebViewInputFooter.a(this.uKx, 0);
      AppMethodBeat.o(10075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.1
 * JD-Core Version:    0.6.2
 */