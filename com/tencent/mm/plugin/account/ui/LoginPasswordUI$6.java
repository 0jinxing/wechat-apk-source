package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginPasswordUI$6
  implements DialogInterface.OnCancelListener
{
  LoginPasswordUI$6(LoginPasswordUI paramLoginPasswordUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125003);
    g.Rg().c(this.gBH);
    this.gCJ.aqW();
    AppMethodBeat.o(125003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginPasswordUI.6
 * JD-Core Version:    0.6.2
 */