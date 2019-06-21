package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;

final class EmailVerifyUI$6
  implements MenuItem.OnMenuItemClickListener
{
  EmailVerifyUI$6(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(124764);
    EmailVerifyUI.b(this.gAP, EmailVerifyUI.e(this.gAP).getText());
    if ((!bo.isNullOrNil(EmailVerifyUI.f(this.gAP))) && (EmailVerifyUI.f(this.gAP).length() == 12))
      EmailVerifyUI.a(this.gAP, EmailVerifyUI.f(this.gAP));
    while (true)
    {
      AppMethodBeat.o(124764);
      return true;
      this.gAP.enableOptionMenu(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.6
 * JD-Core Version:    0.6.2
 */