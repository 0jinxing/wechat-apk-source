package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class SDKOAuthUI$2
  implements b
{
  SDKOAuthUI$2(SDKOAuthUI paramSDKOAuthUI, buo parambuo)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7525);
    ab.i("MicroMsg.SdkOAuthUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject;
    if (paramInt == 1)
    {
      SDKOAuthUI.a(this.usQ, -4);
      localObject = a.uKJ;
      a.a(SDKOAuthUI.a(this.usQ), SDKOAuthUI.b(this.usQ), 0, SDKOAuthUI.c(this.usQ), 2, 1, 0);
      this.usQ.finish();
      AppMethodBeat.o(7525);
    }
    while (true)
    {
      return;
      localObject = new LinkedList();
      SDKOAuthUI.g(this.usQ);
      ag.a(this.usR, (LinkedList)localObject);
      if (SDKOAuthUI.n(this.usQ))
      {
        SDKOAuthUI.g(this.usQ);
        ag.a((LinkedList)localObject, SDKOAuthUI.b.a(SDKOAuthUI.h(this.usQ)), SDKOAuthUI.o(this.usQ));
        AppMethodBeat.o(7525);
      }
      else
      {
        SDKOAuthUI.g(this.usQ).h((LinkedList)localObject, SDKOAuthUI.b.a(SDKOAuthUI.h(this.usQ)));
        AppMethodBeat.o(7525);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.2
 * JD-Core Version:    0.6.2
 */