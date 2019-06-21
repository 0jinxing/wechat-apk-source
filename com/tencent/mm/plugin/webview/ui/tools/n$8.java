package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import java.util.Map;

final class n$8
  implements Runnable
{
  n$8(n paramn, WebViewUI paramWebViewUI, d paramd, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7720);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7720);
    while (true)
    {
      return;
      if (this.uum != null)
        this.uum.aM(this.uuu);
      AppMethodBeat.o(7720);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.8
 * JD-Core Version:    0.6.2
 */