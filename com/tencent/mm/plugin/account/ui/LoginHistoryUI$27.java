package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;

final class LoginHistoryUI$27
  implements View.OnClickListener
{
  LoginHistoryUI$27(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124934);
    paramView = this.gCv.getString(2131305914) + aa.dor();
    LoginHistoryUI.R(this.gCv, paramView);
    AppMethodBeat.o(124934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.27
 * JD-Core Version:    0.6.2
 */