package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginIndepPass$4$1
  implements DialogInterface.OnCancelListener
{
  LoginIndepPass$4$1(LoginIndepPass.4 param4, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124971);
    g.Rg().c(this.gBH);
    g.Rg().b(701, this.gCF.gCE);
    g.Rg().b(252, this.gCF.gCE);
    AppMethodBeat.o(124971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.4.1
 * JD-Core Version:    0.6.2
 */