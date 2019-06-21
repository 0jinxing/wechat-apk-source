package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;

final class WalletPayUSecurityQuestionSettingUI$2
  implements n.d
{
  WalletPayUSecurityQuestionSettingUI$2(WalletPayUSecurityQuestionSettingUI paramWalletPayUSecurityQuestionSettingUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(48583);
    WalletPayUSecurityQuestionSettingUI.b(this.tUV).setQuestionText(((PayUSecurityQuestion)WalletPayUSecurityQuestionSettingUI.a(this.tUV).get(paramInt)).desc);
    WalletPayUSecurityQuestionSettingUI.a(this.tUV, ((PayUSecurityQuestion)WalletPayUSecurityQuestionSettingUI.a(this.tUV).get(paramInt)).id);
    WalletPayUSecurityQuestionSettingUI.c(this.tUV).cey();
    WalletPayUSecurityQuestionSettingUI.a.a(WalletPayUSecurityQuestionSettingUI.d(this.tUV));
    AppMethodBeat.o(48583);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI.2
 * JD-Core Version:    0.6.2
 */