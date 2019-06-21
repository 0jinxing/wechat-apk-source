package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.ab;

final class SDKOAuthUI$8$1
  implements b
{
  SDKOAuthUI$8$1(SDKOAuthUI.8 param8)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7531);
    ab.i("MicroMsg.SdkOAuthUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    a locala;
    if (paramInt == 1)
    {
      SDKOAuthUI.a(this.usT.usQ, -4);
      locala = a.uKJ;
      a.a(SDKOAuthUI.a(this.usT.usQ), SDKOAuthUI.b(this.usT.usQ), 0, SDKOAuthUI.c(this.usT.usQ), 1, 1, 0);
      this.usT.usQ.finish();
      AppMethodBeat.o(7531);
    }
    while (true)
    {
      return;
      if (this.usT.usR.wIO)
      {
        SDKOAuthUI.a(this.usT.usQ, SDKOAuthUI.a(this.usT.usQ), SDKOAuthUI.e(this.usT.usQ).state, SDKOAuthUI.afC(SDKOAuthUI.a(this.usT.usQ)), SDKOAuthUI.f(this.usT.usQ).cZG());
        AppMethodBeat.o(7531);
      }
      else
      {
        locala = a.uKJ;
        a.a(SDKOAuthUI.a(this.usT.usQ), SDKOAuthUI.b(this.usT.usQ), 1, SDKOAuthUI.c(this.usT.usQ), 1, 1, 0);
        SDKOAuthUI.a(this.usT.usQ, this.usT.usR.vGi);
        AppMethodBeat.o(7531);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.8.1
 * JD-Core Version:    0.6.2
 */