package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;

final class SDKOAuthFriendUI$2
  implements View.OnClickListener
{
  SDKOAuthFriendUI$2(SDKOAuthFriendUI paramSDKOAuthFriendUI, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7491);
    paramView = a.uKJ;
    a.a(SDKOAuthFriendUI.a(this.usq), SDKOAuthFriendUI.b(this.usq), 1, SDKOAuthFriendUI.c(this.usq), 3, 1, 0);
    SDKOAuthFriendUI.a(this.usq, this.usr);
    AppMethodBeat.o(7491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.2
 * JD-Core Version:    0.6.2
 */