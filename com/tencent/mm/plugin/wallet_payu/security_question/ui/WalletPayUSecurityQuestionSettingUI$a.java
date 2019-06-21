package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public final class WalletPayUSecurityQuestionSettingUI$a
{
  protected WalletPayUSecurityQuestionSettingUI$a(WalletPayUSecurityQuestionSettingUI paramWalletPayUSecurityQuestionSettingUI)
  {
  }

  private void cTc()
  {
    AppMethodBeat.i(48587);
    if (cTh())
    {
      WalletPayUSecurityQuestionSettingUI.g(this.tUV).setEnabled(true);
      AppMethodBeat.o(48587);
    }
    while (true)
    {
      return;
      WalletPayUSecurityQuestionSettingUI.g(this.tUV).setEnabled(false);
      AppMethodBeat.o(48587);
    }
  }

  protected final boolean cTh()
  {
    AppMethodBeat.i(48588);
    boolean bool;
    if ((WalletPayUSecurityQuestionSettingUI.b(this.tUV).asa()) && (WalletPayUSecurityQuestionSettingUI.c(this.tUV).asa()))
    {
      bool = true;
      AppMethodBeat.o(48588);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48588);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI.a
 * JD-Core Version:    0.6.2
 */