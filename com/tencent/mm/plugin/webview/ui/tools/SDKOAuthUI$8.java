package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.a;
import com.tencent.mm.model.gdpr.c;
import com.tencent.mm.protocal.protobuf.buo;
import com.tencent.mm.sdk.platformtools.ab;

final class SDKOAuthUI$8
  implements View.OnClickListener
{
  SDKOAuthUI$8(SDKOAuthUI paramSDKOAuthUI, buo parambuo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7532);
    ab.i("MicroMsg.SdkOAuthUI", "accept go  MPGdprPolicyUtil.checkPolicy");
    c.a(this.usQ, a.fom, SDKOAuthUI.a(this.usQ), new SDKOAuthUI.8.1(this));
    AppMethodBeat.o(7532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.8
 * JD-Core Version:    0.6.2
 */