package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FacebookFriendUI$4
  implements DialogInterface.OnClickListener
{
  FacebookFriendUI$4(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124810);
    paramDialogInterface = new Intent(this.gBf.mController.ylL, FacebookAuthUI.class);
    paramDialogInterface.putExtra("is_force_unbind", true);
    this.gBf.mController.ylL.startActivity(paramDialogInterface);
    this.gBf.finish();
    AppMethodBeat.o(124810);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.4
 * JD-Core Version:    0.6.2
 */