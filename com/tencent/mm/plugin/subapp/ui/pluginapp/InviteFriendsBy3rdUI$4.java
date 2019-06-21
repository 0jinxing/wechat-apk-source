package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class InviteFriendsBy3rdUI$4
  implements DialogInterface.OnClickListener
{
  InviteFriendsBy3rdUI$4(InviteFriendsBy3rdUI paramInviteFriendsBy3rdUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25541);
    d.b(this.svC.mController.ylL, "account", ".ui.FacebookAuthUI", new Intent());
    AppMethodBeat.o(25541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.4
 * JD-Core Version:    0.6.2
 */