package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class EmailVerifyUI$4
  implements View.OnClickListener
{
  EmailVerifyUI$4(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124762);
    bo.M(this.gAP, EmailVerifyUI.c(this.gAP));
    AppMethodBeat.o(124762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.4
 * JD-Core Version:    0.6.2
 */