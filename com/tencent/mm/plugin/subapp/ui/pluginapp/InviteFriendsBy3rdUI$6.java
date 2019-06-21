package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.i.a;
import com.tencent.mm.ui.q;

final class InviteFriendsBy3rdUI$6
  implements DialogInterface.OnClickListener
{
  InviteFriendsBy3rdUI$6(InviteFriendsBy3rdUI paramInviteFriendsBy3rdUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25542);
    InviteFriendsBy3rdUI localInviteFriendsBy3rdUI = this.svC;
    paramDialogInterface = this.svC.mController.ylL;
    this.svC.mController.ylL.getString(2131297061);
    InviteFriendsBy3rdUI.a(localInviteFriendsBy3rdUI, h.b(paramDialogInterface, this.svC.mController.ylL.getString(2131304132), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    }));
    InviteFriendsBy3rdUI.a(this.svC).a(this.svC, this.svC.mController.ylL);
    AppMethodBeat.o(25542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI.6
 * JD-Core Version:    0.6.2
 */