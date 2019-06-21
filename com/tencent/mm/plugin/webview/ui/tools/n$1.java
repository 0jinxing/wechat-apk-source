package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class n$1
  implements Runnable
{
  n$1(n paramn, WebViewUI paramWebViewUI, d paramd, k paramk, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7713);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7713);
    while (true)
    {
      return;
      if ((this.uum != null) && (this.uun != null) && (this.uun.cZS() != null) && (this.uun.cZS().jB(42)))
        this.uum.i(this.cgJ, "download_succ");
      AppMethodBeat.o(7713);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.1
 * JD-Core Version:    0.6.2
 */