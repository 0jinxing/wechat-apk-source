package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class n$12
  implements Runnable
{
  n$12(n paramn, WebViewUI paramWebViewUI, d paramd, k paramk, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7724);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7724);
    while (true)
    {
      return;
      if ((this.uum != null) && (this.uun != null) && (this.uun.cZS() != null) && (this.uun.cZS().jB(42)))
        this.uum.i(this.cgJ, "download_fail");
      AppMethodBeat.o(7724);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.12
 * JD-Core Version:    0.6.2
 */