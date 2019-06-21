package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SDKOAuthUI$14
  implements View.OnClickListener
{
  SDKOAuthUI$14(SDKOAuthUI paramSDKOAuthUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7538);
    paramView = new Intent(this.usQ, CreateAvatarUI.class);
    paramView.putExtra("0", SDKOAuthUI.a(this.usQ));
    paramView.putExtra("default_fileid", SDKOAuthUI.m(this.usQ));
    this.usQ.startActivityForResult(paramView, 6);
    AppMethodBeat.o(7538);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.14
 * JD-Core Version:    0.6.2
 */