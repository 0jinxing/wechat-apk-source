package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareToFacebookRedirectUI$2
  implements DialogInterface.OnClickListener
{
  ShareToFacebookRedirectUI$2(ShareToFacebookRedirectUI paramShareToFacebookRedirectUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125570);
    this.gIh.finish();
    AppMethodBeat.o(125570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.2
 * JD-Core Version:    0.6.2
 */