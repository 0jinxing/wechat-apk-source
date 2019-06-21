package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class MMWebView$c
{
  private MMWebView$c(MMWebView paramMMWebView)
  {
  }

  public static void e(WebView paramWebView)
  {
    AppMethodBeat.i(107939);
    paramWebView.setScrollbarFadingEnabled(true);
    paramWebView.setScrollBarStyle(0);
    AppMethodBeat.o(107939);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMWebView.c
 * JD-Core Version:    0.6.2
 */