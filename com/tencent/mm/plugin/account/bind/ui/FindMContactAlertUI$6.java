package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class FindMContactAlertUI$6
  implements DialogInterface.OnClickListener
{
  FindMContactAlertUI$6(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13568);
    paramDialogInterface = new Intent(this.gsO, FindMContactLearmMoreUI.class);
    paramDialogInterface.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(this.gsO));
    paramDialogInterface.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(this.gsO));
    paramDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(this.gsO));
    MMWizardActivity.J(this.gsO, paramDialogInterface);
    AppMethodBeat.o(13568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI.6
 * JD-Core Version:    0.6.2
 */