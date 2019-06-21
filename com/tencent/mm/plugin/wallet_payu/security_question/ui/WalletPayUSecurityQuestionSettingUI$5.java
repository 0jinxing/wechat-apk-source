package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletPayUSecurityQuestionSettingUI$5
  implements View.OnClickListener
{
  WalletPayUSecurityQuestionSettingUI$5(WalletPayUSecurityQuestionSettingUI paramWalletPayUSecurityQuestionSettingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48586);
    if (WalletPayUSecurityQuestionSettingUI.d(this.tUV).cTh())
    {
      this.tUV.mBundle.putString("key_question_id", WalletPayUSecurityQuestionSettingUI.f(this.tUV));
      this.tUV.mBundle.putString("key_question_answer", WalletPayUSecurityQuestionSettingUI.c(this.tUV).getText());
      a.j(this.tUV, this.tUV.mBundle);
      AppMethodBeat.o(48586);
    }
    while (true)
    {
      return;
      WalletPayUSecurityQuestionSettingUI.a.a(WalletPayUSecurityQuestionSettingUI.d(this.tUV));
      AppMethodBeat.o(48586);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI.5
 * JD-Core Version:    0.6.2
 */