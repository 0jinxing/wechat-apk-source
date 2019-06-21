package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginFaceUI$2
  implements DialogInterface.OnCancelListener
{
  LoginFaceUI$2(LoginFaceUI paramLoginFaceUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124910);
    g.Rg().c(this.gBH);
    this.gBG.aqW();
    AppMethodBeat.o(124910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginFaceUI.2
 * JD-Core Version:    0.6.2
 */