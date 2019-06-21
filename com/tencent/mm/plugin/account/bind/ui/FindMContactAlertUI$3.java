package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FindMContactAlertUI$3
  implements DialogInterface.OnClickListener
{
  FindMContactAlertUI$3(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13565);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(13565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI.3
 * JD-Core Version:    0.6.2
 */