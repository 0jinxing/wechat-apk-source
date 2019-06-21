package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class n$54
  implements Runnable
{
  n$54(n paramn, WebViewUI paramWebViewUI, d paramd, k paramk, String paramString, long paramLong, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7771);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7771);
    while (true)
    {
      return;
      if ((this.uum != null) && (this.uun != null) && (this.uun.cZS() != null) && (this.uun.cZS().jB(42)))
        this.uum.n(this.val$appId, this.kOJ, this.gOm);
      AppMethodBeat.o(7771);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.54
 * JD-Core Version:    0.6.2
 */