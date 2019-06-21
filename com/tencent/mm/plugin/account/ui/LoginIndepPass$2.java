package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginIndepPass$2
  implements DialogInterface.OnCancelListener
{
  LoginIndepPass$2(LoginIndepPass paramLoginIndepPass, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124969);
    g.Rg().c(this.gBH);
    AppMethodBeat.o(124969);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.2
 * JD-Core Version:    0.6.2
 */