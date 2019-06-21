package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;

final class LoginHistoryUI$5
  implements View.OnClickListener
{
  LoginHistoryUI$5(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124917);
    LoginHistoryUI.R(this.gCv, this.gCv.getString(2131306073) + aa.dor());
    AppMethodBeat.o(124917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.5
 * JD-Core Version:    0.6.2
 */