package com.tencent.mm.plugin.wallet.pwd.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletForgotPwdVerifyIdUI$5
  implements TextWatcher
{
  WalletForgotPwdVerifyIdUI$5(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(46310);
    if (WalletForgotPwdVerifyIdUI.a(this.trW).getText() != null)
      WalletForgotPwdVerifyIdUI.b(this.trW, true);
    while (true)
    {
      WalletForgotPwdVerifyIdUI.g(this.trW);
      AppMethodBeat.o(46310);
      return;
      WalletForgotPwdVerifyIdUI.b(this.trW, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.5
 * JD-Core Version:    0.6.2
 */