package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMContactInviteUI$4
  implements DialogInterface.OnClickListener
{
  FindMContactInviteUI$4(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108539);
    FindMContactInviteUI.n(this.gxd);
    this.gxd.finish();
    AppMethodBeat.o(108539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.4
 * JD-Core Version:    0.6.2
 */