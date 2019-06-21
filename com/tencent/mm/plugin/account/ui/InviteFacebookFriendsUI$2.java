package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class InviteFacebookFriendsUI$2
  implements DialogInterface.OnClickListener
{
  InviteFacebookFriendsUI$2(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124872);
    paramDialogInterface = new Intent(this.gBw.mController.ylL, FacebookAuthUI.class);
    paramDialogInterface.putExtra("is_force_unbind", true);
    this.gBw.mController.ylL.startActivity(paramDialogInterface);
    this.gBw.finish();
    AppMethodBeat.o(124872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.2
 * JD-Core Version:    0.6.2
 */