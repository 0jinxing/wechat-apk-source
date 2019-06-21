package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class LoginUI$9
  implements View.OnClickListener
{
  LoginUI$9(LoginUI paramLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125034);
    d.H(this.gDe, "login_exdevice", ".ui.LoginAsExDeviceUI");
    this.gDe.overridePendingTransition(2131034226, 2131034130);
    AppMethodBeat.o(125034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.9
 * JD-Core Version:    0.6.2
 */