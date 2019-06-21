package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ShareToFacebookRedirectUI$4$1
  implements DialogInterface.OnCancelListener
{
  ShareToFacebookRedirectUI$4$1(ShareToFacebookRedirectUI.4 param4)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125573);
    ShareToFacebookRedirectUI.f(this.gIj.gIh).dismiss();
    this.gIj.gIh.finish();
    AppMethodBeat.o(125573);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.4.1
 * JD-Core Version:    0.6.2
 */