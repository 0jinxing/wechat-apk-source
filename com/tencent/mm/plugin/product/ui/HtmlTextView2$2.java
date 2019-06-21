package com.tencent.mm.plugin.product.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;

final class HtmlTextView2$2 extends s
{
  HtmlTextView2$2(HtmlTextView2 paramHtmlTextView2)
  {
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(44021);
    ab.d("test", paramString);
    AppMethodBeat.o(44021);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView2.2
 * JD-Core Version:    0.6.2
 */