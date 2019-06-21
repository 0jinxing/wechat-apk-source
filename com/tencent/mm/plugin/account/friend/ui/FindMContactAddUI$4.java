package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMContactAddUI$4
  implements DialogInterface.OnClickListener
{
  FindMContactAddUI$4(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108515);
    this.gxb.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
    FindMContactAddUI.q(this.gxb);
    this.gxb.finish();
    AppMethodBeat.o(108515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.4
 * JD-Core Version:    0.6.2
 */