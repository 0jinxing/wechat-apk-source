package com.tencent.mm.plugin.webview.ui.tools.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public final class j extends i
{
  private final b uJl;

  public j(MMWebView paramMMWebView, b paramb)
  {
    super((MMWebViewWithJsApi)paramMMWebView);
    AppMethodBeat.i(9919);
    this.uJl = paramb;
    AppMethodBeat.o(9919);
  }

  public final void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(9920);
    if (this.uJl != null)
    {
      this.uJl.pa(paramString);
      AppMethodBeat.o(9920);
    }
    while (true)
    {
      return;
      super.d(paramWebView, paramString);
      AppMethodBeat.o(9920);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.j
 * JD-Core Version:    0.6.2
 */