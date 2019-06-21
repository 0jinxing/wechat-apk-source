package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginUI$11$1
  implements DialogInterface.OnCancelListener
{
  LoginUI$11$1(LoginUI.11 param11, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125036);
    g.Rg().c(this.gBH);
    g.Rg().b(701, this.gDf.gDe);
    g.Rg().b(252, this.gDf.gDe);
    AppMethodBeat.o(125036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.11.1
 * JD-Core Version:    0.6.2
 */