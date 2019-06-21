package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import java.util.Map;

final class n$11
  implements Runnable
{
  n$11(n paramn, WebViewUI paramWebViewUI, d paramd, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7723);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7723);
    while (true)
    {
      return;
      this.uul.setMMSubTitle(null);
      if (this.uum != null)
        this.uum.aN(this.uuu);
      AppMethodBeat.o(7723);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.11
 * JD-Core Version:    0.6.2
 */