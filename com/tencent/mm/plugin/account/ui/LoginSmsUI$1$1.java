package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

final class LoginSmsUI$1$1
  implements DialogInterface.OnClickListener
{
  LoginSmsUI$1$1(LoginSmsUI.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125013);
    this.gCR.gCQ.gCi.dzH();
    LoginSmsUI.a(this.gCR.gCQ, this.gCR.gCQ.gBV);
    AppMethodBeat.o(125013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginSmsUI.1.1
 * JD-Core Version:    0.6.2
 */