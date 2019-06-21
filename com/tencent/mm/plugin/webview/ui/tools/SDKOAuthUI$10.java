package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.protocal.protobuf.buo;

final class SDKOAuthUI$10
  implements View.OnClickListener
{
  SDKOAuthUI$10(SDKOAuthUI paramSDKOAuthUI, buo parambuo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7534);
    SDKOAuthUI.g(this.usQ);
    Object localObject = ag.d("snsapi_userinfo", this.usR.wIK);
    paramView = (View)localObject;
    if (localObject == null)
    {
      SDKOAuthUI.g(this.usQ);
      paramView = ag.d("snsapi_login", this.usR.wIK);
    }
    localObject = paramView;
    if (paramView == null)
    {
      SDKOAuthUI.g(this.usQ);
      localObject = ag.d("group_sns_login", this.usR.wIK);
    }
    paramView = a.uKJ;
    a.a(SDKOAuthUI.a(this.usQ), SDKOAuthUI.b(this.usQ), 0, SDKOAuthUI.c(this.usQ), 2, 1, 0);
    SDKOAuthUI.a(this.usQ, (bew)localObject, this.usR);
    AppMethodBeat.o(7534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.10
 * JD-Core Version:    0.6.2
 */