package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bm.a;
import com.tencent.mm.bm.a.a;
import com.tencent.mm.bm.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$4
  implements a.b
{
  WebViewUI$4(WebViewUI paramWebViewUI)
  {
  }

  public final void a(a.a parama1, a.a parama2)
  {
    AppMethodBeat.i(7811);
    ab.i("MicroMsg.WebViewUI", "OrientationListener lastOrientation:" + parama1.name() + "; newOrientation:" + parama2.name());
    this.uxp.screenOrientation = 4;
    this.uxp.aBS();
    if (this.uxp.uvh != null)
      this.uxp.uvh.disable();
    AppMethodBeat.o(7811);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.4
 * JD-Core Version:    0.6.2
 */