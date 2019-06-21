package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;

final class LoginSmsUI$1
  implements View.OnClickListener
{
  LoginSmsUI$1(LoginSmsUI paramLoginSmsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125015);
    h.a(this.gCQ, this.gCQ.getString(2131302306) + this.gCQ.gBV, this.gCQ.getString(2131302307), this.gCQ.getString(2131296994), this.gCQ.getString(2131296868), false, new LoginSmsUI.1.1(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(125014);
        LoginSmsUI.1.this.gCQ.gCi.reset();
        AppMethodBeat.o(125014);
      }
    });
    AppMethodBeat.o(125015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginSmsUI.1
 * JD-Core Version:    0.6.2
 */