package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class u$1
  implements u.b
{
  u$1(WebView paramWebView)
  {
  }

  public final void akp(String paramString)
  {
    AppMethodBeat.i(80457);
    this.heQ.evaluateJavascript(paramString, null);
    AppMethodBeat.o(80457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.u.1
 * JD-Core Version:    0.6.2
 */