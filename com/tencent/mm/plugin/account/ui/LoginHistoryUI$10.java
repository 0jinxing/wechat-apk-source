package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;

final class LoginHistoryUI$10
  implements DialogInterface.OnCancelListener
{
  LoginHistoryUI$10(LoginHistoryUI paramLoginHistoryUI, r paramr)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124921);
    g.Rg().c(this.gCx);
    g.Rg().b(255, this.gCv);
    AppMethodBeat.o(124921);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.10
 * JD-Core Version:    0.6.2
 */