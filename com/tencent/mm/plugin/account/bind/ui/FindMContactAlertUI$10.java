package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FindMContactAlertUI$10
  implements DialogInterface.OnCancelListener
{
  FindMContactAlertUI$10(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13572);
    if (FindMContactAlertUI.h(this.gsO) != null)
    {
      g.Rg().b(431, FindMContactAlertUI.h(this.gsO));
      FindMContactAlertUI.i(this.gsO);
      FindMContactAlertUI.j(this.gsO);
    }
    AppMethodBeat.o(13572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI.10
 * JD-Core Version:    0.6.2
 */