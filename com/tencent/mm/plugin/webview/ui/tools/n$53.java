package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class n$53
  implements Runnable
{
  n$53(n paramn, WebViewUI paramWebViewUI, d paramd, k paramk, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7770);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7770);
    while (true)
    {
      return;
      if ((this.uum != null) && (this.uun != null) && (this.uun.cZS() != null) && (this.uun.cZS().jB(42)))
        this.uum.i(this.cgJ, "download_start");
      AppMethodBeat.o(7770);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.53
 * JD-Core Version:    0.6.2
 */