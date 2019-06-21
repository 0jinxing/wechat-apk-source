package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginUI$18
  implements DialogInterface.OnCancelListener
{
  LoginUI$18(LoginUI paramLoginUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125045);
    g.Rg().c(this.gBH);
    g.Rg().b(252, this.gDe);
    g.Rg().b(701, this.gDe);
    AppMethodBeat.o(125045);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.18
 * JD-Core Version:    0.6.2
 */