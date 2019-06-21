package com.tencent.mm.plugin.wallet.pwd.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class WalletForgotPwdVerifyIdUI$4
  implements TextWatcher
{
  WalletForgotPwdVerifyIdUI$4(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
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
    AppMethodBeat.i(46309);
    ab.i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveNameext：" + WalletForgotPwdVerifyIdUI.b(this.trW).getText());
    if ((WalletForgotPwdVerifyIdUI.b(this.trW).getText() == null) || ("".equals(WalletForgotPwdVerifyIdUI.b(this.trW).getText().toString())))
      WalletForgotPwdVerifyIdUI.a(this.trW, false);
    while (true)
    {
      WalletForgotPwdVerifyIdUI.g(this.trW);
      AppMethodBeat.o(46309);
      return;
      WalletForgotPwdVerifyIdUI.a(this.trW, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.4
 * JD-Core Version:    0.6.2
 */