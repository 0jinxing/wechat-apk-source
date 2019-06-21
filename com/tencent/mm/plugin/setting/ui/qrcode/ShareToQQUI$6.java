package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.FacebookAuthUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ShareToQQUI$6
  implements DialogInterface.OnClickListener
{
  ShareToQQUI$6(ShareToQQUI paramShareToQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(126925);
    paramDialogInterface = new Intent(this.qkA.mController.ylL, FacebookAuthUI.class);
    paramDialogInterface.putExtra("is_force_unbind", true);
    this.qkA.mController.ylL.startActivityForResult(paramDialogInterface, 8);
    AppMethodBeat.o(126925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.6
 * JD-Core Version:    0.6.2
 */