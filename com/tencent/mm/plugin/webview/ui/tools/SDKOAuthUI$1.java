package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SDKOAuthUI$1
  implements Runnable
{
  SDKOAuthUI$1(SDKOAuthUI paramSDKOAuthUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7524);
    ab.i("MicroMsg.SdkOAuthUI", "BackBtn click");
    a locala = a.uKJ;
    a.a(SDKOAuthUI.a(this.usQ), SDKOAuthUI.b(this.usQ), 0, SDKOAuthUI.c(this.usQ), SDKOAuthUI.d(this.usQ), 1, 0);
    SDKOAuthUI.a(this.usQ, -2);
    this.usQ.finish();
    AppMethodBeat.o(7524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.1
 * JD-Core Version:    0.6.2
 */