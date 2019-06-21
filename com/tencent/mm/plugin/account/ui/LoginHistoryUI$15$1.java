package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginHistoryUI$15$1
  implements DialogInterface.OnCancelListener
{
  LoginHistoryUI$15$1(LoginHistoryUI.15 param15, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124924);
    g.Rg().c(this.gBH);
    g.Rg().b(701, this.gCy.gCv);
    g.Rg().b(252, this.gCy.gCv);
    AppMethodBeat.o(124924);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.15.1
 * JD-Core Version:    0.6.2
 */