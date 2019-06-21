package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SDKOAuthUI$3
  implements DialogInterface.OnClickListener
{
  SDKOAuthUI$3(SDKOAuthUI paramSDKOAuthUI, String paramString, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7526);
    if (!SDKOAuthUI.n(this.usQ))
      SDKOAuthUI.b(this.usQ, this.ftO);
    if (this.usS)
      this.usQ.finish();
    AppMethodBeat.o(7526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.3
 * JD-Core Version:    0.6.2
 */