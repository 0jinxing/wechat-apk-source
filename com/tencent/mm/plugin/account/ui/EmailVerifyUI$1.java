package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView.a;

final class EmailVerifyUI$1
  implements MMAutoSwitchEditTextView.a
{
  EmailVerifyUI$1(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final void wr(String paramString)
  {
    AppMethodBeat.i(124757);
    this.gAP.enableOptionMenu(true);
    EmailVerifyUI.a(this.gAP, paramString);
    AppMethodBeat.o(124757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.1
 * JD-Core Version:    0.6.2
 */