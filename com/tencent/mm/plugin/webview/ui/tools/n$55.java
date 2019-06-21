package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;

final class n$55
  implements Runnable
{
  n$55(n paramn, WebViewUI paramWebViewUI, d paramd, k paramk, String paramString, int paramInt, Boolean paramBoolean)
  {
  }

  public final void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(7772);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7772);
    while (true)
    {
      return;
      if ((this.uum != null) && (this.uun != null) && (this.uun.cZS() != null))
      {
        this.uun.cZS();
        this.uum.dG(this.uuv, this.nx);
        AppMethodBeat.o(7772);
      }
      else
      {
        if ((this.uum == null) || (!this.uuR.booleanValue()))
          break;
        this.uum.dG(this.uuv, this.nx);
        AppMethodBeat.o(7772);
      }
    }
    if (this.uum == null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (this.uun == null)
        bool1 = true;
      ab.w("MicroMsg.WebViewStubCallbackAIDLStub", "something null, %s, %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      AppMethodBeat.o(7772);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.55
 * JD-Core Version:    0.6.2
 */