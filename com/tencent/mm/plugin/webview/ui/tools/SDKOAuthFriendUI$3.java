package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.protocal.protobuf.bew;

final class SDKOAuthFriendUI$3
  implements View.OnClickListener
{
  SDKOAuthFriendUI$3(SDKOAuthFriendUI paramSDKOAuthFriendUI, bew parambew, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7492);
    paramView = a.uKJ;
    a.a(SDKOAuthFriendUI.a(this.usq), SDKOAuthFriendUI.b(this.usq), 0, SDKOAuthFriendUI.c(this.usq), 3, 1, 0);
    SDKOAuthFriendUI.a(this.usq, this.uss, this.usr);
    AppMethodBeat.o(7492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.3
 * JD-Core Version:    0.6.2
 */