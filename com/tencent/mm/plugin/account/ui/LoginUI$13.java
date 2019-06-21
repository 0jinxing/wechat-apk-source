package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginUI$13
  implements DialogInterface.OnDismissListener
{
  LoginUI$13(LoginUI paramLoginUI)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125040);
    LoginUI.j(this.gDe);
    AppMethodBeat.o(125040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.13
 * JD-Core Version:    0.6.2
 */