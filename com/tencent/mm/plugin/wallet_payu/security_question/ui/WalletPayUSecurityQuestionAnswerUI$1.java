package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

final class WalletPayUSecurityQuestionAnswerUI$1
  implements WalletFormView.a
{
  WalletPayUSecurityQuestionAnswerUI$1(WalletPayUSecurityQuestionAnswerUI paramWalletPayUSecurityQuestionAnswerUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(48578);
    WalletPayUSecurityQuestionAnswerUI.a locala = WalletPayUSecurityQuestionAnswerUI.a(this.tUR);
    int i;
    if (WalletPayUSecurityQuestionAnswerUI.b(locala.tUR).asa())
    {
      i = 1;
      if (i == 0)
        break label54;
      WalletPayUSecurityQuestionAnswerUI.c(locala.tUR).setEnabled(true);
      AppMethodBeat.o(48578);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label54: WalletPayUSecurityQuestionAnswerUI.c(locala.tUR).setEnabled(false);
      AppMethodBeat.o(48578);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI.1
 * JD-Core Version:    0.6.2
 */