package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;

final class LoginUI$20
  implements View.OnClickListener
{
  LoginUI$20(LoginUI paramLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125047);
    paramView = this.gDe.getString(2131305914) + aa.dor();
    LoginUI.S(this.gDe, paramView);
    AppMethodBeat.o(125047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.20
 * JD-Core Version:    0.6.2
 */