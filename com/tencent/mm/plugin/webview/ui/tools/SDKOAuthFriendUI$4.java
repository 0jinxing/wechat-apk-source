package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class SDKOAuthFriendUI$4
  implements b
{
  SDKOAuthFriendUI$4(SDKOAuthFriendUI paramSDKOAuthFriendUI, int paramInt1, int paramInt2)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7493);
    ab.i("MicroMsg.SDKOAuthFriendUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1)
    {
      SDKOAuthFriendUI.d(this.usq).IH(-4);
      AppMethodBeat.o(7493);
    }
    while (true)
    {
      return;
      if ((this.ust == 8) && (this.usu == 8))
      {
        SDKOAuthFriendUI.d(this.usq).IH(-4);
        AppMethodBeat.o(7493);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        if (this.usu == 7)
          localLinkedList.add("snsapi_friend");
        if (this.ust == 7)
        {
          SDKOAuthFriendUI.d(this.usq);
          ag.a(SDKOAuthFriendUI.e(this.usq), localLinkedList);
          if (SDKOAuthFriendUI.f(this.usq) == -1)
            ab.e("MicroMsg.SDKOAuthFriendUI", "btnCallback: do not get avatarId from pageone");
          if (SDKOAuthFriendUI.g(this.usq))
          {
            SDKOAuthFriendUI.d(this.usq);
            ag.a(localLinkedList, SDKOAuthFriendUI.f(this.usq), SDKOAuthFriendUI.h(this.usq));
            AppMethodBeat.o(7493);
          }
          else
          {
            SDKOAuthFriendUI.d(this.usq).h(localLinkedList, SDKOAuthFriendUI.f(this.usq));
            AppMethodBeat.o(7493);
          }
        }
        else if (SDKOAuthFriendUI.g(this.usq))
        {
          SDKOAuthFriendUI.d(this.usq);
          ag.a(localLinkedList, 0, SDKOAuthFriendUI.h(this.usq));
          AppMethodBeat.o(7493);
        }
        else
        {
          SDKOAuthFriendUI.d(this.usq).aB(localLinkedList);
          AppMethodBeat.o(7493);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.4
 * JD-Core Version:    0.6.2
 */