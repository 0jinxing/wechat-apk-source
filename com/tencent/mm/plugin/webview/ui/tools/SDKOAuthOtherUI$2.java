package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;

final class SDKOAuthOtherUI$2
  implements View.OnClickListener
{
  SDKOAuthOtherUI$2(SDKOAuthOtherUI paramSDKOAuthOtherUI, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7507);
    paramView = a.uKJ;
    a.a(SDKOAuthOtherUI.a(this.usw), SDKOAuthOtherUI.b(this.usw), 1, SDKOAuthOtherUI.c(this.usw), 4, 1, 0);
    SDKOAuthOtherUI.a(this.usw, this.usr, this.usx);
    AppMethodBeat.o(7507);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.2
 * JD-Core Version:    0.6.2
 */