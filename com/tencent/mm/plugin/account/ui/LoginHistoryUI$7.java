package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class LoginHistoryUI$7
  implements View.OnClickListener
{
  LoginHistoryUI$7(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124919);
    d.H(this.gCv, "login_exdevice", ".ui.LoginAsExDeviceUI");
    this.gCv.overridePendingTransition(2131034226, 2131034130);
    AppMethodBeat.o(124919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.7
 * JD-Core Version:    0.6.2
 */