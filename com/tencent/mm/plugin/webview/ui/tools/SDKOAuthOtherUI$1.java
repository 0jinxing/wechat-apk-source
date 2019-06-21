package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.plugin.webview.model.ag;

final class SDKOAuthOtherUI$1
  implements Runnable
{
  SDKOAuthOtherUI$1(SDKOAuthOtherUI paramSDKOAuthOtherUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7506);
    a locala = a.uKJ;
    a.a(SDKOAuthOtherUI.a(this.usw), SDKOAuthOtherUI.b(this.usw), 0, SDKOAuthOtherUI.c(this.usw), 4, 1, 0);
    SDKOAuthOtherUI.d(this.usw).IH(-2);
    this.usw.finish();
    AppMethodBeat.o(7506);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.1
 * JD-Core Version:    0.6.2
 */