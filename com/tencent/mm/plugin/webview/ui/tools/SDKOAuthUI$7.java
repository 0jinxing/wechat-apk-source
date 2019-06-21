package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.ab;

final class SDKOAuthUI$7
  implements b
{
  SDKOAuthUI$7(SDKOAuthUI paramSDKOAuthUI, buo parambuo)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7530);
    ab.i("MicroMsg.SdkOAuthUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    a locala;
    if (paramInt == 1)
    {
      SDKOAuthUI.a(this.usQ, -4);
      locala = a.uKJ;
      a.a(SDKOAuthUI.a(this.usQ), SDKOAuthUI.b(this.usQ), 0, SDKOAuthUI.c(this.usQ), 0, 0, 0);
      this.usQ.finish();
      AppMethodBeat.o(7530);
    }
    while (true)
    {
      return;
      SDKOAuthUI.a(this.usQ, this.usR.vGi);
      locala = a.uKJ;
      a.a(SDKOAuthUI.a(this.usQ), SDKOAuthUI.b(this.usQ), 1, SDKOAuthUI.c(this.usQ), 0, 0, 0);
      AppMethodBeat.o(7530);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.7
 * JD-Core Version:    0.6.2
 */