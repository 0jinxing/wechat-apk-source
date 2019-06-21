package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletCheckPwdUI$4
  implements View.OnClickListener
{
  WalletCheckPwdUI$4(WalletCheckPwdUI paramWalletCheckPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47335);
    WalletCheckPwdUI.cRA();
    if (WalletCheckPwdUI.e(this.tHs) == 0)
    {
      WalletCheckPwdUI.a(this.tHs, 1);
      WalletCheckPwdUI.f(this.tHs);
    }
    while (true)
    {
      WalletCheckPwdUI.g(this.tHs);
      AppMethodBeat.o(47335);
      return;
      WalletCheckPwdUI.a(this.tHs, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.4
 * JD-Core Version:    0.6.2
 */