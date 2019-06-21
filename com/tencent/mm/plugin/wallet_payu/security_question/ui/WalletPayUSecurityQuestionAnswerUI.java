package com.tencent.mm.plugin.wallet_payu.security_question.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUSecurityQuestionAnswerUI extends WalletBaseUI
{
  private Button gHn;
  private WalletPayUSecurityQuestionView tUN;
  private WalletFormView tUO;
  private PayUSecurityQuestion tUP;
  private WalletPayUSecurityQuestionAnswerUI.a tUQ;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48581);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.tUP = ((PayUSecurityQuestion)this.mBundle.getParcelable("key_security_question"));
      ab.d("MicroMsg.WalletPayUSecurityQuestionAnswerUI", "hy: updating view");
      if (this.tUP != null)
        this.tUN.setQuestionText(this.tUP.desc);
      this.tUO.cey();
    }
    AppMethodBeat.o(48581);
    return false;
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970354;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48580);
    super.onCreate(paramBundle);
    this.tUQ = new WalletPayUSecurityQuestionAnswerUI.a(this);
    this.tUN = ((WalletPayUSecurityQuestionView)findViewById(2131826511));
    this.tUO = ((WalletFormView)findViewById(2131826512));
    com.tencent.mm.wallet_core.ui.formview.a.g(this.tUO);
    this.gHn = ((Button)findViewById(2131826513));
    this.tUO.setOnInputValidChangeListener(new WalletPayUSecurityQuestionAnswerUI.1(this));
    this.gHn.setOnClickListener(new WalletPayUSecurityQuestionAnswerUI.2(this));
    AppMethodBeat.o(48580);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI
 * JD-Core Version:    0.6.2
 */