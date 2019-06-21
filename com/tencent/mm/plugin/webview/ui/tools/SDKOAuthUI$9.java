package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buo;

final class SDKOAuthUI$9
  implements View.OnClickListener
{
  SDKOAuthUI$9(SDKOAuthUI paramSDKOAuthUI, buo parambuo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7533);
    SDKOAuthUI.a(this.usQ, this.usR);
    AppMethodBeat.o(7533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.9
 * JD-Core Version:    0.6.2
 */