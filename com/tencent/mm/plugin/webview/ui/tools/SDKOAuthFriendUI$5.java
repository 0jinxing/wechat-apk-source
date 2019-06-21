package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class SDKOAuthFriendUI$5
  implements b
{
  SDKOAuthFriendUI$5(SDKOAuthFriendUI paramSDKOAuthFriendUI, int paramInt)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7494);
    ab.i("MicroMsg.SDKOAuthFriendUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 1) && (this.usu == 7))
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add("snsapi_friend");
      SDKOAuthFriendUI.d(this.usq).aB(localLinkedList);
      AppMethodBeat.o(7494);
    }
    while (true)
    {
      return;
      SDKOAuthFriendUI.d(this.usq).IH(-4);
      AppMethodBeat.o(7494);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.5
 * JD-Core Version:    0.6.2
 */