package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class SDKOAuthUI$5
  implements ap.a
{
  SDKOAuthUI$5(SDKOAuthUI paramSDKOAuthUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(7528);
    if (this.usQ.isFinishing())
    {
      ab.i("MicroMsg.SdkOAuthUI", "onTimerExpired isFinishing");
      AppMethodBeat.o(7528);
    }
    while (true)
    {
      return false;
      SDKOAuthUI.p(this.usQ);
      AppMethodBeat.o(7528);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.5
 * JD-Core Version:    0.6.2
 */