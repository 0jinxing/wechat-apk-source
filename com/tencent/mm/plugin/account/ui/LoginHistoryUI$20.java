package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class LoginHistoryUI$20
  implements n.d
{
  LoginHistoryUI$20(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(124928);
    LoginHistoryUI.a(this.gCv, paramMenuItem.getItemId());
    AppMethodBeat.o(124928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.20
 * JD-Core Version:    0.6.2
 */