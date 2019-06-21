package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class BindMContactIntroUI$26
  implements DialogInterface.OnClickListener
{
  BindMContactIntroUI$26(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13436);
    MMWizardActivity.J(this.grt, new Intent(this.grt, BindMContactStatusUI.class));
    AppMethodBeat.o(13436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.26
 * JD-Core Version:    0.6.2
 */