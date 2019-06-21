package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class FindMContactAlertUI$5
  implements DialogInterface.OnClickListener
{
  FindMContactAlertUI$5(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13567);
    g.RP().Ry().set(12322, Boolean.TRUE);
    FindMContactAlertUI.e(this.gsO);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(13567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI.5
 * JD-Core Version:    0.6.2
 */