package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewInputFooter$2
  implements View.OnTouchListener
{
  WebViewInputFooter$2(WebViewInputFooter paramWebViewInputFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10076);
    WebViewInputFooter.g(this.uKx);
    WebViewInputFooter.i(this.uKx).setVisibility(8);
    WebViewInputFooter.i(this.uKx);
    WebViewInputFooter.f(this.uKx).setImageResource(2130838298);
    WebViewInputFooter.a(this.uKx, 0);
    AppMethodBeat.o(10076);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter.2
 * JD-Core Version:    0.6.2
 */