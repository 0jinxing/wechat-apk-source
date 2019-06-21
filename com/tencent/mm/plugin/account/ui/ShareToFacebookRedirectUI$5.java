package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ShareToFacebookRedirectUI$5
  implements DialogInterface.OnClickListener
{
  ShareToFacebookRedirectUI$5(ShareToFacebookRedirectUI paramShareToFacebookRedirectUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125575);
    paramDialogInterface = new Intent(this.gIh.mController.ylL, FacebookAuthUI.class);
    paramDialogInterface.putExtra("is_force_unbind", true);
    this.gIh.mController.ylL.startActivityForResult(paramDialogInterface, 0);
    AppMethodBeat.o(125575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI.5
 * JD-Core Version:    0.6.2
 */