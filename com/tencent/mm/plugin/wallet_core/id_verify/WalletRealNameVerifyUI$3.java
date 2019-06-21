package com.tencent.mm.plugin.wallet_core.id_verify;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletRealNameVerifyUI$3
  implements View.OnClickListener
{
  WalletRealNameVerifyUI$3(WalletRealNameVerifyUI paramWalletRealNameVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46622);
    String str = WalletRealNameVerifyUI.b(this.tvy).getText();
    paramView = WalletRealNameVerifyUI.c(this.tvy).getText();
    WalletRealNameVerifyUI.a(this.tvy, str, paramView);
    AppMethodBeat.o(46622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.3
 * JD-Core Version:    0.6.2
 */