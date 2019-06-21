package com.tencent.mm.plugin.account.friend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMContactAddUI$5
  implements DialogInterface.OnClickListener
{
  FindMContactAddUI$5(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(108516);
    FindMContactAddUI.q(this.gxb);
    this.gxb.finish();
    AppMethodBeat.o(108516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.5
 * JD-Core Version:    0.6.2
 */