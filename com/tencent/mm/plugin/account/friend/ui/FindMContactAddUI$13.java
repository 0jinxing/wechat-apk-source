package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class FindMContactAddUI$13
  implements DialogInterface.OnClickListener
{
  FindMContactAddUI$13(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108525);
    if ((FindMContactAddUI.k(this.gxb) != null) && (FindMContactAddUI.k(this.gxb).contains("2")))
    {
      paramDialogInterface = new Intent(this.gxb, FindMContactInviteUI.class);
      paramDialogInterface.putExtra("regsetinfo_ticket", FindMContactAddUI.l(this.gxb));
      paramDialogInterface.putExtra("login_type", FindMContactAddUI.m(this.gxb));
      paramDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAddUI.e(this.gxb));
      MMWizardActivity.J(this.gxb, paramDialogInterface);
      AppMethodBeat.o(108525);
    }
    while (true)
    {
      return;
      FindMContactAddUI.n(this.gxb);
      AppMethodBeat.o(108525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.13
 * JD-Core Version:    0.6.2
 */