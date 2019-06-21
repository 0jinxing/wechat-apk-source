package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.plugin.webview.model.ag;

final class SDKOAuthFriendUI$1
  implements Runnable
{
  SDKOAuthFriendUI$1(SDKOAuthFriendUI paramSDKOAuthFriendUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7490);
    a locala = a.uKJ;
    a.a(SDKOAuthFriendUI.a(this.usq), SDKOAuthFriendUI.b(this.usq), 0, SDKOAuthFriendUI.c(this.usq), 3, 1, 0);
    SDKOAuthFriendUI.d(this.usq).IH(-2);
    this.usq.finish();
    AppMethodBeat.o(7490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.1
 * JD-Core Version:    0.6.2
 */